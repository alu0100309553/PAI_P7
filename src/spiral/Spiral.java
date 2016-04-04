/**
 * Author: Rubén Labrador Páez.
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 3 - Computación
 * Subject: Programación de aplicaciones interactivas.
 * Practice: 7
 * Class/Program: Spiral
 * File: Spiral.java
 * @author Rubén Labrador Páez
 * @version 1.0 4/04/2016
 **/
package spiral;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Spiral extends JPanel {
  private final int LAPS = 12;
  
  public void paintComponent (Graphics g){
    int width = (int)(getWidth() * 0.9);
    int high = (int)(getHeight() * 0.9);
    int xOffset = (int)(getWidth() * 0.05); 
    int yOffset = (int)(getHeight() * 0.05);
    double offset = (double)((double)1/(2*LAPS));
    
    for (int i = 0 ; i < LAPS ; i++){
      g.setColor(Color.BLACK);
      g.drawLine(xOffset + (int)(width * offset * i), yOffset + (int)(high * offset *i), width - (int)(width * offset *i), yOffset + (int)(high * offset *i));
      g.drawLine(width - (int)(width * offset *i), yOffset + (int)(high * offset *i), width - (int)(width * offset *i), high - (int)(high * offset *i));
      if (i < LAPS-1){
        g.drawLine(width - (int)(width * offset *i), high - (int)(high * offset *i), xOffset + (int)(width * offset *(i + 1)), high - (int)(high * offset *i));
        g.drawLine(xOffset + (int)(width * offset * (i+1)), high - (int)(high * offset *i), xOffset + (int)(width * offset * (i + 1)), yOffset + (int)(high * offset * (i + 1)));
      }
    }

  }

}
