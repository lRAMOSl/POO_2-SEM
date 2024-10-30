package composicao;

public class Bateria{

     private String modelo;
     private String carga;
     private String fabricante;
     private String ano_Fabricacao;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getAno_Fabricacao() {
        return ano_Fabricacao;
    }

    public void setAno_Fabricacao(String ano_Fabricacao) {
        this.ano_Fabricacao = ano_Fabricacao;
    }

    @Override
    public String toString() {
        return "Bateria{" + "modelo=" + modelo + ", carga=" + carga + ", fabricante=" + fabricante + ", ano_Fabricacao=" + ano_Fabricacao + '}';
    }
     
     
     

}