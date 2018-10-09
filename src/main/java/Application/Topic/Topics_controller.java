package Application.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Topics_controller {

    private final Topic_service topic_service;

    @Autowired
    public Topics_controller(Topic_service topic_service) {
        this.topic_service = topic_service;
    }

    @RequestMapping("/topics")
    public List<Topic> get_all_topics() {
        return topic_service.get_all_topics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topic_service.get_topic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void add_topic(@RequestBody Topic topic) {
        topic_service.addTopic(topic);
    }
}
