package maven.ex02;

public class Carro {
	private int codigo;
	private String cor;
	private String caracteristicas;
	private char cambio;
	
	public Carro() {
		this.codigo = -1;
		this.cor = "";
		this.caracteristicas = "";
		this.cambio = '*';
	}
	
	public Carro(int codigo, String cor, String caracteristicas, char cambio) {
		this.codigo = codigo;
		this.cor = cor;
		this.caracteristicas = caracteristicas;
		this.cambio = cambio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public char getCambio() {
		return cambio;
	}

	public void setCambio(char cambio) {
		this.cambio = cambio;
	}

	@Override
	public String toString() {
		return "Carro [codigo=" + codigo + ", cor=" + cor + ", caracteristicas=" + caracteristicas + ", cambio=" + cambio + "]";
	}	
}
