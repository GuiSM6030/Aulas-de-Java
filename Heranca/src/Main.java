
public class Main {
	public static void main(String[] args) {

		Carro carro1 = new Carro();

		carro1.ano = 1936;
		carro1.setMarca("Mercedez");
		carro1.setModelo("IMC5");
		carro1.setQuatroPortas(true);
		
		carro1.imprimirDados();
	}
}
