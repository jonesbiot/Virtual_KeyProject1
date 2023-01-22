package course_end_project1;

import course_end_project1.entities.*;
import course_end_project1.screens.WelcomeScreen;
import course_end_project1.services.DirectoryService;
import course_end_project1.services.ScreenService;

import java.util.Optional;


public class VirtualKeyApplication {

    public static void main(String[] args) {

    	WelcomeScreen welcome = new WelcomeScreen();
    	welcome.Show();
    	welcome.GetUserInput();
        DirectoryService.PrintFiles();
        //WelcomeScreen screen = new WelcomeScreen();

        //ScreenService.getCurrentScreen().Show();
        ScreenService.getCurrentScreen().GetUserInput();

    }
}