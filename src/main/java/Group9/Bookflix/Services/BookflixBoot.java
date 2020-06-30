package Group9.Bookflix.Services;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import Group9.Bookflix.Entities.Livro;
import Group9.Bookflix.Entities.Usuario;
import Group9.Bookflix.Repositories.LivroRep;
import Group9.Bookflix.Repositories.UserRep;

@Component
public class BookflixBoot implements CommandLineRunner {
    
    private final UserRep userRep;
    private final LivroRep livroRep;

    public BookflixBoot(UserRep userRep, LivroRep livroRep){
        this.livroRep = livroRep;
        this.userRep = userRep;
    }

    @Override
    public void run(String... args) throws Exception {
        Usuario dani = new Usuario("Dani", "deus");
        Usuario vaz = new Usuario("Pedro Vaz", "qwerty123");
        Livro liv1 = new Livro("CarlucciFit", "Get Big", "Fitness", "Luccia", 5);
        Livro liv2 = new Livro("Trying to Die", "The Art of not Dying", "Fighting", "Vaz", 1);
        Livro liv3 = new Livro("Imortal God", "Tales of Gods and Dani", "Travelling", "Dani", 5);
        Livro liv4 = new Livro("Knowledge is Power", "A good book", "Educational", "Hiram", 3);
        Livro liv5 = new Livro("The Call of Cthulhulette", "Funny Fairy Tale", "Kids Book", "H. P. Lovecraft", 4);
        dani.getLivrosLidos().add(liv1);
        dani.getLivrosLidos().add(liv2);
        dani.getLivrosLidos().add(liv3);
        dani.getLivrosLidos().add(liv4);
        vaz.getLivrosLidos().add(liv5);
         
        livroRep.save(liv1);
        livroRep.save(liv2);
        livroRep.save(liv3);
        livroRep.save(liv4);
        livroRep.save(liv5);
        userRep.save(dani);
        userRep.save(vaz);
        
        System.out.println("--->Bookflix Boot------------\n" 
                        +  "Numero de Livros: " + livroRep.count() + " \n" 
                        +  "Numero de Usuarios: " + userRep.count());
    }
}