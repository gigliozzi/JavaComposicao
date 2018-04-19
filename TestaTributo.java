
public class TestaTributo {

	public static void main(String[] args) {
		
		AcaoDaBolsa acao = new AcaoDaBolsa();
		acao.deposita(800);
		
		SeguroDeVida seguro = new SeguroDeVida();
		seguro.deposita(500);
			
		System.out.println(acao.getImposto());
		System.out.println(seguro.getImposto());
		
		
	}

}
