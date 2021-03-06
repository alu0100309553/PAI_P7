/**
 * Author: Rubén Labrador Páez.
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 3 - Computación
 * Subject: Programación de aplicaciones interactivas.
 * Practice: 7
 * Class/Program: Quadratic
 * File: GUI.java
 * @author Rubén Labrador Páez
 * @version 1.0 4/04/2016
 **/
package quadratic;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class GUI extends JFrame {
  public GUI () {
    setLayout (new BorderLayout(0, 0));
    setSize(200, 200);
    setTitle ("Quadratic");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Function function = new Function();
    function.draw();
    add(function, BorderLayout.CENTER);
    setVisible(true);
  }

}
