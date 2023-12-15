package sky.demo.oauth2resource.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "this is a test";
    }

    @GetMapping("/tt1")
    public String tt1() {
        return "succes-1";
    }

    @GetMapping("/tt2")
    public String tt2() {
        return "succes-2";
    }

    @GetMapping("/tt3")
    public String tt3() {
        return "succes-3";
    }
}
