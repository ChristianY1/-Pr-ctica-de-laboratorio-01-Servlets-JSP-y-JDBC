package ec.edu.ups.JPA;

import javax.persistence.EntityManager;

import ec.edu.ups.Entidades.Telefono;
import ec.edu.ups.dao.TelefonoDAO;

public class JPATelefono extends JPAGenericDAO<Telefono, Integer> implements TelefonoDAO {

	public JPATelefono() {
		super(Telefono.class);
		// TODO Auto-generated constructor stub
	}
}
