package homeworkv2.storage;

public class IdGenerator {
    private IdGenerator() {
    }

    private static Long id = 0L;

    public static Long generateId() {
        return ++id;
    }
}

