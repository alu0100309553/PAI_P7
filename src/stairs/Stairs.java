/**
 * Author: Rubén Labrador Páez.
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 3 - Computación
 * Subject: Programación de aplicaciones interactivas.
 * Practice: 7
 * Class/Program: Stairs
 * File: Stairs.java
 * @author Rubén Labrador Páez
 * @version 1.0 4/04/2016
 **/
package stairs;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Stairs extends JPanel {
  
  public void paintComponent (Graphics g){
    int width = (int)(getWidth() * 0.9);
    int high = (int)(getHeight() * 0.9);
    int xOffset = (int)(getWidth() * 0.05); 
    int yOffset = (int)(getHeight() * 0.05);
    for (int i = 1 ; i <= 10 ; i++){
      g.setColor(Color.BLACK);
      g.drawRect(xOffset, (int)(0.1 * high * (i-1)) + yOffset, (int)(0.1 * width * i), (int)(0.1 * high));
    }
  }

}
