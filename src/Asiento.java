
public class Asiento {

	private Persona usuario;
	private int numeroAsiento;
	private String tipo;
	
	public Asiento(Persona usuario, int numeroAsiento, String tipo) {
		this.usuario = usuario;
		this.numeroAsiento = numeroAsiento;
		this.tipo = tipo;
		
	}

	public Persona getUsuario() {
		return usuario;
	}

	public void setUsuario(Persona usuario) {
		this.usuario = usuario;
	}

	public int getNumeroAsiento() {
		return numeroAsiento;
	}

	public void setNumeroAsiento(int numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}
	
	@Override
	public String toString() {
		return  "Numero de asiento: "+this.numeroAsiento+" Comprado por: "+ usuario.getNombre();
	}
	

}
