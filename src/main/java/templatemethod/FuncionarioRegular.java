package templatemethod;

public class FuncionarioRegular extends Funcionario{

    public String verificarDesempenho() {
        if (this.calcularSalario() <= 5000.0f) {
            return "Regular";
        }
        else {
            return "Excelente";
        }
    }
}
