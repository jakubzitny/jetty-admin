package control;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TheController {

    private static final Logger logger = LoggerFactory.getLogger(TheController.class);

    /**
     * route index page
     * @return index template to render
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String dispatchIndex() {
        return "index";
    }

}
