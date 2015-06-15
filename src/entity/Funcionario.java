package entity;

public class Funcionario {
	
	private Integer	codigo;
	private String	nome;
	private String	email;
	private Double 	salario;
	
	
	
	public Funcionario() {
		super();
	}
	public Funcionario(Integer codigo, String nome, String email, Double salario) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.salario = salario;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Funcionario [codigo=" + codigo + ", nome=" + nome + ", email="
				+ email + ", salario=" + salario + "]";
	}
	
	
	
}
