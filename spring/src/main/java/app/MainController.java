package app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    
    @GetMapping
    String home() {
        return "<h1>Welcome to Extreme Startup!</h1>";
    }
    
    @GetMapping("/test")
    String test(@RequestParam(required = false, value = "q") String parameter) {
        if (parameter == null) return "team name";
        Matcher additionMatcher = Pattern.compile(".*what is the sum of (\\d+) and (\\d+)").matcher(parameter);
        if (additionMatcher.matches()) {
            return String.valueOf(Integer.parseInt(additionMatcher.group(1))
                    + Integer.parseInt(additionMatcher.group(2)));
        }
        return "team name";
    }
    
    @PostMapping("/template")
    String template(@RequestParam(required = false, value = "template") String parameter) {
        return "template answer " + (parameter != null ? parameter : "no param");
    }

}
