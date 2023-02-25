package bytebank_herdado_contas;

public class ContaCorrente extends Conta {
    public ContaCorrente(int agencia, int numero) {
        super(agencia , numero);
    }
    
    @Override
    public boolean sacar(double valor) {
    	// TODO Auto-generated method stub
    	double valorASacar = valor + 0.2;
    	return super.sacar(valorASacar);
    }
}
