package edu.anabeatriz.java.escopo;

public class Conta {
	//Variavel da classe
	double saldo = 10.0;
	
	public void sacar(Double valor) {
		//Variavel local do método
		double novoSaldo = saldo - valor;
	}

	public void imprimirSaldo(){
		//Disponível em toda classe
		System.out.println(saldo);
		//Somente o método sacar conhece esta variavel
		//System.out.println(novoSaldo);
	
	}

    //Escopo de fluxo
	public double calcularDividaExponencial(){
		//Variável local de método
		double valorParcela = 50.0;
		double valorMontante = 0.0;
		for(int x=1; x<=5; x++) {//x: variável de escopo de fluxo
			//esta variável será reiniciada a cada execução for
			double valorCalculado = valorParcela * x;
			valorMontante = valorMontante + valorCalculado;
		}
		//x e valorCalculado nunca estarão disponíveis fora do for
		return valorMontante;
	}
}
