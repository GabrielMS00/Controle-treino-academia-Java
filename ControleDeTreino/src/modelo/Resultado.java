package modelo;

public class Resultado {
	
	private float variacaoPeso;
	private String data;
	
	public Resultado(float variacaoPeso, String data) {
		
		this.variacaoPeso = variacaoPeso;
		this.data = data;
	}
	
	public float getVariacaoPeso() {
		return variacaoPeso;
	}
	
	public void setVariacaoPeso(float variacaoPeso) {
		this.variacaoPeso = variacaoPeso;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	
	public void status() {
		System.out.println(this.getVariacaoPeso() + "KG" + "/" + this.getData());
		
	}
	

}
