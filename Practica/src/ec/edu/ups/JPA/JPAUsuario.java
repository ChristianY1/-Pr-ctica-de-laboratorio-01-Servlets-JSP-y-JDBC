package ec.edu.ups.JPA;

import javax.persistence.EntityManager;

import ec.edu.ups.Entidades.Usuario;
import ec.edu.ups.dao.UsuarioDAO;

public class JPAUsuario extends JPAGenericDAO<Usuario, String> implements UsuarioDAO{

	public JPAUsuario() {
		super(Usuario.class);
		// TODO Auto-generated constructor stub
	}

	

	

}
