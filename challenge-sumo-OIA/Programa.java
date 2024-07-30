package oia2010;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

public class Programa {
List <Sumo> lista = new LinkedList<Sumo>();
int cantidadSumos;
int [] contadores;
public void leerArchivo(String archivo) throws IOException {
	String linea;
	int peso;
	int altura;
	
	FileReader fr = new FileReader(archivo);
	BufferedReader br = new BufferedReader(fr);
	
	String [] datos;
	linea = br.readLine();
	while(linea != null) {
		datos = linea.split(" ");
       if(Integer.parseInt(datos[0]) > 0 && Integer.parseInt(datos[1]) > 0) {
    	   peso = Integer.parseInt(datos[0]);
    	   altura = Integer.parseInt(datos[1]);
			Sumo sumaux = new Sumo(peso, altura);
			System.out.println(sumaux);
			lista.add(sumaux);
		
		}
    
       linea = br.readLine();
	}
	System.out.println(lista.size());
	fr.close();
}
public void escribirArchivo() throws FileNotFoundException {
	int contador = 0;
	int [] luchadores = new int [10];
	for(int j = 0; j < lista.size(); j++) {
		
		for(int i = 0; i < lista.size(); i++) {
			
		if (lista.get(j).getAltura() > lista.get(i).getAltura() && lista.get(j).getPeso() > lista.get(i).getPeso()) {
			contador++;
			luchadores[j] = contador;
		}else if(lista.get(j).getAltura() == lista.get(i).getAltura() && lista.get(j).getPeso() > lista.get(i).getPeso()) {
			contador++;
			luchadores[j] = contador;
		}
		else if(lista.get(j).getPeso() == lista.get(i).getPeso() && lista.get(j).getAltura() > lista.get(i).getAltura()) {
			contador++;
			luchadores[j] = contador;
		}
	
		}
		
		contador = 0;
	}


	
	
	for(int i = 0; i < luchadores.length; i++) {
		PrintWriter pr = new PrintWriter(new File("almacenamiento.out"));
		pr.println(luchadores[i]);
		pr.close();

	}
	
	
}
}
