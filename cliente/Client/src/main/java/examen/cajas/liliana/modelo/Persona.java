package examen.cajas.liliana.modelo;

public class Persona {
	private static final long serialVersionUID=1L;
	
	private String cedula;
	private String nombre;
	private Mensaje sms;

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
        
        public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Mensaje getSms() {
		return sms;
	}

	public void setSms(Mensaje sms) {
		this.sms = sms;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}

