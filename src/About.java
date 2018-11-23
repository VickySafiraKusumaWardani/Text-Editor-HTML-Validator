/** 
Authors:
Shivank Pahwa
Sheena Gupta
Shubhra Pandey
Rishika Chowdhary
Shreya Nigam
**/
package simplejavatexteditor;
import UI;
import javax.swing.*;
import java.awt.FlowLayout;

public class About{

    private final JFrame frame;
    private final JPanel panel;
    private String contentText;
    private final JLabel text;

    public About(UI ui) {
        panel = new JPanel(new FlowLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500,300);
        frame.setLocationRelativeTo(ui);
        text = new JLabel();
    }

   
    public void software() {
        frame.setTitle("About Me -  html_PAD" );

        contentText =
        "<html><body><p>" +
        "Name: html_PAD " + "<br />" +
        "Version: 1.0 " + 
        "</p></body></html>";

        text.setText(contentText);
        panel.add(text);
        frame.add(panel);
    }

}
