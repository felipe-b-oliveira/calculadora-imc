package unigranrio.edu.br.CalculadoraIMC;

import java.text.DecimalFormat;

public class Calculadora {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###,##0.00");
		
		//Idade | Sexo | Grávida? | Altura | Peso
		Pessoa pes = new Pessoa(20, "Masculino", false, 1.70, 80);
		
		//Peso | Altura
		double imc = pes.calculaImc(90, 1.8);
		
		System.out.println(df.format(imc));
		System.out.println(pes.classificaImcGeral(imc));
	}

}
