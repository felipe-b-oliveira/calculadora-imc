package unigranrio.edu.br.CalculadoraIMC;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TesteCalculadora {

	@BeforeEach
	void setup() {
	}

	@Test
	@DisplayName("21 anos, homem, sem gravidez, 1.6m de altura e 40kg.")
	public void testeAdulto1() {
		Pessoa pes = new Pessoa(21, "Masculino", false, 1.6, 40);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Baixo peso muito grave", resultado);
	}

	@Test
	@DisplayName("21 anos, homem, sem gravidez, 1.6m de altura e 42kg.")
	public void testeAdulto2() {
		Pessoa pes = new Pessoa(21, "Masculino", false, 1.6, 42);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Baixo peso grave", resultado);
	}

	@Test
	@DisplayName("21 anos, homem, sem gravidez, 1.6m de altura e 45kg.")
	public void testeAdulto3() {
		Pessoa pes = new Pessoa(21, "Masculino", false, 1.6, 45);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Baixo peso", resultado);
	}

	@Test
	@DisplayName("21 anos, homem, sem gravidez, 1.6m de altura e 50kg.")
	public void testeAdulto4() {
		Pessoa pes = new Pessoa(21, "Masculino", false, 1.5, 50);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Peso normal", resultado);
	}

	@Test
	@DisplayName("21 anos, homem, sem gravidez, 1.6m de altura e 70kg.")
	public void testeAdulto5() {
		Pessoa pes = new Pessoa(21, "Masculino", false, 1.6, 70);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Sobrepeso", resultado);
	}

	@Test
	@DisplayName("21 anos, homem, sem gravidez, 1.6m de altura e 80kg.")
	public void testeAdulto6() {
		Pessoa pes = new Pessoa(21, "Masculino", false, 1.6, 80);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Obesidade grau I", resultado);
	}

	@Test
	@DisplayName("21 anos, homem, sem gravidez, 1.6m de altura e 90kg.")
	public void testeAdulto7() {
		Pessoa pes = new Pessoa(21, "Masculino", false, 1.6, 90);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Obesidade grau II", resultado);
	}

	@Test
	@DisplayName("21 anos, homem, sem gravidez, 1.6m de altura e 110kg.")
	public void testeAdulto8() {
		Pessoa pes = new Pessoa(21, "Masculino", false, 1.6, 110);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Obesidade grau III (Obesidade mórbida)", resultado);
	}

	@Test
	@DisplayName("64 anos, mulher, sem gravidez, 1.6m de altura e 40kg.")
	public void testeAdulta1() {
		Pessoa pes = new Pessoa(64, "Feminino", false, 1.6, 40);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Baixo peso muito grave", resultado);
	}

	@Test
	@DisplayName("64 anos, mulher, sem gravidez, 1.6m de altura e 42kg.")
	public void testeAdulta2() {
		Pessoa pes = new Pessoa(64, "Feminino", false, 1.6, 42);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Baixo peso grave", resultado);
	}

	@Test
	@DisplayName("64 anos, mulher, sem gravidez, 1.6m de altura e 45kg.")
	public void testeAdulta3() {
		Pessoa pes = new Pessoa(64, "Feminino", false, 1.6, 45);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Baixo peso", resultado);
	}

	@Test
	@DisplayName("64 anos, mulher, sem gravidez, 1.6m de altura e 50kg.")
	public void testeAdulta4() {
		Pessoa pes = new Pessoa(64, "Feminino", false, 1.5, 50);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Peso normal", resultado);
	}

	@Test
	@DisplayName("64 anos, mulher, sem gravidez, 1.6m de altura e 70kg.")
	public void testeAdulta5() {
		Pessoa pes = new Pessoa(64, "Feminino", false, 1.6, 70);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Sobrepeso", resultado);
	}

	@Test
	@DisplayName("64 anos, mulher, sem gravidez, 1.6m de altura e 80kg.")
	public void testeAdulta6() {
		Pessoa pes = new Pessoa(64, "Feminino", false, 1.6, 80);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Obesidade grau I", resultado);
	}

	@Test
	@DisplayName("64 anos, mulher, sem gravidez, 1.6m de altura e 90kg.")
	public void testeAdulta7() {
		Pessoa pes = new Pessoa(64, "Feminino", false, 1.6, 90);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Obesidade grau II", resultado);
	}

	@Test
	@DisplayName("64 anos, mulher, sem gravidez, 1.6m de altura e 110kg.")
	public void testeAdulta8() {
		Pessoa pes = new Pessoa(64, "Feminino", false, 1.6, 110);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Obesidade grau III (Obesidade mórbida)", resultado);
	}

	@Test
	@DisplayName("21 anos, mulher, grávida, 1.6m de altura e 40kg.")
	public void testeAdultaGravida1() {
		Pessoa pes = new Pessoa(21, "Feminino", true, 1.6, 40);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Baixo peso", resultado);
	}

	@Test
	@DisplayName("21 anos, mulher, grávida, 1.6m de altura e 50kg.")
	public void testeAdultaGravida2() {
		Pessoa pes = new Pessoa(21, "Feminino", true, 1.6, 50);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Peso normal", resultado);
	}

	@Test
	@DisplayName("21 anos, mulher, grávida, 1.6m de altura e 70kg.")
	public void testeAdultaGravida3() {
		Pessoa pes = new Pessoa(21, "Feminino", true, 1.6, 70);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Sobrepeso", resultado);
	}

	@Test
	@DisplayName("21 anos, mulher, grávida, 1.6m de altura e 80kg.")
	public void testeAdultaGravida4() {
		Pessoa pes = new Pessoa(21, "Feminino", true, 1.6, 80);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Obesidade", resultado);
	}

	@Test
	@DisplayName("19 anos, menina, grávida, 1.6m de altura e 40kg.")
	public void testeMeninaGravida1() {
		Pessoa pes = new Pessoa(19, "Feminino", true, 1.6, 40);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Baixo peso", resultado);
	}

	@Test
	@DisplayName("19 anos, menina, grávida, 1.6m de altura e 50kg.")
	public void testeMeninaGravida2() {
		Pessoa pes = new Pessoa(19, "Feminino", true, 1.6, 50);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Peso normal", resultado);
	}

	@Test
	@DisplayName("19 anos, menina, grávida, 1.6m de altura e 70kg.")
	public void testeMeninaGravida3() {
		Pessoa pes = new Pessoa(19, "Feminino", true, 1.6, 70);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Sobrepeso", resultado);
	}

	@Test
	@DisplayName("19 anos, menina, grávida, 1.6m de altura e 90kg.")
	public void testeMeninaGravida4() {
		Pessoa pes = new Pessoa(19, "Feminino", true, 1.6, 90);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Obesidade", resultado);
	}

	@Test
	@DisplayName("66 anos, idosa, grávida, 1.6m de altura e 40kg.")
	public void testeIdosaGravida1() {
		Pessoa pes = new Pessoa(66, "Feminino", true, 1.6, 40);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Baixo peso", resultado);
	}

	@Test
	@DisplayName("66 anos, idosa, grávida, 1.6m de altura e 50kg.")
	public void testeIdosaGravida2() {
		Pessoa pes = new Pessoa(66, "Feminino", true, 1.6, 50);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Peso normal", resultado);
	}

	@Test
	@DisplayName("66 anos, idosa, grávida, 1.6m de altura e 70kg.")
	public void testeIdosaGravida3() {
		Pessoa pes = new Pessoa(66, "Feminino", true, 1.6, 70);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Sobrepeso", resultado);
	}

	@Test
	@DisplayName("66 anos, idosa, grávida, 1.6m de altura e 90kg.")
	public void testeIdosaGravida4() {
		Pessoa pes = new Pessoa(66, "Feminino", true, 1.6, 90);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Obesidade", resultado);
	}

	@Test
	@DisplayName("21 anos, homem, com gravidez, 1.6m de altura e 80kg.")
	public void testeHomemGravidez() {
		Pessoa pes = new Pessoa(21, "Masculino", true, 1.6, 80);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Não é possível ter gravidez no sexo masculino", resultado);
	}

	@Test
	@DisplayName("19 anos, menino, com gravidez, 1.6m de altura e 80kg.")
	public void testeMeninoGravidez() {
		Pessoa pes = new Pessoa(19, "Masculino", true, 1.6, 80);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Não é possível ter gravidez no sexo masculino", resultado);
	}

	@Test
	@DisplayName("66 anos, idoso, com gravidez, 1.6m de altura e 80kg.")
	public void testeIdosoGravidez() {
		Pessoa pes = new Pessoa(66, "Masculino", true, 1.6, 80);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Não é possível ter gravidez no sexo masculino", resultado);
	}

	@Test
	@DisplayName("66 anos, idosa, sem gravidez, 1.7m de altura e 40kg.")
	public void testeIdosa1() {
		Pessoa pes = new Pessoa(66, "Feminino", false, 1.7, 40);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Baixo peso", resultado);
	}

	@Test
	@DisplayName("66 anos, idosa, sem gravidez, 1.7m de altura e 70kg.")
	public void testeIdosa2() {
		Pessoa pes = new Pessoa(66, "Feminino", false, 1.7, 70);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Peso normal", resultado);
	}

	@Test
	@DisplayName("66 anos, idosa, sem gravidez, 1.7m de altura e 80kg.")
	public void testeIdosa3() {
		Pessoa pes = new Pessoa(66, "Feminino", false, 1.7, 80);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Sobrepeso", resultado);
	}

	@Test
	@DisplayName("66 anos, idosa, sem gravidez, 1.7m de altura e 100kg.")
	public void testeIdosa4() {
		Pessoa pes = new Pessoa(66, "Feminino", false, 1.7, 100);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Obesidade grau I", resultado);
	}

	@Test
	@DisplayName("66 anos, idosa, sem gravidez, 1.7m de altura e 110kg.")
	public void testeIdosa5() {
		Pessoa pes = new Pessoa(66, "Feminino", false, 1.7, 110);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Obesidade grau II", resultado);
	}

	@Test
	@DisplayName("66 anos, idosa, sem gravidez, 1.7m de altura e 130kg.")
	public void testeIdosa6() {
		Pessoa pes = new Pessoa(66, "Feminino", false, 1.7, 130);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Obesidade grau III (Obesidade mórbida)", resultado);
	}

	@Test
	@DisplayName("66 anos, idoso, sem gravidez, 1.7m de altura e 40kg.")
	public void testeIdoso1() {
		Pessoa pes = new Pessoa(66, "Masculino", false, 1.7, 40);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Baixo peso", resultado);
	}

	@Test
	@DisplayName("66 anos, idoso, sem gravidez, 1.7m de altura e 70kg.")
	public void testeIdoso2() {
		Pessoa pes = new Pessoa(66, "Masculino", false, 1.7, 70);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Peso normal", resultado);
	}

	@Test
	@DisplayName("66 anos, idoso, sem gravidez, 1.7m de altura e 80kg.")
	public void testeIdoso3() {
		Pessoa pes = new Pessoa(66, "Masculino", false, 1.7, 80);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Sobrepeso", resultado);
	}

	@Test
	@DisplayName("66 anos, idoso, sem gravidez, 1.7m de altura e 100kg.")
	public void testeIdoso4() {
		Pessoa pes = new Pessoa(66, "Masculino", false, 1.7, 100);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Obesidade grau I", resultado);
	}

	@Test
	@DisplayName("66 anos, idoso, sem gravidez, 1.7m de altura e 110kg.")
	public void testeIdoso5() {
		Pessoa pes = new Pessoa(66, "Masculino", false, 1.7, 110);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Obesidade grau II", resultado);
	}

	@Test
	@DisplayName("66 anos, idoso, sem gravidez, 1.7m de altura e 130kg.")
	public void testeIdoso6() {
		Pessoa pes = new Pessoa(66, "Masculino", false, 1.7, 130);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Obesidade grau III (Obesidade mórbida)", resultado);
	}

	@Test
	@DisplayName("19 anos, menino, sem gravidez, 1.6m de altura e 50kg.")
	public void testeMenino1() {
		Pessoa pes = new Pessoa(19, "Masculino", false, 1.6, 30);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Baixo peso", resultado);
	}

	@Test
	@DisplayName("19 anos, menino, sem gravidez, 1.6m de altura e 50kg.")
	public void testeMenino2() {
		Pessoa pes = new Pessoa(19, "Masculino", false, 1.6, 50);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Peso normal", resultado);
	}

	@Test
	@DisplayName("19 anos, menino, sem gravidez, 1.6m de altura e 70kg.")
	public void testeMenino3() {
		Pessoa pes = new Pessoa(19, "Masculino", false, 1.6, 70);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Sobrepeso", resultado);
	}

	@Test
	@DisplayName("19 anos, menino, sem gravidez, 1.6m de altura e 90kg.")
	public void testeMenino4() {
		Pessoa pes = new Pessoa(19, "Masculino", false, 1.6, 90);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Obesidade", resultado);
	}

	@Test
	@DisplayName("19 anos, menina, sem gravidez, 1.6m de altura e 40kg.")
	public void testeMenina1() {
		Pessoa pes = new Pessoa(19, "Feminino", false, 1.6, 40);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Baixo peso", resultado);
	}

	@Test
	@DisplayName("19 anos, menina, sem gravidez, 1.6m de altura e 50kg.")
	public void testeMenina2() {
		Pessoa pes = new Pessoa(19, "Feminino", false, 1.6, 50);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Peso normal", resultado);
	}

	@Test
	@DisplayName("19 anos, menina, sem gravidez, 1.6m de altura e 70kg.")
	public void testeMenina3() {
		Pessoa pes = new Pessoa(19, "Feminino", false, 1.6, 70);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Sobrepeso", resultado);
	}

	@Test
	@DisplayName("19 anos, menina, sem gravidez, 1.6m de altura e 90kg.")
	public void testeMenina4() {
		Pessoa pes = new Pessoa(19, "Feminino", false, 1.6, 90);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Obesidade", resultado);
	}

	@Test
	@DisplayName("-10 anos, homem, sem gravidez, 1.6m de altura e 80kg.")
	public void testeIdadeInvalidaMasculino() {
		Pessoa pes = new Pessoa(-10, "Masculino", false, 1.6, 80);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Valores inválidos quanto a idade inseridos", resultado);
	}

	@Test
	@DisplayName("-10 anos, mulher, sem gravidez, 1.6m de altura e 80kg.")
	public void testeIdadeInvalidaFeminino() {
		Pessoa pes = new Pessoa(-10, "Feminino", false, 1.6, 80);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Valores inválidos quanto a idade inseridos", resultado);
	}

	@Test
	@DisplayName("15 anos, menino inválido, sem gravidez, 1.6m de altura e 80kg.")
	public void testeMeninoInvalido() {
		Pessoa pes = new Pessoa(15, "Menino", false, 1.6, 80);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Valores inválidos quanto ao sexo inseridos", resultado);
	}

	@Test
	@DisplayName("15 anos, menina inválida, sem gravidez, 1.6m de altura e 80kg.")
	public void testeMeninInvalido() {
		Pessoa pes = new Pessoa(15, "Menina", false, 1.6, 80);
		double imc = pes.calculaImc();
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Valores inválidos quanto ao sexo inseridos", resultado);
	}

}
