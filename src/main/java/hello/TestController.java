package hello;

import hello.entity.CD;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
    @GetMapping("/contents")
    public String insert(Model model){
        TestModel tm = new TestModel();
        tm.fillCds();
        model.addAttribute("cds",tm.cds );
        return "contents";

    }

}
