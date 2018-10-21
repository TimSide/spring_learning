package Application.Course;

import org.springframework.data.repository.CrudRepository;

interface CourseRepository extends CrudRepository<Course, String> {

//    public List<Course> findByIdTopic(String idTopic);




    // public List<Course> findByDescription(String name);


    // getAllCourses()
    // getTopic(String id)
    // updateTopic(Topic t)
    // deleteTopic(String id)
}
