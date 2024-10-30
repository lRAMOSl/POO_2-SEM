package calculadora;

public class Calculadora{
    
    private Double A;
    private Double B;
    private Double resultado;

    public Double getA() {
        return A;
    }

    public void setA(Double A) {
        this.A = A;
    }

    public Double getB() {
        return B;
    }

    public void setB(Double B) {
        this.B = B;
    }
    
    public Double somar(){
        
        return this.A + this.B;
    
    }
    
    
    

}
