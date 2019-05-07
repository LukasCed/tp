package lt.vu.usecases.cdi.simple;

import lombok.extern.slf4j.Slf4j;

import javax.enterprise.inject.Model;

@Model // tas pats kaip: @Named ir @RequestScoped
@Slf4j
public class RequestUseCaseControllerMyBatis {
//
//    @Getter
//    private Course course = new Course();
//    @Getter
//    private Student student = new Student();
//    @Getter
//    private List<Student> allStudents;
//
//    @PostConstruct
//    public void init() {
//        loadAllStudents();
//    }
//
//    @Inject
//    private StudentMapper studentMapper;
//    @Inject
//    private CourseMapper courseMapper;
//    @Inject
//    private StudentCourseMapper studentCourseMapper;
//
//    @Transactional
//    public void createCourseStudent() {
//        courseMapper.insert(course);
//        studentMapper.insert(student);
//        StudentCourse studentCourse = new StudentCourse();
//        studentCourse.setCourseId(course.getId());
//        studentCourse.setStudentId(student.getId());
//        studentCourseMapper.insert(studentCourse);
//        log.info("Maybe OK...");
//    }
//
//    private void loadAllStudents() {
//        allStudents = studentMapper.selectAll();
//    }
}
