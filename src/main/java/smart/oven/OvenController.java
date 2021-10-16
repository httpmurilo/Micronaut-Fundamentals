package smart.oven;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class OvenController {

    @Get("/status/{ovenid}")
    public String getOvenStatus(String ovenid) {
        return "ok";
    }
}
