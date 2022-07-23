package PrincipiosDoSOLID;

public class PrincipiosDoSOLID {

	public static void main(String[] args) {
		
		ContaBancaria bancaria = new ContaBancaria();
		bancaria.setDescricao("Conta bancária do Anderson");

		System.out.println(bancaria);
		
		bancaria.diminui100Reias();
		bancaria.diminui100Reias();
		System.out.println(bancaria);
		
		bancaria.soma100Reais();
		bancaria.soma100Reais();
		bancaria.soma100Reais();
		System.out.println(bancaria);
		
		bancaria.depositoDinheiro(120.00);
		bancaria.depositoDinheiro(120.00);
		bancaria.depositoDinheiro(120.00);
		System.out.println(bancaria);
		
		
	}

}
