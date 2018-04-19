package control;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Conexao;
import dao.ContaDAO;
import model.Cliente;
import model.Conta;

/**
 * Servlet implementation class ServletDetalheCliente
 */
@WebServlet("/DetalheCliente")
public class ServletDetalheCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDetalheCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			Cliente c = (Cliente)request.getAttribute("cliente");
			System.out.println(c);
			
			Connection conexao = Conexao.getConexao();
			
			ContaDAO cd = new ContaDAO(conexao);

			ArrayList<Conta> contas = cd.getConta(c.getIdCliente());
			
			
			
			request.setAttribute("detalhes", contas);
			
			RequestDispatcher rd = request.getRequestDispatcher("detalheCliente.jsp");
			rd.forward(request, response);
	}

}
