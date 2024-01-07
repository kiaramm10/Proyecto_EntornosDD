package ejercicios;
import java.util.Scanner;

public class Ejercicio2 {
	
	static Scanner entrada = new Scanner(System.in);
	 
	    public static void main(String[] args){
	        
	    	System.out.println("Introduce el radio del circulo: ");
	        double radio = entradaDouble();
	        System.out.println("El área del círculo de radio "+radio+" es "+area(radio));
	        System.out.println("El perímetro del círculo de radio "+radio+" es "+perimetro(radio));
	    }
	  
	    private static double entradaDouble(){
	        return entrada.nextDouble();
	    }
	    
	    private static double area(double radio) {
	    	
	    	double area = Math.PI * Math.pow(radio, 2);
	    	
	    	return area;
	    	
	}
	    private static double perimetro(double radio) {
	    	
	    	double perimetro = 2 * Math.PI * radio;
	    	
	    	return perimetro;
	    	
	    }

	}
