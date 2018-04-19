
public class ImpostoUtil extends ProdutoBancario {

	private double tributo;

	public double getTributo() {
		this.tributo = super.getSaldo() * 0.15 + 25.0;
		return tributo;
	}

}
