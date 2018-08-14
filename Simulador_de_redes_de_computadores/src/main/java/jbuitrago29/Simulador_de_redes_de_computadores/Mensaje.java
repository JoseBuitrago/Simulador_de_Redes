package jbuitrago29.Simulador_de_redes_de_computadores;
import java.util.ArrayList;

public class Mensaje 
{
	private String message;
	private String message_id;
	private String source;
	private String destination;
	private Integer Delay;
	private ArrayList <String> Dispositives = new ArrayList <String>();
	
	
	public Mensaje (String message, String source, String destination, Integer delay, ArrayList<String> dispositives)
	{
		this.message = message;
		this.source = source;
		this.destination = destination;
		Dispositives = dispositives;
		Delay = delay;
	}
	
	public Mensaje ()
	{
		
	}
	
	public void crearId() 
	{
		String dato = " ";
		dato = String.valueOf((int) ((Math.random() * (900)) + 100));
		message_id = dato;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage_id() {
		return message_id;
	}

	public void setMessage_id(String message_id) {
		this.message_id = message_id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Integer getDelay() {
		return Delay;
	}

	public void setDelay(Integer delay) {
		Delay = delay;
	}

	public ArrayList<String> getDispositives() {
		return Dispositives;
	}

	public void setDispositives(ArrayList<String> dispositives) {
		Dispositives = dispositives;
	}
	
}
