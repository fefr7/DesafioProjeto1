package br.com.dio.desafioprojeto.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

	private String nome;
	private String descrição;
	private final LocalDate dataInicial = LocalDate.now();
	private final LocalDate datafinal = dataInicial.plusDays(45);
	private Set <Dev> devsInscritos = new HashSet<>();
	private Set <Conteudo> conteudos = new LinkedHashSet<>();
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the descrição
	 */
	public String getDescrição() {
		return descrição;
	}
	/**
	 * @param descrição the descrição to set
	 */
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	/**
	 * @return the devsInscritos
	 */
	public Set<Dev> getDevsInscritos() {
		return devsInscritos;
	}
	/**
	 * @param devsInscritos the devsInscritos to set
	 */
	public void setDevsInscritos(Set<Dev> devsInscritos) {
		this.devsInscritos = devsInscritos;
	}
	/**
	 * @return the conteudos
	 */
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	/**
	 * @param conteudos the conteudos to set
	 */
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	/**
	 * @return the dataInicial
	 */
	public LocalDate getDataInicial() {
		return dataInicial;
	}
	/**
	 * @return the datafinal
	 */
	public LocalDate getDatafinal() {
		return datafinal;
	}
	@Override
	public int hashCode() {
		return Objects.hash(conteudos, dataInicial, datafinal, descrição, devsInscritos, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(dataInicial, other.dataInicial)
				&& Objects.equals(datafinal, other.datafinal) && Objects.equals(descrição, other.descrição)
				&& Objects.equals(devsInscritos, other.devsInscritos) && Objects.equals(nome, other.nome);
	}
	
	
	
	
	
	
}
