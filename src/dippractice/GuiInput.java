/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

import javax.swing.JOptionPane;

/**
 *
 * @author murbanski
 */
public class GuiInput implements InputStrategy {

    @Override
    public String inputMsg() {
        String text;
        
        text = JOptionPane.showInputDialog(
                "Please enter some text, then press return:");
        return text;
        
    }
    
}
