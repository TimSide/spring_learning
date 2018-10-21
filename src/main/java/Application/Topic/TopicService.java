package Application.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    TopicRepository topicRepository;

    List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    Topic getTopic(String id) {
        return topicRepository.findOne(id);
    }

    Topic updateTopic(Topic topic) {
        return topicRepository.save(topic);
    }

    void deleteTopic(String id) {
        topicRepository.delete(id);
    }
}