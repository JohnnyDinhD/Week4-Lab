package models;

import java.io.Serializable;

/**
 *
 * @author 792268
 */

public class Note implements Serializable {
    //Variables
    private String titleInput;
    private String contentInput;
    
    //Default no-arg constructor
    public Note() {
        titleInput = "This is the title";
        contentInput= "Contents go here";
    }
    
    //Note Edit Constructor
    public Note(String titleInput, String contentInput) {
        this.titleInput = titleInput;
        this.contentInput = contentInput;
    }

    //Getters
    public String getTitleInput() {
        return this.titleInput;
    }
    
    public String getContentInput() {
        return this.contentInput;
    }
    
    //Setters
    public void setTitleInput(String titleInput) {
        this.titleInput = titleInput;
    }

    public void setContentInput(String contentInput) {
        this.contentInput = contentInput;
    } 
}


