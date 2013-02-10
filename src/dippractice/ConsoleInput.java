/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

import java.util.Scanner;

/**
 *
 * @author murbanski
 */
public class ConsoleInput implements InputStrategy
{

    @Override
    public String inputMsg() {
            System.out.println("Please enter some text, then press return:");

            Scanner input = new Scanner(System.in);
            return input.nextLine();        
    }

}
