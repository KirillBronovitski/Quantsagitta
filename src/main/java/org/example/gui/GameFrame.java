package org.example.gui;
import javax.swing.*;
import java.awt.*;
public class GameFrame extends JFrame {
    public GameFrame() throws HeadlessException {
        super("Quantsagitta");

        //to consider window location relative to the monitor screen
        setLocationRelativeTo(null);

        //getting the monitor screen size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();


        Dimension gameFrameSize = new Dimension(screenSize.width * 5 / 8, screenSize.height * 3 / 4);
        setSize(gameFrameSize);


        setLocation((screenSize.width - gameFrameSize.width)/2,(screenSize.height - gameFrameSize.height)/2);

        //to show our window
        setVisible(true);

        //to make close window button stop the execution of the entire application
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}