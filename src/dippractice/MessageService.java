package dippractice;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author murbanski
 */
public class MessageService {
    //private static final String MSG = "Hello";
    
    //public void outPutMsg() {
        //rigid because it outputs to System.out
        //fragile because changing the output may break other things
        //immobile, can't be used for non-console apps
        //System.out.println("MSG");
        
    //}
    //Still has problems because it depends on a concrete class
    public void outputMsg(OutputStrategy out, InputStrategy in) {
        String message = in.inputMsg();
        out.outputMsg(message);
    }
}
