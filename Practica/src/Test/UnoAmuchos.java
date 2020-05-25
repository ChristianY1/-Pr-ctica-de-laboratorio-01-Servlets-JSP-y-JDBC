package Test;

import ec.edu.ups.Entidades.Telefono;
import ec.edu.ups.Entidades.Usuario;
import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.dao.UsuarioDAO;

public class UnoAmuchos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsuarioDAO  user = DAOFactory.getDaoFactory().getUsuarioDAO();
		
		Usuario us = new Usuario("0106691736", "Christian", "Yunga", "ychristian@est.ups.edu.ec", "123");
		Telefono t = new Telefono(0, "0939514731", "celular", "movisar", us);
		
		us.addTelefonos(t);
		user.create(us);
	}

}
