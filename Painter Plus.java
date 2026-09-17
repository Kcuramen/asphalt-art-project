import org.code.neighborhood.*;
public class PainterPlus extends Painter {

  // Level 7A: Picks up all the paint if the painter is standing on multiple buckets
  public void takeAllPaint() {
    while (isOnBucket()) {
      takePaint();
    }
  }

  // Level 7B: Move Fast

  // Level 7C: Paint to Empty

  // Level 7D: Paints a donut (3x3 with center no color)
  public void paintDonut(String color) {
    while (hasPaint()) {
    
      turnRight();
      paint(color);
    
    }
  }
    public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }
  
}
