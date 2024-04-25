package JAVA_ATIV_8;


import java.util.Scanner;

public class POSTO_COMBUSTIVEIS09 {

	
	
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.println("Digite o número de litros vendidos:");
	        double litrosVendidos = scanner.nextDouble();

	       
	        System.out.println("Digite o tipo de combustível (A para álcool, G para gasolina):");
	        char tipoCombustivel = scanner.next().charAt(0);

	        
	        double precoGasolina = 3.30;
	        double precoAlcool = 2.90;

	       
	        double valorPago;
	        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
	            valorPago = litrosVendidos * precoAlcool;
	        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
	            valorPago = litrosVendidos * precoGasolina;
	        } else {
	            System.out.println("Tipo de combustível inválido.");
	            return;
	        }

	       
	        System.out.println("Valor a ser pago pelo cliente: R$ " + valorPago);

	        scanner.close();
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

