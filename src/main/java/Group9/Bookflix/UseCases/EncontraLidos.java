package Group9.Bookflix.UseCases;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;
import Group9.Bookflix.Entities.Livro;
import Group9.Bookflix.Entities.Usuario;

@Component
public class EncontraLidos {
   
    public Set<Livro> find(Usuario user) {
        Set<Livro> sLivros = new HashSet<Livro>();
        for(Livro l: user.getLivrosLidos()){
            sLivros.add(l);
        }
        return sLivros;
    }
}