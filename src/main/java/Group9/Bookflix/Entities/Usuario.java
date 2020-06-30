package Group9.Bookflix.Entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario {

    @Id
    @Column(name = "userID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long userID;

    private String userName;
    private String senha;

    @Column(name = "lidos")
    @OneToMany(mappedBy = "user", targetEntity = Livro.class, fetch = FetchType.EAGER)
    private Set<Livro> livrosLidos = new HashSet<Livro>();
    
    protected Usuario(){        
    }

    public Usuario(String userName, String senha){
        this.userName = userName;
        this.senha = senha;
    }

    //---Sets------------------------------------------------------------------
    public void setNome(String str){
        this.userName = str;
    }
    public void setSenha(String str){
        this.senha = str;
    }
    public void setId(long str){
        this.userID = str;
    }
    public void setLivrosLidos(Set<Livro> livrosLidos){
        this.livrosLidos = livrosLidos;
    }

    //---Gets------------------------------------------------------------------
    public String getUserName(){
        return userName;
    }
    public String getSenha(){
        return senha;
    }
    public long getId(){
        return userID;
    }
    public Set<Livro> getLivrosLidos(){
        return livrosLidos;
    }

    @Override
    public String toString() {
        return "Usuario=> Nome:"+ userName +", Senha: "+ senha +", Id: "+ userID+"]";
    }
}