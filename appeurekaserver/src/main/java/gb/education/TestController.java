package gb.education;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

    @Value("${simple.text}")
    private String text;

    @RequestMapping(value = "/test")
    public String test() {
        return text;
    }

}
