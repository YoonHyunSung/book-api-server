package net.demoproject.api.book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home(){
        return new SimpleDateFormat("yyyy-HH-ss yy").format(new Date());
    }
}
