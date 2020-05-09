package ec.edu.ups.test;

import ec.edu.ups.dao.DAOFactory;

import ec.edu.ups.dao.UsuarioDAO;

import ec.edu.ups.modelo.Usuario;

public class TestUser {
	public static void main(String[] args) {
		UsuarioDAO userDAO = DAOFactory.getDaoFactory().getUsuarioDAO();
		

		userDAO.createTable();

		Usuario u1, u2, u3, u4;
		u1 = new Usuario("223", "sd", "dsd", "dssdsd", "sdsd");
		u2 = new Usuario("2123", "sd", "dsd", "dssdsd", "sdsd");
		u3 = new Usuario("2223", "sd", "dsd", "dssdsd", "sdsd");

		

		userDAO.create(u1);
		userDAO.create(u2);
		userDAO.create(u3);

	
		

	


	}
}
