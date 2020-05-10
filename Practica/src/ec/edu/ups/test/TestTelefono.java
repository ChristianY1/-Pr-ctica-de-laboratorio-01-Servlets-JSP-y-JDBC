package ec.edu.ups.test;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;

public class TestTelefono {
	public static void main(String[] args) {
		UsuarioDAO userDAO = DAOFactory.getDaoFactory().getUsuarioDAO();
		TelefonoDAO telefonoDao = DAOFactory.getDaoFactory().getTelefonoDAO();

		//userDAO.createTable();
		
	
//
		Usuario u1;
		u1 = new Usuario("2234", "sd", "dsd", "dssdsd", "sdsd");
//		u2 = new Usuario("2123", "sd", "dsd", "dssdsd", "sdsd");
//		u3 = new Usuario("2223", "sd", "dsd", "dssdsd", "sdsd");
		
		Telefono t1;
		t1 = new Telefono(0, "09183781", "celular", "movistar");
		
		
		t1.setUsuario(u1);
		u1.setTelefono(t1);
		
		userDAO.create(u1);
		
		
		telefonoDao.create(t1);
		
		
		

		
//
//		userDAO.create(u1);
//		userDAO.create(u2);
//		userDAO.create(u3);

	
		

	


	}
}
