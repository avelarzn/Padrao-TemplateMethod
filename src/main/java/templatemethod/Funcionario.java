package templatemethod;

public abstract class Funcionario {

    protected String nome;
    private float salarioBase;
    private int horasTrabalhadas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public float calcularSalario() {
        // Exemplo simples de cálculo de salário: salário base + horas extras
        float salario = this.salarioBase + (this.horasTrabalhadas - 40) * 20; // considerando um valor fixo por hora extra
        return salario < this.salarioBase ? this.salarioBase : salario; // garante que o salário nunca seja menor que o base
    }

    public abstract String verificarDesempenho();

    public String getTipo() {
        return "Funcionario";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "nome='" + this.nome + '\'' +
                ", salário=" + this.calcularSalario() +
                ", desempenho='" + this.verificarDesempenho() + '\'' +
                '}';
    }
}

