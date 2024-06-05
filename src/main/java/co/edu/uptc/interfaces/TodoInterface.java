package co.edu.uptc.interfaces;

import java.util.ArrayList;

import co.edu.uptc.pojos.Task;

public interface TodoInterface {

    public interface Model {
        public void setPresenter(Presenter presenter);
        public void addTask(Task task);
        public void deleteTask(Task task);
        public void editTask(Task task);
        public void loadData();
        public void writeData();
        public ArrayList<Task> getTasks();
    }

    public interface View{
        public void setPresenter(Presenter presenter);
        public void begin();
    }

    public interface Presenter{
        public void setView(View view);
        public void setModel(Model model);
        public void addTask(Task task);
        public void deleteTask(Task task);
        public void editTask(Task task);
        public void loadData();
        public void writeData();
        public ArrayList<Task> getTasks();
    }

}
