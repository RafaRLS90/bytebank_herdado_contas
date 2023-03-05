package bytebank_herdado_contas;

public class SaldoInsuficienteException extends RuntimeException {
	public SaldoInsuficienteException(String msg) {
	super(msg);
	}
}
