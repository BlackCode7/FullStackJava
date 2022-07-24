package TreinoMusculacaoAPP;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private Long idUser;
	private String nomeUser;
	
	/* Fazer chamada da listagem de serie aqui */
	private List<Serie> listSerie = new ArrayList<Serie>();
		
	public List<Serie> getListSerie() {
		return listSerie;
	}
	
	@Override
	public String toString() {
		return "Usuario [idUser=" + idUser + ", nomeUser=" + nomeUser + "]";
	}
	public Usuario() {
		super();
	}
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getNomeUser() {
		return nomeUser;
	}
	public void setNomeUser(String nomeUser) {
		this.nomeUser = nomeUser;
	}


}
