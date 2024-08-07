package controller;

public class SomaNaturaisController {
	public SomaNaturaisController() {
		super();
	}
	
	public int somaNaturais(int n) {
		if (n == 0) {return 0;}
		//A condição de que com números negativos a função retorna 0, no enunciado.
		else {
			n = n - 1;
			return n + somaNaturais(n);
			//O conjunto dos números naturais começa em 0, portanto o primeiro número seria 0. Se N receber 10, o décimo número seria 9 e assim por diante.
		}
	}
	
}
