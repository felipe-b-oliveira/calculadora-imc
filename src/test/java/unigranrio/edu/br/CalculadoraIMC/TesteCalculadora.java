package unigranrio.edu.br.CalculadoraIMC;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TesteCalculadora {

	@Test
	@DisplayName("21 anos, homem, sem gravidez, 1.8m de altura e 90kg.")
	public void test1() {		
		Pessoa pes = new Pessoa(21, "Masculino", false, 1.8, 90);
		double imc = pes.calculaImc(90, 1.8);
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Sobrepeso", resultado);
	}
	
	@Test
	@DisplayName("21 anos, mulher, sem gravidez, 1.8m de altura e 90kg.")
	public void test2() {		
		Pessoa pes = new Pessoa(21, "Feminino", false, 1.8, 90);
		double imc = pes.calculaImc(90, 1.8);
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Sobrepeso", resultado);
	}
	
	@Test
	@DisplayName("19 anos, menino, sem gravidez, 1.6m de altura e 50kg.")
	public void test3() {		
		Pessoa pes = new Pessoa(19, "Masculino", false, 1.6, 50);
		double imc = pes.calculaImc(50, 1.6);
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Peso normal", resultado);
	}
	
	@Test
	@DisplayName("19 anos, menina, sem gravidez, 1.6m de altura e 50kg.")
	public void test4() {		
		Pessoa pes = new Pessoa(19, "Feminino", false, 1.6, 50);
		double imc = pes.calculaImc(50, 1.6);
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Peso normal", resultado);
	}
	
	@Test
	@DisplayName("66 anos, senhora, sem gravidez, 1.7m de altura e 80kg.")
	public void test5() {		
		Pessoa pes = new Pessoa(66, "Feminino", false, 1.7, 80);
		double imc = pes.calculaImc(80, 1.7);
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Sobrepeso", resultado);
	}
	
	@Test
	@DisplayName("66 anos, senhor, sem gravidez, 1.7m de altura e 80kg.")
	public void test6() {		
		Pessoa pes = new Pessoa(66, "Masculino", false, 1.7, 80);
		double imc = pes.calculaImc(80, 1.7);
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Sobrepeso", resultado);
	}
	
	@Test
	@DisplayName("21 anos, mulher, grávida, 1.6m de altura e 80kg.")
	public void test7() {		
		Pessoa pes = new Pessoa(21, "Feminino", true, 1.6, 80);
		double imc = pes.calculaImc(80, 1.6);
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Obesidade", resultado);
	}
	
	@Test
	@DisplayName("21 anos, homem, com gravidez, 1.6m de altura e 80kg.")
	public void test8() {		
		Pessoa pes = new Pessoa(21, "Masculino", true, 1.6, 80);
		double imc = pes.calculaImc(80, 1.6);
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Não é possível ter gravidez no sexo masculino", resultado);
	}
	
	@Test
	@DisplayName("-10 anos, homem, sem gravidez, 1.6m de altura e 80kg.")
	public void test9() {		
		Pessoa pes = new Pessoa(-10, "Masculino", false, 1.6, 80);
		double imc = pes.calculaImc(80, 1.6);
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Valores inválidos quanto a idade inseridos", resultado);
	}
	
	@Test
	@DisplayName("-10 anos, mulher, sem gravidez, 1.6m de altura e 80kg.")
	public void test10() {		
		Pessoa pes = new Pessoa(-10, "Feminino", false, 1.6, 80);
		double imc = pes.calculaImc(80, 1.6);
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Valores inválidos quanto a idade inseridos", resultado);
	}
	
	@Test
	@DisplayName("15 anos, menino inválido, sem gravidez, 1.6m de altura e 80kg.")
	public void test11() {		
		Pessoa pes = new Pessoa(15, "Menino", false, 1.6, 80);
		double imc = pes.calculaImc(80, 1.6);
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Valores inválidos quanto ao sexo inseridos", resultado);
	}
	
	@Test
	@DisplayName("15 anos, menina inválida, sem gravidez, 1.6m de altura e 80kg.")
	public void test12() {		
		Pessoa pes = new Pessoa(15, "Menina", false, 1.6, 80);
		double imc = pes.calculaImc(80, 1.6);
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Valores inválidos quanto ao sexo inseridos", resultado);
	}	

}
