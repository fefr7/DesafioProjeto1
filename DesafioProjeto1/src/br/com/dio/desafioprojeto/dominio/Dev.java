package br.com.dio.desafioprojeto.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

	 private String nome;
	 private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
	 private Set<Conteudo> conteudosConcluidos =new LinkedHashSet<>();
	 
	public void inscreverbootcamp (Bootcamp bootcamp) {
	 this.conteudoInscritos.addAll(bootcamp.getConteudos());
	 bootcamp.getDevsInscritos().add(this);
	}
	
	public void proguedir() {
	Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();
		if (conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudoInscritos.remove(conteudo.get());
		} else {
			
			System.err.println("Voce não esta matriculado em nenhum conteudo");
		}
		
		
	}
	 
	public double calcularTotalXp() {
		return this.conteudosConcluidos			
			       .stream()
			       .mapToDouble(Conteudo::calcularXp)
			       .sum();

	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudoInscritos() {
		return conteudoInscritos;
	}

	public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
		this.conteudoInscritos = conteudoInscritos;
	}

	public Set<Conteudo> getConteudosComcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudoInscritos, conteudosConcluidos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudoInscritos, other.conteudoInscritos)
				&& Objects.equals(conteudosConcluidos, other.conteudosConcluidos) && Objects.equals(nome, other.nome);
	}
		
	
}
