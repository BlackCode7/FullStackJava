package HerancaJavaPessoaAlunoDiretorSecretario.interfaces;

/* Interface será o contrato de autenticação */
public interface PermitirAcesso {
	
	/* Definindo login e senha para secretário */
	public boolean autenticar(String login, String senha);
	public boolean autenticar();
	

}
