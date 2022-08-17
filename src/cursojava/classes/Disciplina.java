package cursojava.classes;

import java.util.Arrays;
import java.util.Objects;

public class Disciplina {

	private double[] nota1 = new double[4];
	private String disciplina1;

	public double[] getNota1() {
		return nota1;
	}

	public void setNota1(double[] nota1) {
		this.nota1 = nota1;
	}

	public String getDisciplina1() {
		return disciplina1;
	}

	public void setDisciplina1(String disciplina1) {
		this.disciplina1 = disciplina1;
	}

	/* Método que trabalha com arrays */
	public double getMediaNotas() {		
		double somaTotal = 0;		
		for ( int pos = 0; pos<nota1.length; pos++) {
			somaTotal += nota1[pos];
		}
		return somaTotal/4;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(nota1);
		result = prime * result + Objects.hash(disciplina1);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina1, other.disciplina1) && Arrays.equals(nota1, other.nota1);
	}

	@Override
	public String toString() {
		return "Disciplina [nota1=" + nota1 + ", disciplina1=" + disciplina1 + "]";
	}

}
