/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

/**
 *
 * @author murbanski
 */
public class ConsoleOutput implements OutputStrategy {
    @Override
    public void outputMsg(String msg) {
        System.out.println(msg);
    }
}
