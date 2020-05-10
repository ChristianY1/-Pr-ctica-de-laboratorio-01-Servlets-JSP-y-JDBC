package ec.edu.ups.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.modelo.Usuario;

/**
 * Servlet implementation class SessionController
 */
@WebServlet("/SessionController")
public class SessionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UsuarioDAO usuarioDao;
	private Usuario usuario;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionController() {
        usuarioDao = DAOFactory.getDaoFactory().getUsuarioDAO();
        usuario = new Usuario();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = null;
		usuario.setCorreo(request.getParameter("email")); 
		usuario.setContrasenia(request.getParameter("pass"));
		try {	
			if (usuarioDao.validar(usuario) == 1) {
				HttpSession session = request.getSession(true);
				System.out.println("logeado");
				url = "/JSPs/privado/colorlib-regform-4/pusuario.jsp";
			}else {
				url = "/JSPs/publico/colorlib-regform-4/formulario.jsp";
				System.out.println("no logeado");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		getServletContext().getRequestDispatcher(url).forward(request, response);
		//email
		//pass
//		if (session.isNew()) {
//		System.out.println("sesion iniciada");
//		session.setAttribute("accessos", 1);
//			
//		} 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
