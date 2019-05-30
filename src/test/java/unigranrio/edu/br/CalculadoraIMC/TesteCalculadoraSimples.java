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
}