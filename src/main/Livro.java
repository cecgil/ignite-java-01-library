package main;

import java.util.Date;

public class Livro {
	
	private int id;
	private String titulo;
	private String autor;
	private boolean disponivel;
    private Date dataCadastro;
    private Date dataAtualizacao;
    
	public Livro(int id, String titulo, String autor) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.disponivel = true;
		this.dataCadastro = new Date();
		this.dataAtualizacao = new Date();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
    
	 @Override
	    public String toString() {
	        return "Livro{" +
	                "id=" + id +
	                ", titulo='" + titulo + '\'' +
	                ", autor=" + autor +
	                ", disponivel=" + disponivel +
	                ", dataCadastro=" + dataCadastro +
	                ", dataAtualizacao=" + dataAtualizacao +
	                '}';
	    }
    
	
}