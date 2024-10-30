package composicao;

public class Motor {

    private String modelo;
    private String potencia;
    private String fabricante;
    private int qtde_cilindros;
    private int volume;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getQtde_cilindros() {
        return qtde_cilindros;
    }

    public void setQtde_cilindros(int qtde_cilindros) {
        this.qtde_cilindros = qtde_cilindros;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Motor{" + "modelo=" + modelo + ", potencia=" + potencia + ", fabricante=" + fabricante + ", qtde_cilindros=" + qtde_cilindros + ", volume=" + volume + '}';
    }
    
    

}
