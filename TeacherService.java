import java.util.HashMap;
import java.util.Map;

public class TeacherService {
    private Map<Integer, Teacher> teachers;

    public TeacherService() {
        teachers = new HashMap<>();
        teachers.put(1, new Teacher(1, "Mr. Smith"));
        teachers.put(2, new Teacher(2, "Mrs. Johnson"));
    }

    public Teacher getTeacherById(int id) {
        return teachers.get(id);
    }
}
