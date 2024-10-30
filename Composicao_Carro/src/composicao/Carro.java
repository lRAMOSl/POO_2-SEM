package composicao;

public class Carro{

    private String marca, modelo, placa;
    private int ano;
    private float velocidade, peso;
    private int quantidade;        
    private Motor motor;
    private Bateria bateria;
    private Porta portas;
    
    public Carro(){
        
        this.motor = new Motor();
        this.bateria = new Bateria();
        this.portas = new Porta();
    
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Porta getPortas() {
        return portas;
    }

    public void setPortas(Porta portas) {
        this.portas = portas;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", ano=" + ano + ", velocidade=" + velocidade + ", peso=" + peso + ", quantidade=" + quantidade + ", motor=" + motor + ", bateria=" + bateria + ", portas=" + portas + '}';
    }

    
    
    
    public void imprimir(){ 
        
        System.out.println("O " + "\n" + modelo + "\n" + placa + "\n" + ano + "\n" + velocidade + "\n" + peso + "\n" + quantidade + "\n" + motor + "\n" + bateria + "\n" + portas + "\n");
    
    }

    
    

}