package seminar7;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @GetMapping("/private-data")
    public String adminEndpoint() {
        return "private-data area";
    }

    @GetMapping("/head-data")
    public String headEndpoint() {
        return "head's area";
    }

    @GetMapping("/public-data")
    public String userEndpoint() {
        return "public-data area";
    }

}
