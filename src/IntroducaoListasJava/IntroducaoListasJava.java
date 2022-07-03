package IntroducaoListasJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IntroducaoListasJava {

	/* São usadas para armazenar uma quantidade grande de objetos */

	List lista = new ArrayList();

	@Override
	public String toString() {
		return "IntroducaoListasJava [lista=" + lista + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(lista);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IntroducaoListasJava other = (IntroducaoListasJava) obj;
		return Objects.equals(lista, other.lista);
	}

	public List getLista() {
		return lista;
	}

	public void setLista(List lista) {
		this.lista = lista;
	}

	public static void main(String[] args) {

	}

}
