package unPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Lector {
	private double [] vector;
	private double [][] matriz;
	
	public Lector(String path) throws FileNotFoundException{
		Scanner sc = new Scanner(new File(path));
		sc.useLocale(Locale.ENGLISH);
		vector = new double[sc.nextInt()];
		matriz = new double[vector.length][vector.length];
		int i = 0;

		while(sc.hasNextLine() && i<(Math.pow(matriz.length, 2))){
			matriz[sc.nextInt()][sc.nextInt()] = sc.nextDouble();;
			i++;
		}
		i=0;
		while(sc.hasNextDouble()){
			vector[i] = sc.nextDouble();
			i++;
		}
		sc.close();
	}
	
	public void mostrarMatriz() {
		System.out.println("Matriz: ");
		for (int j = 0; j < matriz.length; j++) {
			System.out.println(Arrays.toString(matriz[j]));
		}
	}
	public void mostrarVector() {
		System.out.println("Vector = " + Arrays.toString(vector));
	}

	public double[] getVector() {
		return vector;
	}

	public double[][] getMatriz() {
		return matriz;
	}
	

}
