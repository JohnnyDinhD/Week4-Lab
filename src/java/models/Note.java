package models;

import java.io.Serializable;

/**
 *
 * @author 792268
 */

public class Note implements Serializable {
    //Variables
    private String titleInfo;
    private String contentInfo;
    
    //Default no-arg constructor
    public Note() {
        titleInfo = "";
        contentInfo = "";
    }
    
    //Note Edit Constructor
    public Note(String titleInfo, String contentInfo) {
        this.titleInfo = titleInfo;
        this.contentInfo = contentInfo;
    }

    //Getters
    public String getTitleInfo() {
        return this.titleInfo;
    }
    
    public String getContentInfo() {
        return this.contentInfo;
    }
    
    //Setters
    public void setTitleInfo(String titleInfo) {
        this.titleInfo = titleInfo;
    }

    public void setContentInfo(String contentInfo) {
        this.contentInfo = contentInfo;
    } 
}


