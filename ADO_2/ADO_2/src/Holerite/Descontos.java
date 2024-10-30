package Holerite;
import Funcionario.Funcionario;
public class Descontos {

    
    public static double calcularINSS(double salario) {

        if (salario <= 1320.00) {
            return salario * 0.075;

        } else if (salario <= 2571.29) {
            return salario * 0.09;

        }

        return salario * 0.11;

    }

    public static double calcularIRPF(double salario) {
        if (salario <= 1903.00) {
            return 0;

        } else if (salario <= 2826.65) {
            return salario * 0.075;

        }

        return salario * 0.275;

    }

    public static double calcularValeTransporte(Funcionario funcionario) {
        if (funcionario.isUtilizaValeTransporte()) {
            return funcionario.getSalario() * 0.06;

        }

        return 0;

    }

    public static double calcularValeRefeicao(Funcionario funcionario) {
        if (funcionario.getSalario() <= 1320.00) {
            return 0;

        }

        return funcionario.getSalario() * 0.03;

    }

    public static double calcularConvenioMedico(Funcionario funcionario) {
        if (funcionario.getSalario() <= 1320.00) {
            return 0;

        }

        return funcionario.getSalario() * 0.02;

    }

    public static double calcularValeAlimentacao(Funcionario funcionario) {
        if (funcionario.getSalario() > 3960.00) {
            return funcionario.getSalario() * 0.02;

        }

        return 0;

    }
}
