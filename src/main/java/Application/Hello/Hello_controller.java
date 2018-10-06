package Application.Hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello_controller {

    @RequestMapping("/hello")
    public String say_Hi() {
        return "Hi :)";
    }
}