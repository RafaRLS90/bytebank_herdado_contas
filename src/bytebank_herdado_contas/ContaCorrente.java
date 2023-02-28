package bytebank_herdado_contas;

public class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(int agencia, int numero) {
        super(agencia , numero);
    }
    
   @Override
public void depositar(double valor) {
	super.saldo += valor;
	
}
    
    @Override
    public boolean sacar(double valor) {
    	// TODO Auto-generated method stub
    	double valorASacar = valor + 0.2;
    	return super.sacar(valorASacar);
    }

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
}
