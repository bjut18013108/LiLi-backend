package controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class jsonBean {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say() {
        return "hello Spring!";
    }

}
