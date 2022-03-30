import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);

  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {


	// Grid (quadrant 1) 
  
  for (int lineX = 0; lineX <= height /2 ; lineX += height / 20) {
    stroke(0, 0, 0);
    line(lineX, 0, lineX, height / 2);
  }

  for (int lineY = 0; lineY <= width / 2; lineY += width / 20) {
    stroke(0, 0, 0);
    line(0, lineY, width / 2, lineY);
  }
    
// Circles (quadrant 2)
  fill(255, 0, 0);
  for (int circleY = height / 20; circleY <= height / 2; circleY += height / 10) {
    for (float circleX = height / 1.8f; circleX <= height; circleX += height / 10) {
      ellipse(circleX, circleY, height / 20, width / 20);
    }
  }

// Gradient (quadrant 3)
  for (int lineYtwo = 0; lineYtwo <= height / 2; lineYtwo += 1) {
    stroke(lineYtwo);
    line(lineYtwo, height / 2, lineYtwo, width);
  }
  
// Flower (quadrant 4)
  int petalCount = 0;

  translate(height / 1.3f, width / 1.3f);
  for (petalCount = 0; petalCount < 8; petalCount += 1) {
    rotate(TWO_PI / 8);
    fill(252, 111, 3);
    stroke(1);
    ellipse(0, 0, height / 4, width / 26);
    fill(48, 255, 104);
    ellipse(0, 0, height / 11, width / 11);
    }
  }
}