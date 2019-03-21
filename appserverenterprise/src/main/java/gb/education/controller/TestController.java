package gb.education.controller;

import gb.education.client.CalcClient;
import gb.education.client.ClockClient;
import gb.education.dto.DateDTO;
import gb.education.dto.NumberDTO;
import gb.education.dto.ResultDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired(required = false)
    private ClockClient clockClient;

    @Autowired(required = false)
    private CalcClient calcClient;

    @Value("${test.info}")
    private String text;

    @RequestMapping(value = "/pingJSON", produces = "application/json")
    public ResultDTO ping() {
        return new ResultDTO();
    }

    @RequestMapping(value = "/pingXML", produces = "application/xml")
    public ResultDTO pingXML() {
        return new ResultDTO();
    }

    @RequestMapping("/text")
    public String text() {
        return text;
    }

    @RequestMapping(value = "/dateJSON", produces = "application/json")
    public DateDTO dateJSON() {
        return clockClient.date();
    }

    @RequestMapping(value = "/dateXML", produces = "application/xml")
    public DateDTO dateXML() {
        return clockClient.date();
    }

    @RequestMapping(value = "/sumJSON", produces = "application/json")
    public NumberDTO sumJSON(
            @RequestParam(value = "a") Double a,
            @RequestParam(value = "b") Double b
    ) {
        return calcClient.sum(a, b);
    }

    @RequestMapping(value = "/sumXML", produces = "application/xml")
    public NumberDTO sumXML(
            @RequestParam(value = "a") Double a,
            @RequestParam(value = "b") Double b
    ) {
        return calcClient.sum(a, b);
    }
}
