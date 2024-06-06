package co.edu.uptc.presenters;

import java.util.ArrayList;

import co.edu.uptc.interfaces.TodoInterface;
import co.edu.uptc.interfaces.TodoInterface.Model;
import co.edu.uptc.interfaces.TodoInterface.View;
import co.edu.uptc.pojos.Task;
import lombok.Getter;
@Getter
public class Presenter implements TodoInterface.Presenter{
    private TodoInterface.View view;
    private TodoInterface.Model model;

    @Override
    public void setView(View view) {
        this.view = view;
    }

    @Override
    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public void addTask(Task task) {
        model.addTask(task);
    }

    @Override
    public void deleteTask(Task task) {
       model.deleteTask(task);
    }

    @Override
    public void editTask(Task task) {
        model.editTask(task);
    }

    @Override
    public void loadData() {
        model.loadData();
    }

    @Override
    public void writeData() {
        model.writeData();
    }

    @Override
    public ArrayList<Task> getTasks() {
        return model.getTasks();   
    }
}
