package view;

public class View {

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
