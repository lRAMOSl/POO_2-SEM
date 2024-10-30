package Holerite;

public class HoleriteDetalhado {

    public double salarioBase;
    public double horasExtras;
    public double bonus;
    public double ganhosTotais;
    public double descontoINSS;
    public double descontoIRPF;
    public double descontoValeTransporte;
    public double descontoValeRefeicao;
    public double descontoConvenioMedico;
    public double descontoValeAlimentacao;
    public double totalDescontos;
    public double salarioLiquido;

    public HoleriteDetalhado(
            double salarioBase, double horasExtras, double bonus, double ganhosTotais,
            double descontoINSS, double descontoIRPF, double descontoValeTransporte,
            double descontoValeRefeicao, double descontoConvenioMedico,
            double descontoValeAlimentacao, double totalDescontos, double salarioLiquido) {

        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
        this.bonus = bonus;
        this.ganhosTotais = ganhosTotais;
        this.descontoINSS = descontoINSS;
        this.descontoIRPF = descontoIRPF;
        this.descontoValeTransporte = descontoValeTransporte;
        this.descontoValeRefeicao = descontoValeRefeicao;
        this.descontoConvenioMedico = descontoConvenioMedico;
        this.descontoValeAlimentacao = descontoValeAlimentacao;
        this.totalDescontos = totalDescontos;
        this.salarioLiquido = salarioLiquido;
    }
}
