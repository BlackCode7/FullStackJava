package HerancaJavaPessoaAlunoDiretorSecretario;

import HerancaJavaPessoaAlunoDiretorSecretario.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso{
	
	private int registro;
	private String nivelCargo;
	private String experiencia;
	
	/* Definindo login e senha para secretário */
	private String login;
	private String senha;	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNascim() {
		return dataNascim;
	}
	public void setDataNascim(String dataNascim) {
		this.dataNascim = dataNascim;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getNumeroCPF() {
		return numeroCPF;
	}
	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}
	public String getNomeMAE() {
		return nomeMAE;
	}
	public void setNomeMAE(String nomeMAE) {
		this.nomeMAE = nomeMAE;
	}
	public String getNomePAI() {
		return nomePAI;
	}
	public void setNomePAI(String nomePAI) {
		this.nomePAI = nomePAI;
	}
	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public double salario() {
		return 1800.00 * 0.9;
	}
	
	@Override
	public boolean autenticar() {
		/* testa se login e senha são iguais a admin */
		return login.equals("admin") && senha.equals("admin");
		
	}

}










