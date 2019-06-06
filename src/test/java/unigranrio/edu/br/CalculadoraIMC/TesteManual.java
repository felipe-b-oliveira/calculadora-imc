package unigranrio.edu.br.CalculadoraIMC;

import java.text.DecimalFormat;

public class TesteManual {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("###,##0.00");

		// Idade | Sexo | Grávida? | Altura | Peso
		Pessoa pes = new Pessoa(64, "Feminino", false, 1.6, 40);

		// Peso | Altura
		double imc = pes.calculaImc();

		System.out.println("IMC: " + df.format(imc));
		System.out.println("Classificação: " + pes.classificaImcGeral(imc));

	}

}
