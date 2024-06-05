package co.edu.uptc.pojos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor 

public class Task implements Cloneable{
    private int id;
    private String name;
    private String description;
    private boolean state;
    private LocalDate deadline;

    @Override 
    public Task clone(){
        try {
            return (Task) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
