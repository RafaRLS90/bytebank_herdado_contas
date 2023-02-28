package bytebank_herdado_contas;

public class CalculadorDeImposto {
	
	private double  totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();	
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
	
}
