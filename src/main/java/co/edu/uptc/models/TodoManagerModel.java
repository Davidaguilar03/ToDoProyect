package co.edu.uptc.models;

import java.util.ArrayList;

import co.edu.uptc.interfaces.TodoInterface;
import co.edu.uptc.interfaces.TodoInterface.Presenter;
import co.edu.uptc.pojos.Task;
import co.edu.uptc.utilities.UniqueIDGenerator;
import lombok.Getter;

@Getter
public class TodoManagerModel implements TodoInterface.Model{
    private ArrayList<Task> tasks;
    private TodoInterface.Presenter presenter;

    public TodoManagerModel(){
        tasks = new ArrayList<>();
    }


    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void addTask(Task task) {
       if(task != null){
            task.setId(UniqueIDGenerator.getUniqueID());
            Task taskToAdd = task.clone();
            tasks.add(taskToAdd);
       }
    }

    @Override
    public void deleteTask(Task taskToDelete) {
        if (taskToDelete != null) {
            for (int i = 0; i < tasks.size(); i++) {
                if (tasks.get(i).getId()== taskToDelete.getId()) {
                    this.tasks.remove(i);
                }
            }
        }
    }

    @Override
    public void editTask(Task taskToEdit) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == taskToEdit.getId()) {
                tasks.remove(i);
                tasks.add(i, taskToEdit);
            }
        }
    }

    @Override
    public void loadData() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'loadData'");
    }

    @Override
    public void writeData() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'writeData'");
    }

    @Override
    public ArrayList<Task> getTasks() {
        ArrayList<Task> auxTasks = new ArrayList<>();
        for (Task task : tasks) {
            auxTasks.add(task.clone());
        }
        return auxTasks;
    }

}
