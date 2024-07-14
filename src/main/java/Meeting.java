public class Meeting extends Task {
    protected String topic;
    protected String project;
    protected String dateStart;

    public Meeting(int id, String topic, String project, String dateStart) {
        super(id); // вызов родительского конструктора
        this.topic = topic; // заполнение своих полей
        this.project = project;
        this.dateStart = dateStart;
    }

    public String getTopic() {
        return topic;
    }

    public String getProject() {
        return project;
    }

    public String getDateStart() {
        return dateStart;
    }

    @Override
    public boolean matches(String query) {
        if (topic.contains(query)) {
            return true;
        }
        if (project.contains(query)) {
            return true;
        }
        return false;
    }
}
