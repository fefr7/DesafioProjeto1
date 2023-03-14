package br.com.dio.desafioprojeto.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		
		curso1.setTitulo("Java");
		curso1.setDescrição("Descrição do curso java");
		curso1.setCargaHoraria(8);
		
		
		Curso curso2 = new Curso();
		
		curso2.setTitulo("CSS");
		curso2.setDescrição("Descrição do curso CSS");
		curso2.setCargaHoraria(6);
		
		
		Mentoria mentoria = new Mentoria();
		
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescrição("Descricao Mentoria");
		mentoria.setData(LocalDate.now());
		
		//System.out.println(curso1);//
		//System.out.println(curso2);//
		//System.out.println(mentoria);//
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java");
		bootcamp.setDescrição("descricao Boostcamp");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devFelipe = new Dev();
		devFelipe.setNome("Felipe");
		devFelipe.inscreverbootcamp(bootcamp);
		System.out.println("Conteudos isncritos de Felipe" + devFelipe.getConteudoInscritos());
		devFelipe.proguedir();
		devFelipe.proguedir();
		System.out.println("---");
		System.out.println("Conteudos Concluidos de Felipe" + devFelipe.getConteudosComcluidos());
		System.out.println("Conteudos isncritos de Felipe" + devFelipe.getConteudoInscritos());
		System.out.println("XP" + devFelipe.calcularTotalXp());
		
		System.out.println("----------------------------");
		
		Dev devCarol = new Dev();
		devCarol.setNome("Carol");
		devCarol.inscreverbootcamp(bootcamp);	
		System.out.println("Conteudos isncritos de Carol" + devCarol.getConteudoInscritos());
		devCarol.proguedir();
		System.out.println("---");
		System.out.println("Conteudos Concluidos de Carol" + devCarol.getConteudosComcluidos());
		System.out.println("Conteudos isncritos de Carol" + devCarol.getConteudoInscritos());
		System.out.println("XP" + devCarol.calcularTotalXp());
	}

}
