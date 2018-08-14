package jbuitrago29.Simulador_de_redes_de_computadores;

public class Canal 
{
	private String Unique_identifier;
	
	public String getUnique_identifier() {
		return Unique_identifier;
	}

	public void setUnique_identifier(String unique_identifier) {
		Unique_identifier = unique_identifier;
	}

	public void identifier() 
	{
		String dato = " ";
		dato = String.valueOf((int) ((Math.random() * (899999999)) + 100000000));
		Unique_identifier = dato;
	}
}
