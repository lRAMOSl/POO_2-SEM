package Funcionario;

public class Funcionario extends Pessoa {
    private double salario;
    private double horasExtras;
    private double bonus;
    private boolean utilizaValeTransporte;

    public Funcionario(String nome, double salario, double horasExtras, double bonus, boolean utilizaValeTransporte) {
        super(nome);
        this.salario = salario;
        this.horasExtras = horasExtras;
        this.bonus = bonus;
        this.utilizaValeTransporte = utilizaValeTransporte;
    }

    public Funcionario(String nome, double salario) {
        super(nome);
        this.salario = salario;
        this.horasExtras = 0;
        this.bonus = 0;
        this.utilizaValeTransporte = false; 
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public boolean isUtilizaValeTransporte() {
        return utilizaValeTransporte;
    }

    public void setUtilizaValeTransporte(boolean utilizaValeTransporte) {
        this.utilizaValeTransporte = utilizaValeTransporte;
    }
}
