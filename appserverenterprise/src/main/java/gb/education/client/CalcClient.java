package gb.education.client;

import gb.education.dto.NumberDTO;
import gb.education.dto.ResultDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value = "/api/calc")
@FeignClient(name = "app-server-api")
public interface CalcClient {

    @RequestMapping(value = "/ping", produces = "application/json")
    ResultDTO ping();

    @RequestMapping(value = "/sum", produces = "application/json")
    NumberDTO sum(
            @RequestParam(value = "a") Double a,
            @RequestParam(value = "b") Double b
    );

}
