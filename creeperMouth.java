import org.code.neighborhood.*;
public class creeperMouth extends PainterPlus {

  public void creepersMouth (String color){
    turnRight();
    move();
    move();
    move();
    turnLeft();
    move();
    move();
    move();
    paint(color);
    move();
    paint(color);
    move();
    turnRight();
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    turnLeft();
    move();
    paint(color);
    turnLeft();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    turnRight();
    move();
    move();
    turnRight();
    while (canMove()){
      move();
    }
    
    
  }
}