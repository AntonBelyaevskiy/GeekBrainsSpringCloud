package gb.education.client;

import gb.education.dto.DateDTO;
import gb.education.dto.ResultDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/api/clock")
@FeignClient(name = "app-server-api")
public interface ClockClient {

    @RequestMapping(value = "/ping", produces = "application/json")
    ResultDTO ping();

    @RequestMapping(value = "/date", produces = "application/json")
    DateDTO date();

}
