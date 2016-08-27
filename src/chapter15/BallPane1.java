package chapter15;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import static javafx.application.Application.launch;
import javafx.beans.property.DoubleProperty;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;
import javafx.scene.effect.*;

public class BallPane1 extends Pane {
  public final double radius = 10;
  public final double radius2 = 10;
  private double x1 = radius, y1 = radius;
  private double x2 = radius, y2 = radius;
  private double dx1 = 1, dy1 = 1;
   private double dx2 = 1, dy2 = 1;
  private Circle circle1 = new Circle(x1, y1, radius);
   private Circle circle2 = new Circle(x2, y2, radius2);
   DropShadow ds1 = new DropShadow();
       
  private Timeline animation;
  private Timeline animation1;

  public BallPane1() {
    circle1.setFill(Color.GREEN); // Set ball color
    circle2.setFill(Color.BLUE); 
     ds1.setOffsetY(4.0f);
        ds1.setOffsetX(4.0f);
        ds1.setColor(Color.CORAL);
        Reflection r = new Reflection();
        r.setFraction(0.9);
 
        circle1.setEffect(r);
 
     
        circle2.setEffect(ds1);
    getChildren().add(circle1); // Place a ball into this pane
     getChildren().add(circle2);
    // Create an animation for moving the ball
    animation = new Timeline(
      new KeyFrame(Duration.millis(50), e -> moveBall1()));
    animation.setCycleCount(Timeline.INDEFINITE);
    animation.play(); // Start animation
    animation1 = new Timeline(
      new KeyFrame(Duration.millis(50), e -> moveBall2()));
    animation1.setCycleCount(Timeline.INDEFINITE);
    animation1.play(); //
  }

  public void play() {
    animation.play();
     animation1.play();
  }

  public void pause() {
    animation.pause();
    animation1.pause();
  }

  public void increaseSpeed() {
    animation.setRate(animation.getRate() + 0.1);
  }

  public void decreaseSpeed() {
    animation.setRate(
      animation.getRate() > 0 ? animation.getRate() - 0.1 : 0);
  }

  public DoubleProperty rateProperty() {
    return animation.rateProperty();
  }
  
  protected void moveBall1() {
    // Check boundaries
    if (x1 < radius || x1 > getWidth() - radius) {
      dx1 *= -1; // Change ball move direction
    }
    if (y1 < radius || y1 > getHeight() - radius) {
      dy1 *= -1; // Change ball move direction
    }

    // Adjust ball position
    x1 = x1+dx1;
    y1 = y1+dy1;
    circle1.setCenterX(x1);
    circle1.setCenterY(y1);
  }
  protected void moveBall2() {
    // Check boundaries
    if (x2 < radius || x2 > getWidth() - radius) {
      dx2 *= -1; // Change ball move direction
    }
    if (y2 < radius || y2 > getHeight() - radius) {
      dy2 *= -1; // Change ball move direction
    }

    // Adjust ball position
    x2 = x2+3*dx2;
    y2 = y2-3*dy2;
    circle2.setCenterX(x2);
    circle2.setCenterY(y2);
  }
   public static void main(String[] args) {
    launch(args);
  }
}