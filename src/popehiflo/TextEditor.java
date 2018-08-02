package popehiflo;

import javax.swing.JFrame;

/**
 *
 * @author popehiflo
 */
public class TextEditor {

    public static void main(String[] args) {
        // TODO code application logic here
        textEditorGui obj = new textEditorGui();
        obj.setBounds(0, 0, 700, 700);
        obj.setTitle("Editor de texto");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
