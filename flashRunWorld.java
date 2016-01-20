import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


import java.io.*;

import java.util.ArrayList;


/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flashRunWorld extends World
{

    // variables that specify where and how the output lines will be printed to the screen
    int yStart=10;
    int xStart=100;
    int yMax=150;
    int lineHeight=16;
    int curYline=yStart;
    
    // A variable identifying your resource file, these files have to live in your
    // project directory and will get zipped up into a jar file when you create a
    // java applet.  You can use a ClassLoader object to read these files into your
    // scenario.
    
    private String fileName = "greefoot-sample-questions.txt";
    public ArrayList<String> lines;
    public int maxLines;//=4;
    
     /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public flashRunWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
        try {
          lines = loadFile(fileName);
          maxLines=lines.size();
        }
        catch (IOException ioe){
            System.out.println("error");
        }
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

   

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
  
        fileReader readFile = new fileReader();
        addObject(readFile, 301, 206);
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
          
          //showText("b)"+qAndA[2], 100,140);
          //showText("c)"+qAndA[3], 100,155);
          //showText("c)"+qAndA[4], 100,175);
        }
        
   public int getMaxLines(){
       return maxLines;
    }
    
   public static String fixedLengthString(String string, int length) {
    return String.format("%1$"+length+ "s", string);
} 
}

