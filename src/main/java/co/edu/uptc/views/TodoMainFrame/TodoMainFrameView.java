package co.edu.uptc.views.TodoMainFrame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import co.edu.uptc.interfaces.TodoInterface;
import co.edu.uptc.interfaces.TodoInterface.Presenter;
import co.edu.uptc.utilities.PropertiesService;
import lombok.Getter;

import java.awt.BorderLayout;
import java.awt.Image;

@Getter
public class TodoMainFrameView extends JFrame implements TodoInterface.View{
    private TodoInterface.Presenter presenter;
    private PropertiesService propertiesService;
    private TodoMainFrameHeader todoMainFrameHeader;
    private TodoMainFrameBody todoMainFrameBody;
    private TodoMainFrameFooter todoMainFrameFooter;

    public TodoMainFrameView(){
        propertiesService = new PropertiesService();
        this.initFrame();
        this.createTodoMainFrameHeader();
        this.createTodoMainFrameBody();
        this.createTodoMainFrameFooter();
    }


    @Override
    public void begin() {
        this.setVisible(true);
    }

    private void initFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("To do App");
        this.setLayout(new BorderLayout());
        this.setSize(450,800);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        ImageIcon windowIcon = new ImageIcon(propertiesService.getKeyValue("TodoIconPath"));
        Image image = windowIcon.getImage();
        this.setIconImage(image);
    }

    private void createTodoMainFrameHeader(){
        todoMainFrameHeader = new TodoMainFrameHeader();
        this.add(todoMainFrameHeader, BorderLayout.NORTH);
    }

    private void createTodoMainFrameBody(){
        todoMainFrameBody = new TodoMainFrameBody();
        this.add(todoMainFrameBody);
    }

    private void createTodoMainFrameFooter(){
        todoMainFrameFooter = new TodoMainFrameFooter();
        this.add(todoMainFrameFooter, BorderLayout.SOUTH);
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

}
