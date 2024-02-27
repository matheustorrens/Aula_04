package model;
import model.ContaCorrente;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente conta = new ContaCorrente(null);
		
		
		JOptionPane.showMessageDialog(null, conta.saldo);
	}

}
