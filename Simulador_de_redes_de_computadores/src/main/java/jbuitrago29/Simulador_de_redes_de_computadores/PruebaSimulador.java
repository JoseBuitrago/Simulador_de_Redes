package jbuitrago29.Simulador_de_redes_de_computadores;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaSimulador 
{
	public static void main(String args[])
	{  
		
		Computador generarIp = new Computador();
		generarIp.crearIp();
		
		System.out.println("\nIP\n" + generarIp.getIp_adress());
		
		Mensaje generarId = new Mensaje();
		generarId.crearId();
		
		System.out.println("\nID MESSAGE\n" + generarId.getMessage_id());
		
		Canal generarIdentificador = new Canal();
		generarIdentificador.identifier();
		
		System.out.println("\nID CHANNEL\n" + generarIdentificador.getUnique_identifier());
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nDigite el tipo de dispositivo a crear");
		String valor =  entrada.nextLine();
		Dispositivo dispositivo = new Dispositivo(valor);
		System.out.println("El dispitivo generado es: "+ dispositivo.getUnique_record()); 
		
	}  

}
