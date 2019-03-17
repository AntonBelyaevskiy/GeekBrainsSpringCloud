package gb.education.controller;

import gb.education.dto.DateDTO;
import gb.education.dto.ResultDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api/clock")
public class ClockController {

    @RequestMapping(value = "/ping", produces = "application/json")
    public ResultDTO ping() {
        return new ResultDTO();
    }

    @RequestMapping(value = "/date", produces = "application/json")
    public DateDTO date() {
        return new DateDTO(new Date());
    }

}
