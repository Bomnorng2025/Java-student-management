package student_management_system;

public class DisplayUtil {
    public final static String MENU = """
            [ Student Management System ]
            1. List student
            2. Search student (id, name, gender, score)
            3. Add new student
            4. Update student by id
            5. Delete student by id
            0. Exit application
            """;

    public static void showSuccessMsg(String prefix) {
        System.out.println(prefix + " successfully");
    }

    public static void print(String text) {
        System.out.println(text);
    }
}
