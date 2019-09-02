package cloud.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class ClassController {


    @GetMapping("/classes")
    public Object hello(@RequestParam String name) {
        return "get";
    }

    @PostMapping("/classes")
    public Object hello(@RequestBody Map map) {
        return "post";
    }

}
