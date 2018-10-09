package Application.Topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class Topic_service {

    private List<Topic> topics = new ArrayList<>(
            Arrays.asList(
            new Topic("0","Fish","azaza"),
                new Topic("1","Salad","two"),
                new Topic("2","Souse","three")
        )
    );

    List<Topic> get_all_topics() {
        return topics;
    }

    Topic get_topic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    void addTopic(Topic topic) {
        topics.add(topic);
    }
}