package jbuitrago29.Simulador_de_redes_de_computadores;

public class Dispositivo 
{
	private String Unique_record;
	private String TypeDevice;
	private int delay;
	
	
	public Dispositivo(String TypeDevice) {
		Unique_record = TypeDevice + code();
		
		switch (TypeDevice){
			case "Router":
				this.TypeDevice = TypeDevice;
				setDelay(1);
				break;
				
			case "Hub":
				this.TypeDevice = TypeDevice;
				setDelay(2);
				break;
				
			case "Repeater":
				this.TypeDevice = TypeDevice;
				setDelay(3);
				break;
				
			case "Switch":
				this.TypeDevice = TypeDevice;
				setDelay(4);
				break;
				
			case "Bridge":
				this.TypeDevice = TypeDevice;
				setDelay(5);
				break;	
				
				default:
				System.out.println("OPCION INCORRECTA");
		}
	}

	public String getUnique_record() {
		return Unique_record;
	}

	public void setgetUnique_record(String unique_record) {
		this.Unique_record = unique_record;
	}

	public String code() 
	{
		String valor = " ";
		valor = String.valueOf((int) ((Math.random() * (899999)) + 100000));  
		return valor;
		
	}

	public int getDelay() {
		return delay;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}

}
