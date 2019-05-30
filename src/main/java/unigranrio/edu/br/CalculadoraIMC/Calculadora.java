package unigranrio.edu.br.CalculadoraIMC;

import java.text.DecimalFormat;

public class Calculadora {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("###,##0.00");

		// Idade | Sexo | Grávida? | Altura | Peso
		Pessoa pes = new Pessoa(10, "Masculino", false, 1.50, 75);

		// Peso | Altura
		double imc = pes.calculaImc(75, 1.5);

		System.out.println(df.format(imc));
		System.out.println(pes.classificaImcGeral(imc));
	}

}
