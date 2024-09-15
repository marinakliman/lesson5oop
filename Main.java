import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudyGroupController controller = new StudyGroupController();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ID преподавателя: ");
        int teacherId = scanner.nextInt();

        System.out.print("Введите ID студентов через запятую (например, 1,2,3): ");
        scanner.nextLine(); // Очищаем буфер после nextInt()
        String[] studentIdStrings = scanner.nextLine().split(",");
        List<Integer> studentIds = Arrays.stream(studentIdStrings)
                                         .map(Integer::parseInt)
                                         .toList();

        StudyGroup studyGroup = controller.createStudyGroup(teacherId, studentIds);
        if (studyGroup != null) {
            System.out.println("Учебная группа успешно создана:");
            System.out.println(studyGroup);
        } else {
            System.out.println("Не удалось создать учебную группу.");
        }
    }
}
