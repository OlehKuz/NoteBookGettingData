package view;

import static view.ViewConstants.INPUT_STRING_DATA;
public class View {
    public static final String SPACE = " ";

    public void print(String message) {
        System.out.println(message);
    }

    public String concatenate(String... str){
        StringBuilder concatenated = new StringBuilder();
        for(String s : str) {
            concatenated.append(s);
        }
        return new String(concatenated);
    }
}
