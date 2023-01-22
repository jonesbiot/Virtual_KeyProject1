package course_end_project1.services;

import course_end_project1.screens.FileOptionsScreen;
import course_end_project1.screens.Screen;
import course_end_project1.screens.WelcomeScreen;


public class ScreenService {

	public static WelcomeScreen WelcomeScreen = new WelcomeScreen();
    public static FileOptionsScreen FileOptionsScreen = new FileOptionsScreen();



    public static Screen CurrentScreen = WelcomeScreen;

    public static Screen getCurrentScreen() {
        return CurrentScreen;
    }

    public static void setCurrentScreen(Screen currentScreen) {
        CurrentScreen = currentScreen;
    }

}
 