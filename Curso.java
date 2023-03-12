package br.com.dio.desafioprojeto.dominio;

public class Curso extends Conteudo {
	
	
	private int cargaHoraria;
	
	public Curso() {
		
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descrição=" + getDescrição() + ", cargaHoraria=" + cargaHoraria + "]";
	}


	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XPPADRAO * cargaHoraria ;
	}
	
	
	
	
	}


