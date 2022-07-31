package HerancaJavaPessoaAlunoDiretorSecretario.classesAuxiliares;

import HerancaJavaPessoaAlunoDiretorSecretario.interfaces.PermitirAcesso;

/* So recebe quem tem contrato da interface */
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;

	public boolean autenticar( PermitirAcesso acesso ) {
		return acesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
	
}
