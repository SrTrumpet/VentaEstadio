
public class Asiento {

	private Persona usuario;
	private int numeroAsiento;
	
	public Asiento(Persona usuario, int numeroAsiento) {
		this.usuario = usuario;
		this.numeroAsiento = numeroAsiento;
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
