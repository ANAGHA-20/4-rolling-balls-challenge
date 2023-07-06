import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int C = 10;
    int B1y = HEIGHT/5;
    int B1x = 0;
    int B2y = 2*HEIGHT/5;
    int B2x = 0;
    int B3y = 3*HEIGHT/5;
    int B3x = 0;
    int B4y = 4*HEIGHT/5;
    int B4x = 0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }
    
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        frameRate(30);
    }

    @Override
    public void draw() {
        super.draw();
        this.finished = false;
//        System.out.println("draw");
        ellipse(B1x, B1y, C,C );
        B1x++;
        ellipse(B2x, B2y, C, C);
        B2x= B2x + 2;
        ellipse(B3x, B3y, C, C);
        B3x= B3x + 3;
        ellipse(B4x, B4y, C, C);
        B4x= B4x + 4;
    }

}
