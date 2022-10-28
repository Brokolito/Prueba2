public class Automovil {
	private String marca;
	private String modelo;
	private int anhoFabricacion;
	private int precio;
	private Motor motor;
	private Chasis chasis;

	public String getMarca() {
		return this.marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public int getAnhoFabricacion() {
		return this.anhoFabricacion;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Automovil(String marca, String modelo, int anhoFabricacion, int precio, Motor motor, Chasis chasis ) {
		this.marca=marca;
		this.modelo=modelo;
		this.anhoFabricacion=anhoFabricacion;
		this.precio=precio;
		this.motor=motor;
		this.chasis=chasis;
	}

	@Override
	public String toString() {
		return marca + modelo+ anhoFabricacion + precio + motor + chasis;
	}
}