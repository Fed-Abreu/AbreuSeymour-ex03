import javax.sound.midi.SysexMessage;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution03 {
    /*
    print "What is the quote?"
    add scanner string quote = input
    print "Who said it?"
    Scan string name = input
    print name + "says, " + \"quote\"
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String quote = input.nextLine();
        System.out.print("Who said it? ");
        String name = input.nextLine();
        System.out.print(name + " says, " + "\"" + quote +"\"");



    }
}
