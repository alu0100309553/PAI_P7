/**
 * Author: Rubén Labrador Páez.
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 3 - Computación
 * Subject: Programación de aplicaciones interactivas.
 * Practice: 7
 * Class/Program: Quadratic
 * File: Function.java
 * @author Rubén Labrador Páez
 * @version 1.0 4/04/2016
 **/
package quadratic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.Collections;

import javax.sound.sampled.Line;
import javax.swing.JPanel;

class Function extends JPanel {
  private int left = -100;
  private int right = 100;
  private int y_axis = 100;
  private int x_axis = 100;
  int [] xpoints;
  int [] ypoints;
  
  private int getLeft() {
    return left;
  }
  private void setLeft(int left) {
    this.left = left;
  }
  private int getRight() {
    return right;
  }
  private void setRight(int right) {
    this.right = right;
  }
  private int getY_axis() {
    return y_axis;
  }
  private void setY_axis(int y_axis) {
    this.y_axis = y_axis;
  }
  private int getX_axis() {
    return x_axis;
  }
  private void setX_axis(int x_axis) {
    this.x_axis = x_axis;
  }
  private int[] getXpoints() {
    return xpoints;
  }
  private void setXpoints(int[] xpoints) {
    this.xpoints = xpoints;
  }
  private int[] getYpoints() {
    return ypoints;
  }
  private void setYpoints(int[] ypoints) {
    this.ypoints = ypoints;
  }
  Function (){
    setSize(500, 500);
  }
  public void draw () {
    drawFunction();
  }
  
  public void drawAxis(Graphics g){
    g.drawLine(0, getX_axis(), getWidth(), getX_axis());
    g.drawLine(getY_axis(), 0, getY_axis(), getHeight());
    g.drawLine(getY_axis(), 0, getY_axis() - 10, 10);
    g.drawLine(getY_axis(), 0, getY_axis() + 10, 10);
    g.drawLine(getWidth(), getX_axis(), getWidth() - 10, getX_axis() - 10);
    g.drawLine(getWidth(), getX_axis(), getWidth() - 10, getX_axis() + 10);
    g.drawString("X", getWidth() - 20, getX_axis() - 15);
    g.drawString("Y", getY_axis() + 15, 20);
    
  }
  
  public void drawFunction () {
    ArrayList <Double> values = new ArrayList <Double>();
    setLeft(-getWidth() / 2);
    setRight(getWidth() / 2);
    setX_axis(getHeight() / 2);
    setY_axis(getWidth() / 2);
    setXpoints(new int [getWidth() + 1]);
    setYpoints(new int [getWidth() + 1]);
    for (int x = getLeft(); x <= getRight(); x++){
      values.add((double)(x*x));
    }
    double escale = (getHeight()/2)/Collections.max(values);
    for (int i = 0; i < values.size(); i++){
      getXpoints() [i] = (i);
      getYpoints() [i] = (getX_axis()-(int)(escale* values.get(i)));
    }
  }
  
  protected void paintComponent (Graphics g) {
    draw ();
    super.paintComponent(g);
    drawAxis(g);
    g.setColor(Color.BLACK);
    g.drawPolyline(getXpoints(),getYpoints(), getWidth());
  }
}
