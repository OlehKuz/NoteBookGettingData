import controller.ControllerGeneral;
import view.View;
import model.NoteBook;

public class Main {

    public static void main(String[] args) {
	    ControllerGeneral controller = new ControllerGeneral(
	            new View(), new NoteBook());
        controller.processUser();
    }

}
