import java.util.Random;

public class OperacionesArrays {

	//10 elementos sin repeticion
	public static int[] crearArreglo(int tam) {
		
		int k = tam;
		int[] resultado = new int[tam];
		int[] numeros=new int[tam]; 
		Random rnd = new Random();
		int res;
		       
		for(int i=0;i<tam;i++){
		    numeros[i]=i+1;
		}
		       
		for(int i=0;i<tam;i++){
		    res = rnd.nextInt(k);           
		        resultado[i]=numeros[res];
		        numeros[res]=numeros[k-1];
		        k--;           
		}

		return resultado;
		}
		
		
       
	
	
	//+10 elementos
	public static int[] crearArregloMas(int tam, int max, int min){
		int []arreglo= new int[tam];
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i]= (int)(Math.random() * (max+min+1)) + min;
		}
		
		
       return arreglo;
	}
	public static int[] crearArregloRep(int tam, int max, int min) {
		int []arreglo= new int[tam];
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i]= (int)(Math.random() * max+min);
		}
		
		
       return arreglo;
	}
	

}
