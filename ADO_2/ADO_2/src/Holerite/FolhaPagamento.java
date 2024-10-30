package Holerite;
import Funcionario.Funcionario;

public class FolhaPagamento {

    public static HoleriteDetalhado calcularHolerite(Funcionario funcionario) {
        double ganhosTotais = Ganhos.calcularGanhosTotais(funcionario);

        double descontoINSS = Descontos.calcularINSS(funcionario.getSalario());
        double descontoIRPF = Descontos.calcularIRPF(funcionario.getSalario());
        double descontoValeTransporte = Descontos.calcularValeTransporte(funcionario);
        double descontoValeRefeicao = Descontos.calcularValeRefeicao(funcionario);
        double descontoConvenioMedico = Descontos.calcularConvenioMedico(funcionario);
        double descontoValeAlimentacao = Descontos.calcularValeAlimentacao(funcionario);

        double totalDescontos = descontoINSS + descontoIRPF + descontoValeTransporte + descontoValeRefeicao
                + descontoConvenioMedico + descontoValeAlimentacao;

        double salarioLiquido = ganhosTotais - totalDescontos;

        return new HoleriteDetalhado(
            funcionario.getSalario(),
            funcionario.getHorasExtras(),
            funcionario.getBonus(),
            ganhosTotais,
            descontoINSS,
            descontoIRPF,
            descontoValeTransporte,
            descontoValeRefeicao,
            descontoConvenioMedico,
            descontoValeAlimentacao,
            totalDescontos,
            salarioLiquido
        );
    }
}
