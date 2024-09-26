package trabajo1.poo3;

public abstract class Auto {
private double nivelNafta;
    
    public Auto(){
    this.nivelNafta = 0;
    }
    
    public void cargar(double cantidadCarga){
    nivelNafta += cantidadCarga;
    }
    
    public double getNafta(){
    return this.nivelNafta;
    }
    
    public abstract void encender();

}
