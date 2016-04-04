/**
 * Author: Rubén Labrador Páez.
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 3 - Computación
 * Subject: Programación de aplicaciones interactivas.
 * Practice: 7
 * Class/Program: Face
 * File: GUI.java
 * @author Rubén Labrador Páez
 * @version 1.0 4/04/2016
 **/

package face;



import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class GUI extends JFrame {
  public GUI () {
    setLayout (new GridLayout(1, 1, 1, 1));
    setSize(200, 200);
    setTitle ("FACE");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Face face = new Face();
    add(face);

    setVisible(true);

  }
}

