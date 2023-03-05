package bytebank_herdado_contas;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		
		conta.depositar(200.0);
		conta.sacar(210.0);
		
		System.out.println(conta.getSaldo());
	}

}
