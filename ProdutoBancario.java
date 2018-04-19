
public abstract class ProdutoBancario {
	private int numero;
	private double saldo;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public double getSaldo() {
		return this.saldo;
	}

}
