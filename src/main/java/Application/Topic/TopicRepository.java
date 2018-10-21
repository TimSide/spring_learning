package Application.Topic;

import org.springframework.data.repository.CrudRepository;

interface TopicRepository extends CrudRepository<Topic, String> {

    // getAllCourses()
    // getTopic(String id)
    // updateTopic(Topic t)
    // deleteTopic(String id)
}
