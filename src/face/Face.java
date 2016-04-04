/**
 * Author: Rubén Labrador Páez.
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 3 - Computación
 * Subject: Programación de aplicaciones interactivas.
 * Practice: 7
 * Class/Program: Face
 * File: Face.java
 * @author Rubén Labrador Páez
 * @version 1.0 4/04/2016
 **/

package face;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Face extends JPanel {
  
  public void paintComponent (Graphics g){
    int width = this.getWidth();
    int high = this.getHeight();
    int faceD = (int) (Math.min(width, high) * 0.8);
    
    g.drawOval((int)(width - faceD) / 2, (int)(high - faceD) / 2, faceD, faceD);
    g.setColor(Color.BLACK);
    g.fillRect((int)((width / 2) - (0.3 * faceD)), (int)((high / 2) - (0.3 * faceD)), (int)(faceD * 0.2), (int)(faceD * 0.05));
    g.fillRect((int)((width / 2) + (0.1 * faceD)), (int)((high / 2) - (0.3 * faceD)), (int)(faceD * 0.2), (int)(faceD * 0.05));
    g.fillRect((int)((width / 2) - (0.07 * faceD)), (int)((high / 2) + (0.12 * faceD)), (int)(0.14 * faceD), (int)(0.05 * faceD));
    g.setColor(Color.BLUE);
    g.fillOval((int)((width / 2) - (0.3 * faceD)), (int)((high / 2) - (0.2 * faceD)), (int)(faceD * 0.2), (int)(faceD * 0.2));
    g.fillOval((int)((width / 2) + (0.1 * faceD)), (int)((high / 2) - (0.2 * faceD)), (int)(faceD * 0.2), (int)(faceD * 0.2));
    g.setColor(Color.RED);
    g.drawLine((int)((width / 2) - (0.15 * faceD)), (int)((high / 2) + (0.2 * faceD)), (int)((width / 2) + (0.15 * faceD)), (int)((high / 2) + (0.2 * faceD)));
  }

}
