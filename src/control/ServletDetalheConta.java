package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDAO;
import dao.Conexao;
import dao.ContaDAO;
import model.Cliente;
import model.Conta;

/**
 * Servlet implementation class ServletDetalheConta
 */
@WebServlet("/detalheConta")
public class ServletDetalheConta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDetalheConta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//PrintWriter out = response.getWriter();

		//out.println("<html><head><link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\" integrity=\"sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4\" crossorigin=\"anonymous\"></head><body>");

		int id = Integer.parseInt(request.getParameter("idconta"));
		//String nomecliente = request.getParameter("nomecliente");
		//String numeroconta = request.getParameter("numeroconta");
		//String agenciaconta = request.getParameter("agenciaconta");
		//String tipoconta = request.getParameter("tipoconta");
		
		//request.setAttribute("d", contas);
		
		//RequestDispatcher rd = request.getRequestDispatcher("detalheConta.jsp");
		//rd.forward(request, response);

		//out.println("<p class=\"lead\" >" + numeroconta + agenciaconta + tipoconta + "</p>");
		
		
		//out.println("</body>");
		
		//Conta c = (Conta)request.getAttribute("conta");
		//System.out.println(c);
		
		Connection conexao = Conexao.getConexao();
		
		ContaDAO cd = new ContaDAO(conexao);
		//ClienteDAO cld = new ClienteDAO(conexao);

		Conta c = cd.getdetalheConta(id);
		//Cliente cl = cld.getCliente(nomecliente);
		
		
		request.setAttribute("conta", c);
		//request.setAttribute("cliente", cl);
		
		RequestDispatcher rd = request.getRequestDispatcher("detalheConta.jsp");
		rd.forward(request, response);
	}

}
