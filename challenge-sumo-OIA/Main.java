package oia2010;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		Programa programita = new Programa();
		programita.leerArchivo("sources/sumos.in");
		programita.escribirArchivo();
	}


}
