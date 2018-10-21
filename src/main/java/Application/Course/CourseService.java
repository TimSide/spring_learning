package Application.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    List<Course> getAllCourses(String idTopic) {
        List<Course> courses = new ArrayList<>();
//        courseRepository.findByIdTopic(idTopic).forEach(courses::add);
        return courses;
    }

    void addCourse(Course course) {
        courseRepository.save(course);
    }

    Course getCourses(String idTopic) {
        return courseRepository.findOne(idTopic);
    }

    Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

    void deleteCourse(String id) {
        courseRepository.delete(id);
    }
}