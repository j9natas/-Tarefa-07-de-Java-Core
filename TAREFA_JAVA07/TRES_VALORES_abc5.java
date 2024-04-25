package JAVA_ATIV_8;


import java.util.Scanner;


public class TRES_VALORES_abc5 {

	
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.println("Digite o valor do lado A:");
	        double ladoA = scanner.nextDouble();

	        System.out.println("Digite o valor do lado B:");
	        double ladoB = scanner.nextDouble();

	        System.out.println("Digite o valor do lado C:");
	        double ladoC = scanner.nextDouble();

	       
	        boolean formaTriangulo = (ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA);

	        
	        if (formaTriangulo) {
	            System.out.println("Os valores formam um triângulo.");
	        } else {
	            System.out.println("Os valores não formam um triângulo.");
	        }

	        scanner.close();
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
