package trabajo.poo.observer;

public class Main {
	
	
	public static void main(String[] args) {
	
		Motor v6 = new Motor();
		
		Acelerador a = new Acelerador();
		
		a.enlazarObservador(v6);		
		a.pisarAcelerador();
	
	}
}
