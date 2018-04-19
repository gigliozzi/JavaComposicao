
public class AcaoDaBolsa extends ProdutoBancario implements Tributavel {

	private ImpostoUtil calculador;
	
	public AcaoDaBolsa() {
		this.calculador = new ImpostoUtil();
	}

	@Override
	public double getImposto() {
		return this.calculador.getTributo();
	}

}
