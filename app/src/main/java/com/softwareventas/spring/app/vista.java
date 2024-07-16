package com.softwareventas.spring.app;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/controller")
public class vista {

    @GetMapping("/hola")
@ResponseBody
    public String Mostrarmensaje(){
return "BIENVENIDO, ESTA ES MI PRIMERA PAGINA WEB" + " Y ahora que";
    }
}
