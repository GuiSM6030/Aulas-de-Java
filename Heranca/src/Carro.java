public class Carro extends Veiculo{

	private boolean quatroPortas;
	
	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		
		this.quatroPortas = quatroPortas;
		
	}

	@Override
	public void imprimirDados() {
		// TODO Auto-generated method stub
		super.imprimirDados();
		System.out.println("quantidade de portas"+quatroPortas);
	}
}
