package Application.Topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Topics_controller {
    @RequestMapping("/topics")
    public List<Topic> return_topics() {
        return Arrays.asList(
                new Topic("0","Fish","azaza"),
                new Topic("1","Salad","two"),
                new Topic("2","Souse","three")
        );
    }
}
