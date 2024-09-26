package trabajo1.poo3;

public class fabricaVolkswagen extends fabricaAuto{

	@Override
	public Auto crearAuto() {
		return new Gol(); 
	}

}
