package org.bleezmo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: Josh Rogers
 * Date: 1/16/15
 * Time: 7:26 PM
 * #TODO
 */
@Controller
public class MainController {
    @RequestMapping("/")
    public String main(){
        return "main";
    }

}
