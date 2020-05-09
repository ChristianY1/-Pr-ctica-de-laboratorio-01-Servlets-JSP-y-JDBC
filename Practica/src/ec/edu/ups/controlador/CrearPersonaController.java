package ec.edu.ups.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.GenericDAO;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.mysql.jdbc.JDBCGenericDAO;
import ec.edu.ups.mysql.jdbc.JDBCUsuarioDAO;

/**
 * Servlet implementation class CrearPersonaController
 */
@WebServlet("/CrearPersonaController")
public class CrearPersonaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UsuarioDAO usuarioDao;
	private Usuario usuario;
	
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearPersonaController() {
    	usuarioDao = DAOFactory.getDaoFactory().getUsuarioDAO();
    	usuario = new Usuario();
    	
    	
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = null;
		
		try {
			usuario.setCedula(request.getParameter("cedula"));
			usuario.setNombre(request.getParameter("first_name"));
			usuario.setApellido(request.getParameter("last_name"));
			usuario.setContrasenia(request.getParameter("password"));
			usuario.setCorreo(request.getParameter("email"));
			usuarioDao.create(usuario);
			System.out.println("hecho!");
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
			
			
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
