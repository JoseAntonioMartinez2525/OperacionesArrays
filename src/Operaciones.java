import java.io.ObjectInputStream.GetField;
import java.util.Random;
import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] numeros;
		int[] vector;
		int op, dato;
		numeros=OperacionesArrays.crearArreglo(10);
		vector=OperacionesArrays.crearArregloMas(20,10,1);
		
		
		

		do {
			System.out.println("<====================================================>");		
			System.out.println("Operaciones con arreglos");
			System.out.println("Ingrese:    \n1.Imprimir 	\n2.maximo	\n3.minimo	\n4.Promedio"
					+ "\n5.Comprobar iguales	\n6.Pares	");
			System.out.print("opcion: ");
			op=in.nextInt();
			System.out.println("<====================================================>");
				switch (op) {
				case 1: 
					
					imprimir(numeros);
					break;
					
				case 2:
					imprimir(numeros);
					maximo(numeros);
					break;
					
				case 3:
					imprimir(numeros);
					minimo(numeros);
					break;				
				case 4:
					
					promedio(vector);
					break;
				case 5:
					comprobar(numeros, vector);
					break;
				case 6:
					 
					pares(numeros);
					 
					 break;
				default:
					break;
				}
			} while (op<7);

			

		} 
	public static int maximo(int arreglo[]) {
		int mayor = arreglo[0];
		
		for (int x = 1; x < arreglo.length; x++) {
			if (arreglo[x] > mayor) {
				mayor = arreglo[x];
			}
		}
		System.out.println("El mayor es: " + mayor);
		return mayor;
	}
	

public static int minimo(int arreglo[]) {
	int menor = arreglo[0];
	for (int x = 1; x < arreglo.length; x++) {
		if (arreglo[x] < menor) {
			menor = arreglo[x];
		}
	}
	System.out.println("El menor es: " + menor);
	return menor;	
}
	public static void imprimir(int[]arreglo) {
		
		for (int j = 0; j < arreglo.length; j++) {
			System.out.println("["+j+"] : "+arreglo[j]);	
		}
	}
	
	public static double promedio(int[]arreglo) {
		int suma=0;
		double promedio;

		for (int x = 0; x < arreglo.length; x++) {
		System.out.println("["+x+"] : "+arreglo[x]);
		suma+=arreglo[x];
		
	}
		promedio=(suma/arreglo.length)-(maximo(arreglo)+minimo(arreglo));
		System.out.println("El promedio es: "+promedio*-1);
	return promedio;	
	}
	
	public static boolean comprobar(int[]arreglo,int[]vector) {

		boolean datosRepetidos = false;
	      for (int i=0; i<arreglo.length; i++){
	         for (int j=0; j<vector.length; j++){
	             if (arreglo[i]==vector[j]){
	                 datosRepetidos = true;
	                 
	                 break; //Rompe la iteración puesto que, si determinó que un dato se repite, no es necesario seguir comparando.   
	             }                       
	         }
	      
	      }if (arreglo==vector) {
	    	  System.out.println("Hay datos iguales");
	      }else
	      System.out.println("No hay datos iguales");
		return datosRepetidos; 
	}
	
	public static int[] pares(int vector[]) {
		int []destino=new int[vector.length];
		int cont=0;
		for (int j = 0; j < vector.length; j++) {
			if (vector[j]%2==0) {
				destino[cont]=vector[j];
//				System.out.println(destino);
				cont++;
			}
			
		}
		//
		System.out.println("vector de origen");
		for (int i = 0; i < vector.length; i++) {
			System.out.println("["+i+"] :"+vector[i]);
		}
		System.out.println("\nnuevo arreglo: ");
		for (int i = 0; i < cont; i++) {
			System.out.println("["+i+"] :"+destino[i]);
		}
	return destino;	
}
}
