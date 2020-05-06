package ec.edu.ups.mysql.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;

public class JDBCTelefonoDAO extends JDBCGenericDAO<Telefono, Integer> implements TelefonoDAO{

	@Override
	public void createTable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Telefono telefono) {
		// TODO Auto-generated method stub
		conexionUno.update("INSERT Telefono VALUES (" + telefono.getCodigo() +", '"
													  + telefono.getNumero() + ", '"
													  + telefono.getTipo() + ", '"
													  + telefono.getOperadora() + ", '"
													  + telefono.getUsuario().getCedula() + ")");
	}

	@Override
	public Telefono read(Integer id) {
		// TODO Auto-generated method stub
		Telefono telefono = null;
		ResultSet rsTelefono = conexionUno.query("SELECT * FROM Telefono WHERE id=" + id);
		try {
			if (rsTelefono != null && rsTelefono.next()) {
				telefono = new Telefono(rsTelefono.getInt("tel_codigo"),
										 rsTelefono.getString("tel_numero"),
										 rsTelefono.getString("tel_tipo"),
										 rsTelefono.getString("tel_operadora"));
				ResultSet rsUser = conexionDos.query("SELECT * FROM usuario WHERE usu_cedula=" + rsTelefono.getString("usuario_usu_cedula"));
			if (rsUser != null && rsUser.next()) {
				Usuario user = new Usuario(rsUser.getString("usu_cedula"),
											rsUser.getString("usu_nombre"),
											rsUser.getString("usu_apellido"),
											rsUser.getString("usu_correo"),
											rsUser.getString("usu_contrasenia"));
				telefono.setUsuario(user);
			}
				
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(">>>WARNING (JDBCUserDetailDAO:read): " + e.getMessage());
		}
		if (telefono == null) {
			return telefono;
		}
		return null;
	}

	@Override
	public void update(Telefono telefono) {
		// TODO Auto-generated method stub
		conexionDos.update("UPDATE Telefono SET tel_codigo = '" + telefono.getNumero() +
												"', tel_tipo = '"  + telefono.getTipo() + 
												"', tel_operadora = '" + telefono.getOperadora() + 
												"' WHERE tel_codigo =" + telefono.getCodigo() );
		
	}

	@Override
	public void delete(Telefono telefono) {
		// TODO Auto-generated method stub
		conexionUno.update("DELETE FROM Telefono WHERE tel_codigo = " + telefono.getCodigo());
		
	}

	@Override
	public List<Telefono> find() {
		// TODO Auto-generated method stub
		List<Telefono> list = new ArrayList<Telefono>();
		ResultSet rs = conexionUno.query("SELECT * FROM Telefono");
		try {
			while (rs.next()) {
				list.add(new Telefono(rs.getInt("tel_codigo"),
									  rs.getString("tel_numero"),
									  rs.getString("tel_tipo"),
									  rs.getString("tel_operadora")));			
				
			}
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(">>>WARNING (JDBCTelefonoDAO:find): " + e.getMessage());
		}
		return list;
	}

}