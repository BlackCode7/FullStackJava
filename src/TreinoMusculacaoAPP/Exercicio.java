package TreinoMusculacaoAPP;

public class Exercicio {
	
	private Long idExercicio;
	private String nomeExercicio; //Nome do exercício feito tipo: triceps pullover, rosca direta etc
	private Long numeroRepeticao; //quantas vezes o peso é levantado
	private Long cargaKgExercicio; //peso usado durante o exercício
	private Long numeroSerie; //número de repetições do campo numeroRepeticao, tipo numeroSerie x numeroRepeticao 
	private Long cargaGeralTrabalho; // multiplicação dos campos ( numeroRepeticao*cargaKgExercicio*numeroSerie )  
	
	public Exercicio() {
		super();
	}
	
	@Override
	public String toString() {
		return "Exercicio [idExercicio=" + idExercicio + ", nomeExercicio=" + nomeExercicio + ", numeroRepeticao="
				+ numeroRepeticao + ", cargaKgExercicio=" + cargaKgExercicio + ", numeroSerie=" + numeroSerie
				+ ", cargaGeralTrabalho=" + cargaGeralTrabalho + "]";
	}

	public Long getCargaGeralTrabalho() {
		this.cargaGeralTrabalho = Long.valueOf(multCargaGeralTrabalho());
		return cargaGeralTrabalho;
	}

	public void setCargaGeralTrabalho(Long cargaGeralTrabalho) {
		this.cargaGeralTrabalho = cargaGeralTrabalho;
	}
	
	private Long multCargaGeralTrabalho() {
		long result = numeroRepeticao*cargaKgExercicio*numeroSerie;
		return result;
	}

	public Long getIdExercicio() {
		return idExercicio;
	}
	public void setIdExercicio(Long idExercicio) {
		this.idExercicio = idExercicio;
	}
	public String getNomeExercicio() {
		return nomeExercicio;
	}
	public void setNomeExercicio(String nomeExercicio) {
		this.nomeExercicio = nomeExercicio;
	}
	public Long getNumeroRepeticao() {
		return numeroRepeticao;
	}
	public void setNumeroRepeticao(Long numeroRepeticao) {
		this.numeroRepeticao = numeroRepeticao;
	}
	public Long getCargaKgExercicio() {
		return cargaKgExercicio;
	}
	public void setCargaKgExercicio(Long cargaKgExercicio) {
		this.cargaKgExercicio = cargaKgExercicio;
	}
	public Long getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(Long numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

}
