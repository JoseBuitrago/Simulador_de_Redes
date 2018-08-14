package jbuitrago29.Simulador_de_redes_de_computadores;
import java.util.Random;

public class Computador 
{
	private String Ip_adress;
		
		public void crearIp() 
		{
			String[] dato = new String [3];
			for (int  i = 0; i < 3; i++)
			{
				dato[i] = String.valueOf((int) ((Math.random() * (900)) + 100));
			}
				Ip_adress = dato[0] + "." + dato[1] + "." + dato[2];
		}
	
		public String getIp_adress() {
			return Ip_adress;
		}
	
		public void setIp_adress(String ip_adress) {
			Ip_adress = ip_adress;
		}
	}

