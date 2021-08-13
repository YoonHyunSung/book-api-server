package net.demoproject.api.book;

import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class HomeCotroller {
    public String home(){return new SimpleDateFormat("yyyy-HH-ss yy:hh:mm").format(new Date());
    }
}
