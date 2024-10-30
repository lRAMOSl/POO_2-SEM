package Holerite;
import Funcionario.Funcionario;
public class Ganhos {

    public static double calcularGanhosTotais(Funcionario funcionario) {

        double totalGanhos = funcionario.getSalario() + funcionario.getHorasExtras() + funcionario.getBonus();
        return totalGanhos;

    }

}