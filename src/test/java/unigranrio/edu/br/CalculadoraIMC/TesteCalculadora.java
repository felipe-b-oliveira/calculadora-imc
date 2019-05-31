package unigranrio.edu.br.CalculadoraIMC;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TesteCalculadora {

	@Test
	@DisplayName("23 anos, homem, sem gravidez, 1.8m de altura e 90kg.")
	public void test1() {		
		Pessoa pes = new Pessoa(23, "Masculino", false, 1.8, 90);
		double imc = pes.calculaImc(90, 1.8);
		String resultado = pes.classificaImcGeral(imc);
		Assertions.assertEquals("Sobrepeso", resultado);
	}

}
