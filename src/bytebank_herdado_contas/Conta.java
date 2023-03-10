package bytebank_herdado_contas;

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("o total de contas é " + Conta.total);
		
		 if(agencia < 1) {
	            throw new IllegalArgumentException("Agencia inválida");
	        }
		 //Não ter números negativos para registro de agência.
	        if(numero < 1) {
	            throw new IllegalArgumentException("Numero da conta inválido");
	        }
	      //Não ter números negativos para registro de numero.
		this.agencia = agencia;
		this.numero = numero;
		//this.saldo = 100;
		//System.out.println("estou criando uma conta" + this.numero);
	}
	
	public abstract void depositar(double valor);
	
	
	public void sacar(double valor)  throws SaldoInsuficienteException{
	
		if(this.saldo < valor) {
		//problema
		throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor" + valor);
	 }
		this.saldo -= valor;
	}
	
	public void transferir(double valor, Conta destino) throws SaldoInsuficienteException{
		this.sacar(valor); 
		destino.depositar(valor);
		
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("nao pode, valor menor ou igual a 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("nao pode valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}
