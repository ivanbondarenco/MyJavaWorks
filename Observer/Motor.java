package trabajo.poo.observer;

public class Motor implements Observador{

	public Motor() {};
	@Override
	public void update() {
		//Acción a realizar despues de que se entera qe el acelerador se esta pisando  	
		System.out.println("Subir potencia, velocidad y revoluciones");
		
	}

}
