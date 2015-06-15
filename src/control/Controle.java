package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.FuncionarioDao;
import entity.Funcionario;
import entity.FuncionarioCLT;

/**
 * Servlet implementation class Controle
 */
@WebServlet("/Controle")
public class Controle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		if (cmd.equalsIgnoreCase("gravar")){
			gravar(request,response);
		}
	}
	
	protected void gravar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try{
			String  tipo = request.getParameter("tipo");
			FuncionarioCLT f= new FuncionarioCLT();
				f.setCodigo(new Integer(request.getParameter("codigo")));
				f.setNome(request.getParameter("nome"));
				f.setEmail(request.getParameter("email"));
				f.setSalario(new Double(request.getParameter("salario")));
				FuncionarioDao funcdao = new FuncionarioDao();
				if (tipo.equalsIgnoreCase("funcionario")){
					
					funcdao.createFuncionario(f);
				}else if(tipo.equalsIgnoreCase("funcionarioclt")){
					funcdao.createFuncionarioCLT(f);
				}
				response.getWriter().print("Dados gravador do funcionario");
		}catch(Exception e){
			response.getWriter().print("Erro :" + e.getMessage());
		}
		
	}
	

}
