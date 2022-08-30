package modelo;

public class Resultado {
	
	private float variacaoPeso;
	private int data;
	
	public Resultado(float variacaoPeso, int data) {
		
		this.variacaoPeso = variacaoPeso;
		this.data = data;
	}
	
	public float getVariacaoPeso() {
		return variacaoPeso;
	}
	
	public void setVariacaoPeso(float variacaoPeso) {
		this.variacaoPeso = variacaoPeso;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	
	public void status() {
		System.out.println(this.getVariacaoPeso() + "KG" + "/" + this.getData());
		
	}
	

}
