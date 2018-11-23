/** 
Authors:
Shivank Pahwa
Sheena Gupta
Shubhra Pandey
Rishika Chowdhary
Shreya Nigam
**/

package simplejavatexteditor;

import javax.swing.JTextPane;

public class SimpleJavaTextEditor extends JTextPane {

    private static final long serialVersionUID = 1L;
    public final static String AUTHOR_EMAIL = "........................";
    public final static String NAME = "Text Editor";
        public final static String EDITOR_EMAIL = "..................";
    public final static double VERSION = 1.0;

    public static void main(String[] args) {
        new UI().setVisible(true);
    }

}
