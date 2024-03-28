package hn.unah.lenguajes.demo.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class HomeController {
  
  @GetMapping(value = {"/saludo/{name}", "/saludo/{name}/{codigo}"})
  public String home(@PathVariable(name="name") String name, @PathVariable(required=false) String code) {
    if (code != null) {
      return "hola " + name + " " + code;
    }
    return "hola " + name;
  }
  
}
