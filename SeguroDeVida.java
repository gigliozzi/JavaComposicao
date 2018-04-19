
public class SeguroDeVida extends ProdutoBancario implements Tributavel {

	private double tributo;

	@Override
	public double getImposto() {
		return this.tributo = super.getSaldo() * 0.15 + 150.0;
	}

}
