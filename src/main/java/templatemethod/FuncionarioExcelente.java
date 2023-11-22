package templatemethod;

public class FuncionarioExcelente extends Funcionario{

    public String verificarDesempenho() {
        if (this.calcularSalario() >= 10000.0f) {
            return "Excelente";
        }
        else {
            return "Regular";
        }
    }
}
