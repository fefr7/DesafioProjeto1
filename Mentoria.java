package br.com.dio.desafioprojeto.dominio;

import java.time.LocalDate;

public class Mentoria  extends Conteudo{

	
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XPPADRAO + 20d;
	}
	private LocalDate data;
	
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ","
				+ " descrição=" + getDescrição() + ","
						+ " data=" + data + "]";
	
	}
	
}
