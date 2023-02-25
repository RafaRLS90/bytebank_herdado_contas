package bytebank_herdado_contas;

public class TesteContas {
		public static void main(String[] args) {
			ContaCorrente cc = new ContaCorrente(111, 111);
			cc.depositar(100.0);
			
			ContaPoupanca cp = new ContaPoupanca(222, 222);
			cp.depositar(200.0);
		}
	
	
}
