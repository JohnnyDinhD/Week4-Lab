package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//File Reader and Print Write import classes
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.FileReader;
//import java.io.FileWriter;
import java.io.File;

//JavaBean or Java class import 
import models.Note;

/**
 *
 * @author 792268
 */

public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Retrieve file path
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        //Read the txt file path
        BufferedReader br = new BufferedReader(new FileReader(new
        File(path)));
        
        String titleInfo = br.readLine();
        String contentInfo = br.readLine();
        //NOTE: fixed issue with lines from "note.txt" not showing, removed 3rd empty line
        //NOTE: issue returned and not showing lines again
        //NOTE: discovered that when txt file is edited / saved, changes are shown
        
        //Write to a file
        //PrintWriter pw = new PrintWriter(new BufferedWriter(new
        //FileWriter(path, false)));
        
        //Setting attributes and parameters
        request.setAttribute("titleInfo", titleInfo);
        request.setAttribute("contentInfo", contentInfo);

        //Declaring a reference object for Note.java class
        Note note = new Note(titleInfo, contentInfo);
        request.setAttribute("note", note);
        
        //Getting the web page JSP "viewnote" to display
        //Attribute for edit parameter in viewnote.jsp
        String edit = request.getParameter("edit");
        if (edit == "") {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                    .forward(request, response);
        }
        else {            
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
                    .forward(request, response);
        }
 
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                
        //String titleContent = request.getAttribute("");
        //request.setAttribute("titleContent", titleContent);
        
        //String contentsInfo = request.getAttribute("");
        //request.setAttribute("contentInfo"), contentInfo);
        
        getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
                .forward(request, response);
        
        
    }
}
