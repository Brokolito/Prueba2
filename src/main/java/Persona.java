import java.util.ArrayList;

public class Persona {
	private String nombre;
	private String apellido;
	private String rut;
	private ArrayList<Automovil> automoviles;
	private ArrayList<Correo> correos ;

	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public String getRut() {
		return this.rut;
	}

	public ArrayList<Automovil> getAutomoviles() {
		return automoviles;
	}

	public void setAutomoviles(ArrayList<Automovil> automoviles) {
		this.automoviles = automoviles;
	}

	public ArrayList<Correo> getCorreos() {
		return correos;
	}

	public void setCorreos(ArrayList<Correo> correos) {
		this.correos = correos;
	}

	public Persona(String nombre, String apellido, String rut) {
	this.nombre=nombre;
	this.apellido=apellido;
	this.rut=rut;
	this.automoviles=new ArrayList<Automovil>();
	this.correos=new ArrayList<Correo>();
	}
	}
