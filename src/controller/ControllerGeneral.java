package controller;

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

    public ControllerGeneral(View view, NoteBook notebook){
        this.notebook = notebook;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        UserData tempUser = new UserData();
        collectInfo(tempUser, sc);
        view.print(tempUser.toString());
        notebook.addNewUser(tempUser);
        sc.close();
    }

    private void collectInfo(UserData tempUser, Scanner sc){
        tempUser.setLastName(getValidInput(sc, ViewConstants.ENTER_YOUR_SURNAME, Regex.REGEX_NAME_UKR));
        tempUser.setFirstName(getValidInput(sc, ViewConstants.ENTER_YOUR_NAME, Regex.REGEX_NAME_UKR));
        tempUser.setUniqueName(view.concatenate(tempUser.getLastName(), ViewConstants.SPACE,
                tempUser.getFirstName().substring(0,1), ViewConstants.DOT));
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
