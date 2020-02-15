package pl.polsl.gr6.proj.io.DoggyFoodie.controllers;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.polsl.gr6.proj.io.DoggyFoodie.model.Uzytkownik;
import pl.polsl.gr6.proj.io.DoggyFoodie.repositories.UzytkownikRepository;

/**
 *
 * @author Radosław Płachta
 * @version 1.1
 */
@Controller
public class WebController {

    @GetMapping("/createUser")
    public String createUser() {
        return "createUser";
    }

    @GetMapping("/userCreated")
    public String userCreated() {
        return "userCreated";
    }

    @GetMapping("/errorCreatingUser")
    public String errorCreatingUser() {
        return "errorCreatingUser";
    }

    @GetMapping("/errorLogin")
    public String errorLogin() {
        return "errorLogin";
    }

    @GetMapping("/adminLogin")
    public String adminLogin() {
        return "adminLogin";
    }
    
    @GetMapping("/guestEnter")
    public String enterAsGuest(HttpSession httpSession) {
        httpSession.setAttribute("name", "Guest");
        return "redirect:/mainPage";
    } 
    
    @GetMapping("/logout")
    public String logout(HttpSession httpSession) {
        httpSession.invalidate();
        return "redirect:/";
    }   

    @GetMapping("/userPanel")
    public String userPanel(HttpSession httpSession, Model model) {
        if(httpSession.getAttribute("name") == null)
            return "redirect:/";
        model.addAttribute("name", httpSession.getAttribute("name"));
        model.addAttribute("isadmin", httpSession.getAttribute("isadmin"));
        return "userPanel";
    }
    
    @GetMapping("/mainPage")
    public String goToMainPage(HttpSession httpSession, Model model) {
        if(httpSession.getAttribute("name") == null)
            return "redirect:/";
        model.addAttribute("name", httpSession.getAttribute("name"));
        model.addAttribute("isadmin", httpSession.getAttribute("isadmin"));
        return "mainPage";
    }

    @Autowired
    private UzytkownikRepository userRepository;

    @PostMapping(path = "/addNewUser") // Map ONLY POST Requests
    public String addNewUser(@RequestParam String name,
            @RequestParam String passwd,
            @RequestParam String email,
            @RequestParam String fname,
            @RequestParam String lname,
            HttpSession httpSession) {

        Uzytkownik n = new Uzytkownik();
        n.setName(name);
        n.setPassword(passwd);
        n.setEmail(email);
        n.setFirstName(fname);
        n.setLastName(lname);
        try {
            userRepository.save(n);
            httpSession.setAttribute("name", name);
            httpSession.setAttribute("isadmin", "No");
            httpSession.setMaxInactiveInterval(5);
            
            return "redirect:/userCreated";
        } catch (Exception e) {
            return "redirect:/errorCreatingUser";
        }
    }

    @PostMapping(path = "/loginUser") // Map ONLY POST Requests
    public String loginUser(@RequestParam String name,
            @RequestParam String passwd,
            HttpSession httpSession) {

        Uzytkownik u = userRepository.findUser(name, passwd);
        try {
            httpSession.setAttribute("name", u.getName());
            httpSession.setAttribute("isadmin", "No");
            httpSession.setMaxInactiveInterval(5);
        } catch (Exception e) {
            return "/errorLogin";
        }
        return "redirect:/mainPage";
    }
    
    @PostMapping(path = "/loginAdmin") // Map ONLY POST Requests
    public String loginAdmin(@RequestParam String name,
            @RequestParam String passwd,
            HttpSession httpSession) {

        Uzytkownik u = userRepository.findUser(name, passwd);
        try {
            httpSession.setAttribute("name", u.getName());
            httpSession.setAttribute("isadmin", "Yes");
            httpSession.setMaxInactiveInterval(5);
        } catch (Exception e) {
            return "/errorLogin";
        }
        return "redirect:/mainPage";
    }
}
