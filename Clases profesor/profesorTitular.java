public class profesorTitular extends profesor{

private Calendar fechaOposicion;
private float notaOposicion;
private String especialidadOposicion;
private String destinoDefinitivo;
private float puntosConcursoTraslados;

	/**
	* Default empty profesorTitular constructor
	*/
	public profesorTitular() {
		super();
	}


	}
  public float importeNomina()  {    return 30f*43.20f;  }
	public Calendar getFechaOposicion() { 		return fechaOposicion; 	}
	public void setFechaOposicion(Calendar fechaOposicion) {
		this.fechaOposicion = fechaOposicion;
	}

	public float getImporteNomina() { 		return importeNomina; 	}
	public void setImporteNomina(float importeNomina) { 		this.importeNomina = importeNomina; 	}
	public Calendar getFechaOposicion() { 		return fechaOposicion;	}
	public void setFechaOposicion(Calendar fechaOposicion) { 		this.fechaOposicion = fechaOposicion;	}
	public String getDestinoDefinitivo() { 		return destinoDefinitivo;	}

	/**
	* Sets new value of destinoDefinitivo
	* @param
	*/
	public void setDestinoDefinitivo(String destinoDefinitivo) {
		this.destinoDefinitivo = destinoDefinitivo;
	}

	/**
	* Returns value of puntosConcursoTraslados
	* @return
	*/
	public float getPuntosConcursoTraslados() {
		return puntosConcursoTraslados;
	}

	/**
	* Sets new value of puntosConcursoTraslados
	* @param
	*/
	public void setPuntosConcursoTraslados(float puntosConcursoTraslados) {
		this.puntosConcursoTraslados = puntosConcursoTraslados;
	}

	/**
	* Returns value of importeNomina
	* @return
	*/
	public float getImporteNomina() {
		return importeNomina;
	}

	/**
	* Sets new value of importeNomina
	* @param
	*/
	public void setImporteNomina(float importeNomina) {
		this.importeNomina = importeNomina;
	}

	/**
	* Returns value of fechaOposicion
	* @return
	*/
	public Calendar getFechaOposicion() {
		return fechaOposicion;
	}

	/**
	* Sets new value of fechaOposicion
	* @param
	*/
	public void setFechaOposicion(Calendar fechaOposicion) {
		this.fechaOposicion = fechaOposicion;
	}

	/**
	* Returns value of destinoDefinitivo
	* @return
	*/
	public String getDestinoDefinitivo() {
		return destinoDefinitivo;
	}

	/**
	* Sets new value of destinoDefinitivo
	* @param
	*/
	public void setDestinoDefinitivo(String destinoDefinitivo) {
		this.destinoDefinitivo = destinoDefinitivo;
	}

	/**
	* Returns value of puntosConcursoTraslados
	* @return
	*/
	public float getPuntosConcursoTraslados() {
		return puntosConcursoTraslados;
	}

	/**
	* Sets new value of puntosConcursoTraslados
	* @param
	*/
	public void setPuntosConcursoTraslados(float puntosConcursoTraslados) {
		this.puntosConcursoTraslados = puntosConcursoTraslados;
	}

	/**
	* Returns value of importeNomina
	* @return
	*/
	public float getImporteNomina() {
		return importeNomina;
	}

	/**
	* Sets new value of importeNomina
	* @param
	*/
	public void setImporteNomina(float importeNomina) {
		this.importeNomina = importeNomina;
	}
}
