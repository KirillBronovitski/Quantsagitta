package org.example.gui;
import javax.swing.*;
import java.awt.*;
public class GameFrame extends JFrame {
    
    public GameFrame() throws HeadlessException {
        super("Quantsagitta");
        
        // Potentially the main game frame/window could contain a lot of different elements, such as main manu,
        // left navigation bar with additional game statuses, right bar with some game assets, maybe bottom bar
        // with some info etc., so it would be a good idea to make the main window a container for all of those
        // panels and bars and one of those panels is the main field panel.
        // So, for now, let's create the game field and insert it inside the main game window.
        GameField gameField = new GameField(); // go to the GameField class definition to get more information
        // about this class.
        
        // Now, let's insert game panel into main window (main JFrame)
        getContentPane().add(gameField);
        
        // From now, we have defined the size of the game field in the gameField instance of the GameField class
        // So, we don't need to specify the size of the main window, it will depend on the gameField size.
        // To adjust main game frame/window size to be as compact as it need to contain gameField panel
        // we use the JFrame pack() method
        pack();
        
        // to make window location relative to the monitor screen, and place it to the center of the screen
        // just call this JFrame method with `null` instead of reference to the parent window
        setLocationRelativeTo(null);
        
        // to make close window button stopping the execution of the entire application we use the following
        // JFrame method `setDefaultCloseOperation()` and pass into it the predefined java swing
        // constant `EXIT_ON_CLOSE`
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // now we are ready to show our window
        setVisible(true);
    }
}