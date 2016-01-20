import greenfoot.*;

/**
 * Write a description of class ButtonInstructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonInstructions extends Actor
{
    /**
     * Act - do whatever the ButtonInstructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        click();
    }    
    private void click()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Instructions());
        }
    }
}
