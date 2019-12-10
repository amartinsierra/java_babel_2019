package model;

public class Pedido {
	private String producto;
	private int unidades;
	private double precioUnitario;
	public Pedido(String producto, int unidades, double precioUnitario) {	
		this.producto = producto;
		this.unidades = unidades;
		this.precioUnitario = precioUnitario;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	
}
