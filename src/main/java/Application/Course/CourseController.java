package Application.Course;

import Application.Topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    // Get all courses of topic id
    @RequestMapping("/topics/{idTopic}/courses")
    public List<Course> getAllCourses(@PathVariable String idTopic) {
        return courseService.getAllCourses(idTopic);
    }

    // Get course by id
    @RequestMapping("/topics/{idTopic}/courses/{idCourse}")
    public Course getCourse(@PathVariable String idTopic) {
        return courseService.getCourses(idTopic);
    }

    // Creating new course with id
    @RequestMapping(method = RequestMethod.POST, value = "/topics/{idTopic}/courses/{idCourse}")
    public void addCourse(@RequestBody Course course, @PathVariable String idTopic) {
        course.setTopic(new Topic(idTopic, "", ""));
        courseService.addCourse(course);
    }

    // PUT Request
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{idTopic}/courses/{idCourse}")
    public void updateCourse(@RequestBody Course course, @PathVariable String idTopic) {
        course.setTopic(new Topic(idTopic, "", ""));
        courseService.updateCourse(course);
    }

    // DELETE Request
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{idTopic}/courses/{idCourse}")
    public void deleteTopic(@PathVariable String idCourse) {
        courseService.deleteCourse(idCourse);
    }

}
