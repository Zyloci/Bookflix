package Group9.Bookflix.Services;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import Group9.Bookflix.Repositories.LivroRep;

@Controller
public class LivroController implements Controllers {
    
    private final LivroRep livroRep;

    public LivroController(LivroRep livroRep){
        this.livroRep = livroRep;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books", livroRep.findAll());
        return "books/list";
    }
    public boolean isOn(){
        return true;
    }
}