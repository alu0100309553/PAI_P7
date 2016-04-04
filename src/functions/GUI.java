/**
 * Author: Rubén Labrador Páez.
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 3 - Computación
 * Subject: Programación de aplicaciones interactivas.
 * Practice: 7
 * Class/Program: Functions
 * File: GUI.java
 * @author Rubén Labrador Páez
 * @version 1.0 4/04/2016
 **/
package functions;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class GUI extends JFrame {
  public GUI () {
    setLayout (new GridLayout(1, 3, 1, 1));
    setSize(600, 200);
    setTitle ("Functions");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Function function = new Quadratic();
    Function function2 = new Cubical();
    Function function3 = new Sin();
    add(function);
    add(function2);
    add(function3);
    setVisible(true);
  }

}
