package templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioRegularTest {

    @Test
    void deveRetonarRegular() {
        FuncionarioRegular funcionarioRegular = new FuncionarioRegular();
        funcionarioRegular.setHorasTrabalhadas(100);
        funcionarioRegular.setSalarioBase(3000.0f);
        assertEquals("Regular", funcionarioRegular.verificarDesempenho());
    }

    @Test
    void deveRetonarExcelente() {
        FuncionarioRegular funcionarioRegular = new FuncionarioRegular();
        funcionarioRegular.setHorasTrabalhadas(335);
        funcionarioRegular.setSalarioBase(3000.0f);
        assertEquals("Excelente", funcionarioRegular.verificarDesempenho());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioRegular funcionarioRegular = new FuncionarioRegular();
        funcionarioRegular.setHorasTrabalhadas(335);
        funcionarioRegular.setSalarioBase(3000.0f);
        funcionarioRegular.setNome("Leonardo");
        assertEquals("Funcionario{nome='Leonardo', salário=8900.0, desempenho='Excelente'}", funcionarioRegular.getInfo());
    }
}