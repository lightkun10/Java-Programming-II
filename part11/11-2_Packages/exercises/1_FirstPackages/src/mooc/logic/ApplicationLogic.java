package mooc.logic;

import mooc.ui.UserInterface;

public class ApplicationLogic {

    private UserInterface ui;

    // The constructor of the ApplicationLogic class.
    // It receives as a parameter a class that implements
    // the UserInterface interface.
    // NB: For application logic to see the interface,
    // it must be "imported". Add the line import mooc.ui.UserInterface at the beginning of the file.
    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }

    public void execute(int times) {
        int i = 0;
        while (i < times) {
            System.out.println("Application logic is working");
            ui.update();
            i++;
        }
    }
}