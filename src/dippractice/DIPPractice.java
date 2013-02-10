/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

/**
 *
 * @author murbanski
 */
public class DIPPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //OutputStrategy outStrategy = new ConsoleOutput();
        InputStrategy inStrategy = new ConsoleInput();
        OutputStrategy outStrategy = new GuiOutput();
        MessageService msgService = new MessageService();
        msgService.outputMsg(outStrategy, inStrategy);
        InputStrategy inStrategy2 = new GuiInput();
        msgService.outputMsg(outStrategy, inStrategy2);
        
    }
}
