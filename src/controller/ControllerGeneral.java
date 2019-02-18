package controller;

import view.ViewConstants;
import controller.Regex;


import static controller.Regex.REGEX_NAME_UKR;


import model.UserData;
import model.NoteBook;
import view.View;
import view.ViewConstants;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    private String getValidInput(Scanner sc, String message, String regex){
        String input;
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher matcher;
        while(true){
            view.print(message);
            input = sc.next();
            matcher = pattern.matcher(input);
            if(matcher.matches()) break;
            else {
                view.print(ViewConstants.WRONG_INPUT_DATA);
            }
        }
        return input;
    }
}
