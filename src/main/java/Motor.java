public class Motor {
	private String idMotor;
	private int centrimetrosCubicos;

	public String getIdMotor() {
		return this.idMotor;
	}

	public int getCentrimetrosCubicos() {
		return this.centrimetrosCubicos;
	}

	public Motor(String idMotor, int centrimetrosCubicos) {
		this.idMotor=idMotor;
		this.centrimetrosCubicos=centrimetrosCubicos;
	}
	@Override
	public String toString() {
		return idMotor + centrimetrosCubicos;
	}
}