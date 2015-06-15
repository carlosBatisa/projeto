package entity;

import java.util.Date;

public class FuncionarioCLT  extends Funcionario{
	
	private Date dataContrato;
	
	public FuncionarioCLT(Integer codigo, String nome, String email,
			Double salario, Date dataContrato) {
		super(codigo, nome, email, salario);
		this.dataContrato = dataContrato;
	}


	public FuncionarioCLT() {
		super();
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	@Override
	public String toString() {
		return "FuncionarioCLT [dataContrato=" + dataContrato + "]";
	}
	
	
	
}
