package edu.school21.printer.logic;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PrintImage {
    private char black;
    private char white;
    private BufferedImage image;
    private FileInputStream fileInputStream;

    public PrintImage(char white, char black) {
        this.black = black;
        this.white = white;
    }
//    File file = new File(System.getProperty("user.dir") + "/target/resources/image.bmp");
    public void parseImage(){
        try {
            fileInputStream = new FileInputStream(System.getProperty("user.dir")+ "\\src\\resources\\it.bmp");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            image = ImageIO.read(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        char[][] array2D = new char[image.getHeight()][image.getWidth()];
        for (int xPixel = 0; xPixel < image.getHeight(); xPixel++)
        {
            for (int yPixel = 0; yPixel < image.getWidth(); yPixel++)
            {
                int color = image.getRGB(yPixel, xPixel);
                if (color== Color.BLACK.getRGB()) {
                    array2D[xPixel][yPixel] = black;
                } else if (color == Color.WHITE.getRGB()){
                    array2D[xPixel][yPixel] = white;
                }
            }
        }
        printArray(array2D);
    }

    public void printArray(char[][] array2D){
        for (int x = 0; x < array2D.length; x++)
        {
            for (int y = 0; y < array2D[x].length; y++)
            {
                System.out.print(array2D[x][y]);
            }
            System.out.println();
        }
    }
}
