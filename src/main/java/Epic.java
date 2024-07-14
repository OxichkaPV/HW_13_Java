public class Epic extends Task {
    protected String[] subTask;

    public Epic(int id, String[] subTask) {
        super(id); // вызов родительского конструктора
        this.subTask = subTask; // заполнение своих полей
    }

    public String[] getSubTusk() {
        return subTask;
    }

    @Override
    public boolean matches(String query) {
        for (int i = 0; i < subTask.length; i++) {
            if (subTask[i].contains(query)) {
                return true;
            }
        }
        return false;
    }
}
