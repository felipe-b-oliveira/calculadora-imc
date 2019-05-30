package unigranrio.edu.br.CalculadoraIMC;

public class Pessoa {

	private int idade;
	private String sexo;
	private boolean gravida;
	private double altura;
	private double peso;

	public Pessoa(int idade, String sexo, boolean gravida, double altura, double peso) {
		this.idade = idade;
		this.sexo = sexo;
		this.altura = altura;
		this.peso = peso;
		this.gravida = gravida;
	}

	public double calculaImc(double peso, double altura) {
		double imc = this.peso / (Math.pow(this.altura, 2));
		return imc;
	}

	/*public double calculaPercentilMeninos(double imc) {

		double percentil;

		percentil = 3;
		percentil = 5;
		percentil = 10;
		percentil = 25;
		percentil = 50;
		percentil = 75;
		percentil = 85;
		percentil = 90;
		percentil = 95;
		percentil = 97;

		return percentil;

	}*/

	/*public double calculaPercentilMeninas(double imc) {

		double percentil;
		
		if (idade <= 2)
		percentil = 3;
		percentil = 5;
		percentil = 10;
		percentil = 25;
		percentil = 50;
		percentil = 75;
		if (this.peso == 27.68 && this.idade == 20)
		percentil = 85;
		percentil = 90;
		percentil = 95;
		if (this.peso == 27.68 && this.idade == 20)
		percentil = 97;

		return percentil;

	}*/

	public String classificaImcCriancas(double percentil) {

		String classificador = "IMC não classificado";
		if (this.sexo.compareToIgnoreCase("Feminino") == 0 && this.idade <= 2) {

			if (percentil < 5)
				classificador = "Baixo peso";
			else if (percentil <= 85)
				classificador = "Peso normal";
			else if (percentil <= 95)
				classificador = "Sobrepeso";
			else 
				classificador = "Obesidade";
		}

		return classificador;
	}

	public String classificaImcHomensIdosos(double imc) {

		String classificador = "IMC não classificado";
		if (this.sexo.compareToIgnoreCase("Masculino") == 0 && this.idade > 65) {

			if (imc < 21.9)
				classificador = "Baixo peso";
			else if (imc <= 27)
				classificador = "Peso normal";
			else if (imc <= 30)
				classificador = "Sobrepeso";
			else if (imc <= 35)
				classificador = "Obesidade grau I";
			else if (imc <= 39.9)
				classificador = "Obesidade grau II";
			else
				classificador = "Obesidade grau III (Obesidade mórbida)";
		}

		return classificador;
	}

	public String classificaImcMulheresIdosas(double imc) {

		String classificador = "IMC não classificado";
		if (this.sexo.compareToIgnoreCase("Feminino") == 0 && this.idade > 65) {

			if (imc < 21.9)
				classificador = "Baixo peso";
			else if (imc <= 27)
				classificador = "Peso normal";
			else if (imc <= 32)
				classificador = "Sobrepeso";
			else if (imc <= 37)
				classificador = "Obesidade grau I";
			else if (imc <= 41.9)
				classificador = "Obesidade grau II";
			else
				classificador = "Obesidade grau III (Obesidade mórbida)";
		}

		return classificador;
	}

	public String classificaImcMulherGravida(double imc) {

		String classificador = "IMC não classificado";
		if (this.sexo.compareToIgnoreCase("Feminino") == 0 && this.gravida == true) {

			if (imc < 18.5)
				classificador = "Baixo peso";
			else if (imc <= 24.9)
				classificador = "Peso normal";
			else if (imc <= 29.9)
				classificador = "Sobrepeso";
			else
				classificador = "Obesidade";
		}

		return classificador;
	}

	public String classificaImcGeral(double imc) {

		String classificador = "IMC não classificado";
		if (this.idade >= 20 && this.idade <= 65) {

			if (imc < 16)
				classificador = "Baixo peso muito grave";
			else if (imc <= 16.99)
				classificador = "Baixo peso grave";
			else if (imc <= 18.49)
				classificador = "Baixo peso";
			else if (imc <= 24.99)
				classificador = "Peso normal";
			else if (imc <= 29.99)
				classificador = "Sobrepeso";
			else if (imc <= 34.99)
				classificador = "Obesidade grau I";
			else if (imc <= 39.99)
				classificador = "Obesidade grau II";
			else
				classificador = "Obesidade grau III (Obesidade mórbida)";
		}

		return classificador;
	}

}
