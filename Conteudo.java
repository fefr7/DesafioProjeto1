package br.com.dio.desafioprojeto.dominio;

public abstract class Conteudo {
	
	 protected static final double XPPADRAO =10d;
	 
	 private String titulo;
	 private String descrição;
	 
	 public abstract double calcularXp();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

}

