import org.code.neighborhood.*;

public class Background extends PainterPlus {
  

  public void drawBackground(int gridSize) {
    // implement on your own
    setPaint(gridSize * gridSize);
    while (canMove("south")){
    paintAcross("ForestGreen");
    turnToWest();
    paintAcross("ForestGreen");
    turnToEast();
    }
  }
  public void paintAcross(String color){
    while (canMove()){
      paint("ForestGreen");
      move();
    }
    paint("ForestGreen");
  }

  public void turnToEast(){
if(isFacingWest()){
  turnLeft();

  if(canMove()){
    move();
  }
  turnLeft();
    }    
  }

  public void turnToWest(){
    if (isFacingEast()){
      turnRight();

      if(canMove()) {
        move();
      }
      turnRight();
    }
  }
   public void resetPosition() {
    if (isFacingEast()) {
      turnLeft();

      while (canMove()) {
        move();
      }

      turnLeft();

      while (canMove()) {
        move();
      }

      turnLeft();
      turnLeft();
    }
  }
}
   