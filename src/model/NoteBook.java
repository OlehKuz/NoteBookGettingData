package model;

import java.util.Map;
import java.util.HashMap;


public class NoteBook {

    private Map<String, UserData> users = new HashMap<String, UserData>();

    public NoteBook(){

    }

    public boolean addNewUser(UserData user) {
        if(users.containsKey(user.getUniqueName())){
            return false;
        }
        else{
            users.put(user.getUniqueName(), user);
            return true;
        }
    }
}
