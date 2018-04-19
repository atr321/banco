package control;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDAO;
import dao.Conexao;
import model.Cliente;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/login")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//Recuperar os parametros
		String cpfCliente = request.getParameter("cpfcliente");
		String senhaCliente = request.getParameter("senhacliente");
		
		//obter o objeto de retorno
		//PrintWriter out = response.getWriter();
		//out.println("<head><link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\" integrity=\"sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4\" crossorigin=\"anonymous\"></head><body>");
		
		//Obter uma conexao com o BD
		Connection conexao = Conexao.getConexao();
		
		//Instanciar objeto ClienteDAO
		ClienteDAO cd = new ClienteDAO(conexao);
		
		//Verificar se o usuario é valido
		if(cd.isCliente(cpfCliente, senhaCliente)) {
			//obter cliente
			Cliente c = cd.getCliente(cpfCliente, senhaCliente);
			
			//criar um atributo novo
			request.setAttribute("cliente", c);
			
			//Repassar o request/response para o JSP
			RequestDispatcher rd = request.getRequestDispatcher("DetalheCliente");
			
			rd.forward(request, response);
			
			
			
			//out.println("<div class=\"alert alert-primary\" role=\"alert\"> Oi "+ c.getNomeCliente() +"</div>");
		}else {
			
			RequestDispatcher rd = request.getRequestDispatcher("loginErro.jsp");
			
			rd.forward(request, response);
			
			
			
			
			//out.println("Cliente invalido!");
		}
		
	}
	
	
	
	

}
