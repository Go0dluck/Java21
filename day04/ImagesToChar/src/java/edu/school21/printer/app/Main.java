package edu.school21.printer.app;
import edu.school21.printer.logic.PrintImage;

public class Main {
    public static void main(String[] args){
        parser(args);
        PrintImage printImage = new PrintImage(args[0].toCharArray()[0], args[1].toCharArray()[0]);
        printImage.parseImage();
    }

    private static void parser(String[] args){
        if (args.length != 2 || args[0].length() > 1 || args[1].length() > 1){
            System.err.println("Error argument");
            System.exit(-1);
        }
    }
}
