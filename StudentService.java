import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService {
    private Map<Integer, Student> students;

    public StudentService() {
        students = new HashMap<>();
        students.put(1, new Student(1, "Alice"));
        students.put(2, new Student(2, "Bob"));
        students.put(3, new Student(3, "Charlie"));
    }

    public List<Student> getStudentsByIds(List<Integer> ids) {
        List<Student> result = new ArrayList<>();
        for (int id : ids) {
            if (students.containsKey(id)) {
                result.add(students.get(id));
            }
        }
        return result;
    }
}
