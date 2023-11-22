package templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioExcelenteTest {

    @Test
    void deveRetonarExcelente() {
        FuncionarioExcelente funcionarioExcelente = new FuncionarioExcelente();
        funcionarioExcelente.setHorasTrabalhadas(445);
        funcionarioExcelente.setSalarioBase(3000.0f);
        assertEquals("Excelente", funcionarioExcelente.verificarDesempenho());
    }

    @Test
    void deveRetonarRegular() {
        FuncionarioExcelente funcionarioExcelente = new FuncionarioExcelente();
        funcionarioExcelente.setHorasTrabalhadas(335);
        funcionarioExcelente.setSalarioBase(3000.0f);
        assertEquals("Regular", funcionarioExcelente.verificarDesempenho());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioExcelente funcionarioExcelente = new FuncionarioExcelente();
        funcionarioExcelente.setHorasTrabalhadas(335);
        funcionarioExcelente.setSalarioBase(3000.0f);
        funcionarioExcelente.setNome("Leonardo");
        assertEquals("Funcionario{nome='Leonardo', salário=8900.0, desempenho='Regular'}", funcionarioExcelente.getInfo());
    }
}