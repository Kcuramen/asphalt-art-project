import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
 
  Background bg = new Background();
    
    bg.setPaint(64);
    bg.drawBackground(8);
// draw the background green
    int paintAmount = bg.getMyPaint();
    System.out.println("Painter has" + paintAmount + "units of paint.");
// draws the eyes in black
creeperEyes creeper = new creeperEyes();
    creeper.setPaint(22);
    creeper.drawEyes("Black");

// draws the mouth in black
creeperMouth creepers = new creeperMouth();
    creepers.setPaint(14);
    creepers.creepersMouth("Black");

// draws the teeth black
creeperTeeth creeperest = new creeperTeeth();
    creeperest.setPaint(4);
    creeperest.drawTeeth("Black");
  }
}