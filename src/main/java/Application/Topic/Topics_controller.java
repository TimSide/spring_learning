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

    // GET Request
    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topic_service.getAllTopics();
    }

    // Individual request
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topic_service.getTopic(id);
    }

    // POST Request
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        topic_service.addTopic(topic);
    }

    // PUT Request
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic) {
        topic_service.updateTopic(topic);
    }

    // DELETE Request
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topic_service.deleteTopic(id);
    }

}
