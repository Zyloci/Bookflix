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
        Livro liv1 = new Livro("CarlucciFit", "Get Big", "Fitness", "Luccia", 5);
        Livro liv2 = new Livro("TryingtoDie", "The art of not dying", "Batatas", "Vaz", 1);
        Livro liv3 = new Livro("GoodBook", "A good book", "Geral", "Thales", 4);
        dani.getLivrosLidos().add(liv1);
        dani.getLivrosLidos().add(liv2);
         
        livroRep.save(liv1);
        livroRep.save(liv2);
        livroRep.save(liv3);
        userRep.save(dani);
        
        System.out.println("--->Bookflix Boot------------\n" 
                        +  "Numero de Livros: " + livroRep.count() + " \n" 
                        +  "Numero de Usuarios: " + userRep.count());
    }
}