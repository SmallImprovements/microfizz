package hello

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RunMe {

    @RequestMapping("/hello-groovy")
    String home() {
        "Hello World!"
    }

}