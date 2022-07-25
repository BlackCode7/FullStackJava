package TreinoMusculacaoAPP;

import java.util.ArrayList;
import java.util.List;

public class Serie {
	
	private Long idSerie;
	private String nomeSerie;
	
	/* Fazer chamada da lista de exercícios aqui */
	private List<Exercicio> listExercicio = new ArrayList<Exercicio>();
	
	public List<Exercicio> getListExercicio() {
		return listExercicio;
	}
	
	public Serie() {
		super();
	}
	@Override
	public String toString() {
		return "Serie [idSerie=" + idSerie +  ", nomeSerie=" + nomeSerie + "]";
	}
	
	
	/* Trabalhando com listas */
	public Long getIdSerie() {			
		return idSerie;
	}
	
	
	public void setIdSerie(Long idSerie) {
		this.idSerie = idSerie;
	}
	
	
	public String getNomeSerie() {
		return nomeSerie;
	}
	public void setNomeSerie(String nomeSerie) {
		this.nomeSerie = nomeSerie;
	}

}
