public class Chasis {
	private String idChasis;
	private String tipoMaterial;

	public String getNumeroChasis() {
		throw new UnsupportedOperationException();
	}

	public String getTipoMaterial() {
		return this.tipoMaterial;
	}

	public Chasis(String idChasis, String tipoMaterial) {
		this.idChasis=idChasis;
		this.tipoMaterial=tipoMaterial;
	}

	@Override
	public String toString() {
		return idChasis + tipoMaterial;
	}
}