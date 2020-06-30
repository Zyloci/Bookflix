package Group9.Bookflix.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long livroID;

    @ManyToOne
    @JoinColumn(name = "userID", referencedColumnName = "userID")
    private Usuario user;

    private String autor;
    private String nome;
    private String sinopse;
    private String categoria;
    private int avaliacao;

    protected Livro(){
    }

    public Livro(String nome, String sinopse, String categoria, String autor,
                 int avaliacao){
        this.nome = nome;
        this.sinopse = sinopse;
        this.categoria = categoria;
        this.autor = autor;
        this.avaliacao = avaliacao;
    }

    
    //---Sets------------------------------------------------------------------
    public void setNome(String str){
        this.nome = str;
    }
    public void setSinopse(String str){
        this.sinopse = str;
    }
    public void setCategoria(String str){
        this.categoria = str;
    }
    public void setAutor(String str){
        this.autor = str;
    }
    public void setLivroID(long livroID){
        this.livroID = livroID;
    }
    public void setAvaliacao(int ava){
        this.avaliacao = ava;
    }

    //---Gets------------------------------------------------------------------------
    public String getNome(){
        return nome;
    }
    public String getSinopse(){
        return sinopse;
    }
    public String getCategoria(){
        return categoria;
    }
    public String getAutor(){
        return autor;
    }
    public int getAvaliacao(){
        return avaliacao;
    }
    public long getLivroID(){
        return livroID;
    }

    @Override
    public String toString() {
        return "Livro=> Nome:"+ nome +", livroID: "+ livroID +", Autor: "+ autor+" Categoria: "+ categoria + " Autor: "+autor+" Avaliacao:"+avaliacao+"]";
    }

}