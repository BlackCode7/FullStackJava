package PrincipiosDoSOLID;

public class ContaBancaria {
	
	private String descricao;
	private double saldo = 8000;
	
	/* criando metodo da classe conta bancária */
	public void soma100Reais() {
		this.saldo += 100;
	}
	
	public void diminui100Reias() {
		saldo -= 100;
	}
	
	public void sacarDinheiro( double saque ) {
		saldo -= saque;
	}
	
	public void depositoDinheiro( double deposito ) {
		saldo += deposito;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "ContaBancaria [descricao=" + descricao + ", saldo=" + saldo + "]";
	}
	
	
}
