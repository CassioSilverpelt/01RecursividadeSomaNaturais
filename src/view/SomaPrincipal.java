package view;
import javax.swing.JOptionPane;
import controller.SomaNaturaisController;

public class SomaPrincipal {
	public static void main (String[] args) {
		SomaNaturaisController soma = new SomaNaturaisController();
		int num = Integer.parseInt(JOptionPane.showInputDialog("Escreva uma quantidade de números naturais a partir do zero: "));
		System.out.println(soma.somaNaturais(num));
	}
}
