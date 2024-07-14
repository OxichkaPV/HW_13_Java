import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTests {
    @Test
    public void matchesEpicTest() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        boolean expected = true;
        boolean actual = epic.matches("Яйца");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void noMatchesEpicTest() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        boolean expected = false;
        boolean actual = epic.matches("Колбаса");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void matchesProjectMeetingTest() {
        Meeting meet = new Meeting(111,
                "Выкатка 6й версии приложения",
                "Приложение НетоБанка",
                "Во четверг после обеда");
        boolean expected = true;
        boolean actual = meet.matches("НетоБанка");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void matchesTopicMeetingTest() {
        Meeting meet = new Meeting(111,
                "Выкатка 6й версии приложения",
                "Приложение НетоБанка",
                "Во четверг после обеда");
        boolean expected = true;
        boolean actual = meet.matches("6й");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void noMatchesTopicMeetingTest() {
        Meeting meet = new Meeting(111,
                "Выкатка 6й версии приложения",
                "Приложение НетоБанка",
                "Во четверг после обеда");
        boolean expected = false;
        boolean actual = meet.matches("7й");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void matchesSimleTaskTest() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        boolean actual = simpleTask.matches("Позвонить");

        Assertions.assertTrue(actual);
    }

    @Test
    public void noMatchesSimleTaskTest() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        boolean actual = simpleTask.matches("Написать");

        Assertions.assertFalse(actual);
    }
}
