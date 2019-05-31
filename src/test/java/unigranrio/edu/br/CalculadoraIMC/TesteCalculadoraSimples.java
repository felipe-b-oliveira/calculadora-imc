package unigranrio.edu.br.CalculadoraIMC;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TesteCalculadoraSimples {

	CalculadoraSimples calc = new CalculadoraSimples();

	@Test
	@DisplayName("Testando o método somar.")
	public void testSomar() {
		double resultado = calc.somar(10.0, 2.0);
		Assertions.assertEquals(12.0, resultado);
		
	}
	
	@Test
	@DisplayName("Testando o método subtrair.")
	public void testSubtrair() {
		double resultado = calc.subtrair(10.0, 2.0);
		Assertions.assertEquals(8.0, resultado);
		
	}
	
	@Test
	@DisplayName("Testando o método multiplicar.")
	public void testMultiplicar() {
		double resultado = calc.multiplicar(10.0, 2.0);
		Assertions.assertEquals(20.0, resultado);
		
	}
	
	@Test
	@DisplayName("Testando o método dividir.")
	public void testDividir() {
		double resultado = calc.dividir(10.0, 2.0);
		Assertions.assertEquals(5.0, resultado);
		
	}
}