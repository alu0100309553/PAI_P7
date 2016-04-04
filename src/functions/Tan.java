/**
 * Author: Rubén Labrador Páez.
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 3 - Computación
 * Subject: Programación de aplicaciones interactivas.
 * Practice: 7
 * Class/Program: Functions
 * File: Tan.java
 * @author Rubén Labrador Páez
 * @version 1.0 4/04/2016
 **/
package functions;

public class Tan extends Function {
  
  public double f (double x){
    return  Math.tan(x/30) * x * x;
  }

}
