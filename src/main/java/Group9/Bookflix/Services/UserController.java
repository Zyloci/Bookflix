package Group9.Bookflix.Services;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import Group9.Bookflix.Repositories.UserRep;

@Controller
public class UserController implements Controllers {
    private final UserRep userRep;

    public UserController(UserRep userRep){
        this.userRep = userRep;
    }

    @RequestMapping("/info")
    public String getBooks(Model model){
        model.addAttribute("info", userRep.findAll());
        return "info/prof";
    }

    @RequestMapping("/select")
    public String getSelect(Model model){
        model.addAttribute("choices", userRep.findAll());
        return "select/choices";
    }
    public boolean isOn(){
        return true;
    }
}