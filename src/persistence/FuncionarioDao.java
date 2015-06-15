package persistence;

import java.util.Date;



import entity.Funcionario;
import entity.FuncionarioCLT;

public class FuncionarioDao extends Dao {
	
	public void createFuncionario(Funcionario f) throws Exception{
		open();
		stmt = con.
			prepareStatement("insert into funcionario values (?,?,?,?)");
			stmt.setInt(1, f.getCodigo());
			stmt.setString(2, f.getNome());
			stmt.setString(3, f.getEmail());
			stmt.setDouble(4, f.getSalario());
		stmt.execute();
		stmt.close();
		close();
		
	}
	
	public void createFuncionarioCLT(FuncionarioCLT f) throws Exception{
		open();
		stmt = con.
				prepareStatement("insert into funcionario values (?,?,?,?)");
				stmt.setInt(1, f.getCodigo());
				stmt.setString(2, f.getNome());
				stmt.setString(3, f.getEmail());
				stmt.setDouble(4, f.getSalario());
			stmt.execute();
			stmt.close();
			
		stmt = con.
			prepareStatement("insert into funcionarioclt values (?,?)");
			stmt.setInt(1, f.getCodigo());
			stmt.setDate(2,new java.sql.Date(new Date().getDate()));
		
		stmt.execute();
		stmt.close();
		close();
	}
	
	
}
