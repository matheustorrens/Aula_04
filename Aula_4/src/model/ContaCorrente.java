package model;

public class ContaCorrente extends Conta{
	private double ValorTaxa;

	ContaCorrente(String email) {
		super(email);
		this.ValorTaxa = ValorTaxa;
		// TODO Auto-generated constructor stub
	}
	
	public String Saque (double valorSaque) {
		if(valorSaque <= saldo) {
		saldo =- valorSaque;
		saldo =- ValorTaxa;
		return (
				"Valor Sacado: " + valorSaque
				+"\nValor Saldo Após o Saque: " 
				+ saldo
				);
		}else{
			return "Saldo insuficiente";
		}
		
	}
	
	public String Deposito(double ValorDepositado) {
		saldo += ValorDepositado;
		return ("Valor Sacado: " + ValorDepositado	
				+"\nValor Saldo Após o Saque: "
				+ saldo);
		
	}
	
	public double getSaldo() { 
	}

}
