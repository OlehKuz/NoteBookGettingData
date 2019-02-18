package controller;

import static view.ViewConstants.SPACE;
import static controller.Regex.REGEX_NAME_UKR;

import model.UserData;
import model.NoteBook;
import view.View;
import java.util.Scanner;

public class ControllerGeneral {
    private NoteBook notebook;
    private View view;

    public ControllerGeneral(View view, NoteBook noteBook){
        this.notebook = notebook;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        UserData tempUser = new UserData();
        collectInfo(tempUser);
        notebook.addNewUser(tempUser);
    }

    private void collectInfo(UserData tempUser){

    }

}
