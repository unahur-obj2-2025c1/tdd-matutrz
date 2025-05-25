package ar.edu.unahur.obj2.tdd;

public class CajaFuerte {
	
	private Integer clave = 1234;
	
	private Boolean estado;
	
	public CajaFuerte(){
		this.estado = Boolean.TRUE;
	}
	
	public void setClave(Integer nuevaClave) {
		this.clave = nuevaClave;
	}
	
	public Boolean estado() {
		return estado;
	}
	
	public void abrir(Integer claveCaja) {
		if (this.clave.equals(claveCaja)){
				this.estado = Boolean.TRUE;
		}
	}
	
	public void cerrar(Integer claveApertura) {
		this.estado = Boolean.FALSE;
		this.setClave(claveApertura);
	}
}
