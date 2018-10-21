package Application.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicsController {

    private final TopicService topic_service;

    @Autowired
    public TopicsController(TopicService topic_service) {
        this.topic_service = topic_service;
    }

    // Get all topics
    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topic_service.getAllTopics();
    }

    // Get topic by id
    @RequestMapping("/topics/{idTopic}")
    public Topic getTopic(@PathVariable String idTopic) {
        return topic_service.getTopic(idTopic);
    }

    // Create topic
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        topic_service.addTopic(topic);
    }

    // PUT Request
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{idTopic}")
    public void updateTopic(@RequestBody Topic topic) {
        topic_service.updateTopic(topic);
    }

    // DELETE Request
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{idTopic}")
    public void deleteTopic(@PathVariable String idTopic) {
        topic_service.deleteTopic(idTopic);
    }

}
