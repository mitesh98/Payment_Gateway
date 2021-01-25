package src.main.java.com.ROIIM.Assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController

@Controller
public class FrontendController {

    @RequestMapping( "/" )
    public String getCheckoutForm(){

        return "PaymentCheckout";
    }


}
