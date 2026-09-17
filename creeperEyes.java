import org.code.neighborhood.*;

public class creeperEyes extends PainterPlus {

public void drawEyes(String color){
  turnRight();
  move();
  turnLeft();
  move();
 paint(color);
  move();
  paint(color);
  move();
  move();
  move();
  paint(color);
  move();
  paint(color);
  turnRight();
  move();
  turnRight();
  paint(color);
  move();
  paint(color);
  move();
  move();
  move();
  paint(color);
  move();
  paint(color);
  move();
  turnLeft();
  if (canMove()){
    move();
    move();
    move();
    move();
    move();
  }
  else {
    turnLeft();
    turnLeft();
  }
}
}
