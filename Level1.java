import greenfoot.*; // (World, Actor, GreenfootImage, and Greenfoot)
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;

import java.io.*;

import java.util.ArrayList;

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
   private String fileName = "greefoot-sample-questions.txt";
    public ArrayList<String> lines;
    public int maxLines;
    int yStart=10;
    int xStart=100;
    int yMax=150;
    int lineHeight=16;
    int curYline=yStart;
    int questionNum=0;
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1(int questionNumLocal)
    {  
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 720, 1); 
        questionNum = questionNumLocal;
       
          GreenfootImage g=new GreenfootImage(500,10);
          
          prepare();
          try {
          lines = loadFile(fileName);
          maxLines=lines.size();
        }
        catch (IOException ioe){
            System.out.println("error");
        }
        
    }
  
     private void prepare ()
     {
         ButtonL1Q1 buttonl1q1 = new ButtonL1Q1();
    
        addObject(buttonl1q1, 139, 300);
        eachQuestion eachQuest = new eachQuestion(questionNum);
        addObject(eachQuest, 500,300);
        //printQ(questionNum);
        }
        private void loadRound(String filename) throws IOException {
   
        ArrayList<String> lines = loadFile(filename);
  
    }
    
    private ArrayList<String> loadFile(String filename) throws IOException {
        ArrayList<String> lines = new ArrayList<String>();
        
        // Allow loading from JAR files
        
        // "filename" has to reference a file in the project directory used to
        // create the jar file.
        
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream is = classLoader.getResourceAsStream(filename);
        if (is == null) {
            throw new IOException("No such file: " + filename);
        }
        BufferedReader reader = new BufferedReader(
                                new InputStreamReader(is));
        String line = reader.readLine();
        while (line != null) {
            
            // Note that we are ignoring lines that start with "#". This way we
            // can add comments to our data file.
            if (!line.equals("") && !line.startsWith("#")) {
                lines.add(line);
            }
            line = reader.readLine();
        }
        reader.close();
        return lines;
    }

   

    
// Prints one line of text, assuming certain things about height and starting location
    public void printText(String s){
        showText(s, xStart,curYline);
        curYline+=lineHeight;
        if (curYline>yMax)
           curYline=yStart;
    }
// Prints all lines.  A similar loop could be used to parse lines into individual
// questions and answers, for instance, using the method String.split()

    public void printLines(){
         for (String line: lines)
          printText(line);
        }
    public void printLine(int lineno){
         
          showText(lines.get(lineno),xStart,yStart);
        }      
    /*
     * This method takes a line of text, splits in on commas, and stores it into an
     * array.  It then prints each element of the array at a specified location on the
     * screen.  For an actual game, you may want to use this same mechanism to populate
     * an array list of question objects.  That way you can manipulate them in your game
     * by writing and using a series of question methods.
     */
    public void printQ(int lineno){
          String l=lines.get(lineno) ;
          String[] qAndA = l.split(",");
          showText("Q:"+ fixedLengthString(qAndA[0],30), 200,80);
          showText(fixedLengthString("a) "+ qAndA[1],30), 200,120);
          showText(fixedLengthString("b) "+qAndA[2],30), 200,135);
          showText(fixedLengthString("c) "+qAndA[3],30), 200,150);
          showText(fixedLengthString("d) "+qAndA[4],30), 200,165);
        System.out.println(fixedLengthString(qAndA[0],30));
          
          //showText("b)"+qAndA[2], 100,140);
          //showText("c)"+qAndA[3], 100,155);
          //showText("c)"+qAndA[4], 100,175);
        }
        
   public int getMaxLines(){
       return maxLines;
    }
    public String getLines()
    {
       // System.out.println(lines.get(3));
        String l=lines.get(questionNum) ;
          String[] qAndA = l.split(",");
       // System.out.println("HOW");
         return(fixedLengthString(qAndA[0],30));
        //return lines.get(3);
    }
    
   public static String fixedLengthString(String string, int length) {
    return String.format("%1$"+length+ "s", string);
} 
}


