import java.util.List;

public class StudyGroupController {
    private TeacherService teacherService;
    private StudentService studentService;
    private StudyGroupService studyGroupService;

    public StudyGroupController() {
        this.teacherService = new TeacherService();
        this.studentService = new StudentService();
        this.studyGroupService = new StudyGroupService();
    }

    public StudyGroup createStudyGroup(int teacherId, List<Integer> studentIds) {
        Teacher teacher = teacherService.getTeacherById(teacherId);
        List<Student> students = studentService.getStudentsByIds(studentIds);
        if (teacher != null && !students.isEmpty()) {
            return studyGroupService.createStudyGroup(teacher, students);
        }
        return null; // В случае, если преподаватель или студенты не найдены
    }
}
