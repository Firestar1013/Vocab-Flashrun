import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.awt.Color;

public class question extends Actor
{private static final GreenfootImage DEFAULT_IMG = new GreenfootImage(1, 1);
    private static final int LINE_LENGTH = 60;
    private String[] text;
    //private List<Answer> answers;
    private String explanation = "";
    private int value;
    private static GreenfootImage img;
    private boolean displayAnswers = true;
    private Title world;
    /**
     * Act - do whatever the ExampleReader wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     int curLine=0;
     String l;
    /**
     * Create a new question.
     *
     * @param question The question text.
     * @param questionValue The value of the question.
     */
    public question(String question, int questionValue) {
       text = Title.wordWrap(question, LINE_LENGTH);
       // answers = new ArrayList<Answer>();
      //  value = questionValue;
    }
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){
     //   ((MyWorld) getWorld()).printLine(curLine);
       
     
      //  Greenfoot.stop();
    }
}
 /**
     * Save the world and draw it.
     *
     * @param w the world.
     */
    public void addedToWorld(World w) {
       World world = (Title) w;
       draw();
       // world.startTimer();
    }

    /**
     * Draw the question screen.
     */
    private void draw() {
        final int BORDER = 30;
        if (img == null) {
            World w = getWorld();
            img = new GreenfootImage(w.getWidth(), w.getHeight());
        }
        img.setColor(Color.BLUE);
        img.fill();
        //img.setFont(Title.SMALL_FONT);
        img.setColor(Color.WHITE);

        for (int i = 0; i < text.length; i++) {
            img.drawString(text[i], 30, 40 + (i * 20));
        }

        setImage(img);

    // if (displayAnswers && answers.size() != 0) {
            World w = getWorld();
            img.drawString("Press space or click to continue..." , BORDER,
                img.getHeight() - BORDER);
           /* for (int i = 0; i < answers.size(); i++) {
                w.addObject(answers.get(i), world.getWidth() / 2,
                    (text.length * 25 + LINE_LENGTH) + i * 40);
                   
            }*/
      /*  } else {
            
        }*/
    }
}

