package oia2010;

public class Sumo {
@Override
	public String toString() {
		return "Sumo [peso=" + peso + ", altura=" + altura + "]";
	}
private int peso;
private int altura;
public Sumo(int peso, int altura) {
	this.peso = peso;
	this.altura = altura;
}

public int getPeso() {
	return this.peso;
}
public int getAltura() {
	return this.altura;
}
}
