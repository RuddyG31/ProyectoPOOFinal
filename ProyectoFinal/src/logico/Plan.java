package logico;

import java.util.ArrayList;
import java.util.Date;

public class Plan {
	private String codigo;
	private String nombrePlan;
	private String descripcion;
	private int duracionPlan;
	private ArrayList<Servicio> servicios;
	private float totalPrecio;
	private Date fechaInicio;
	private Date fechaPago;
	
	public Plan(String codigo, String nombrePlan,String descripcion, int duracionPlan, ArrayList<Servicio> servicios, float totalPrecio) {
		super();
		this.codigo = codigo;
		this.nombrePlan = nombrePlan;
		this.descripcion = descripcion;
		this.duracionPlan = duracionPlan;
		this.servicios = new ArrayList<Servicio>();
		this.totalPrecio = totalPrecio;
		this.fechaInicio = new Date();
		this.fechaPago = new Date();
	}
	
	
	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombrePlan() {
		return nombrePlan;
	}

	public void setNombrePlan(String nombrePlan) {
		this.nombrePlan = nombrePlan;
	}

	public int getDuracionPlan() {
		return duracionPlan;
	}

	public void setDuracionPlan(int duracionPlan) {
		this.duracionPlan = duracionPlan;
	}

	public ArrayList<Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(ArrayList<Servicio> servicios) {
		this.servicios = servicios;
	}

	public float getTotalPrecio() {
		return totalPrecio;
	}

	public void setTotalPrecio(float totalPrecio) {
		this.totalPrecio = totalPrecio;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public Date getFechaPago() {
		return fechaPago;
	}
	
	

}
