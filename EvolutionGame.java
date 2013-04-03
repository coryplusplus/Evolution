
import java.util.*;

import java.applet.Applet;

import java.io.*;

import  sun.audio.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.util.Timer;

import javax.imageio.ImageIO;


 

class Constants

{

 

    public static final int North = 1;

    public static final int South = 2;

    public static final int East = 3;

    public static final int West = 4;

 

    public static final int NorthAndSouth = 5;

    public static final int NorthAndEast = 6;

    public static final int NorthAndWest = 7;

    public static final int SouthAndEast = 8;

    public static final int SouthAndWest = 9;

    public static final int EastAndWest = 10;

 

    public static final int NorthSouthAndEast = 11;

    public static final int NorthSouthAndWest = 12;

    public static final int NorthEastAndWest = 13;

    public static final int SouthEastAndWest = 14;

 

    public static final int NorthSouthEastAndWest = 15;

 

    public static final int FIRST_AREA_ID = 1;

    public static final int SECOND_AREA_ID = 2;

    public static final int THIRD_AREA_ID = 3;

    public static final int FOURTH_AREA_ID = 4;

    public static final int FIFTH_AREA_ID = 5;

    public static final int SIXTH_AREA_ID = 6;

    public static final int SEVENTH_AREA_ID = 7;

    public static final int EIGHTH_AREA_ID = 8;

    public static final int NINTH_AREA_ID = 9;

    public static final int TENTH_AREA_ID = 10;

    public static final int ELEVENTH_AREA_ID = 11;

    public static final int TWELFTH_AREA_ID = 12;

    public static final int THIRTEENTH_AREA_ID = 13;

    public static final int FOURTEENTH_AREA_ID = 14;

    public static final int FIFTEENTH_AREA_ID = 15;

   

    public static final int JUMP = 1;

    public static final int SING = 2;

    public static final int SIT = 3;

    public static final int DANCE = 4;

    public static final int DIRECTIONS = 5;

    public static final int EXIT = 6;

   

    public static final int FOX = 1;
    public static final String FOX_STRING = "fox";

    public static final int HOUND = 2;
    public static final String HOUND_STRING = "hound";

    public static final int PENGUIN = 3;
    public static final String PENGUIN_STRING = "penguin";

    public static final int RABBIT = 4;
    public static final String RABBIT_STRING = "rabbit";

    public static final int UNICORN = 5;
    public static final String UNICORN_STRING = "unicorn";

 

}

 

class World

{

 

 

 

    public static HashMap<Integer, Area> areaIDMap;

 

 

    public World()

    {

        areaIDMap = new HashMap<Integer, Area>();

        _initAreas();

    }

 

 

 

    public void _initAreas()

    {

        createAreas();

        mapAreas();

    }

 

 

 

    private void createAreas()

    {

        createAreaOne();

        createAreaTwo();

        createAreaThree();

        createAreaFour();

        createAreaFive();

        createAreaSix();

        createAreaSeven();

        createAreaEight();

        createAreaNine();

        createAreaTen();

 

    }

 

    private void mapAreas()

    {

        mapAreaOne();

        mapAreaTwo();

        mapAreaThree();

        mapAreaFour();

        mapAreaFive();

        mapAreaSix();

        mapAreaSeven();

        mapAreaEight();

        mapAreaNine();

        mapAreaTen();

 

    }

 

////////////////////////AREA CREATE METHODS////////////////////////////

    private void createAreaOne()

    {

        String description = "<html>You are in the dead center of a beautiful forest grove.<br>" +
        "Within this thicket of trees lies a solem stump surrounded by a suspicious circle of mushrooms.<br>" +
        "The air smells crisp with the scent of pine and damp soil. Even though you have never been<br> here before" +
        "you realize immediately that this is a sacred place and should be \"respect\"ed.<br>" +
        "There are four paths leading out of this area, each lined with an assortment of pebbles.</html>";
        Area area = new Area(description,Constants.FIRST_AREA_ID);

        areaIDMap.put(Constants.FIRST_AREA_ID, area);

    }

 

    private void createAreaTwo()

    {

    	String description = "<html>As you follow the path leading deeper into<br> the woods you notice a group of butterflies<br>" +
    			"hoovering over something in the distance. What is even<br>stranger is that you feel as if something is watching you.<br>" +
    			"To the east you notice a small path made through the<br> bramble. To the west blows a sinister wind carrying whispers <br>" +
    			"of the darkness that lies ahead.</html>";
        Area area = new Area(description,Constants.SECOND_AREA_ID);

        areaIDMap.put(Constants.SECOND_AREA_ID, area);

    }

 

    private void createAreaThree()

    {

    	String description = "<html>You enter through the small rabbit <br>sized hole and are astonished at what you find on the inside.<br>" +
    			"Intricate designs crafted in briar lay before you <br>and deep in the distance you see a rabbit sized throne!<br>" +
                        "Sitting most elegantly on the throne is the <br>rabbit King Orthax, and with a curious grin he waves for you to come over.<br>" +
    			"None of this is making sense, but it seems that <br>once you possess a specific creature, you are then able to communicate<br>" +
    			"with other creatures of the same type. Careful <br>though, you also may become prey.</html>";
        Area area = new Area(description,Constants.THIRD_AREA_ID);

        areaIDMap.put(Constants.THIRD_AREA_ID, area);

    }

 

    private void createAreaFour()

    {

        Area area = new Area("This is area four",Constants.FOURTH_AREA_ID);

        areaIDMap.put(Constants.FOURTH_AREA_ID, area);

    }

 

    private void createAreaFive()

    {

        Area area = new Area("<html>The first thing you notice about this area is the smell.<br>" +
        		"In every direction, the stench is almost unbearable! Through your now watering eyes<br>" +
        		"you notice a creature staring back at you from the distance. You have entered<br>" +
        		"his home and he is not pleased at all...</html>",Constants.FIFTH_AREA_ID);

        areaIDMap.put(Constants.FIFTH_AREA_ID, area);

    }

 

    private void createAreaSix()

    {

        Area area = new Area("This is area six",Constants.SIXTH_AREA_ID);

        areaIDMap.put(Constants.SIXTH_AREA_ID, area);

    }

 

    private void createAreaSeven()

    {

        Area area = new Area("This is area seven",Constants.SEVENTH_AREA_ID);

        areaIDMap.put(Constants.SEVENTH_AREA_ID, area);

    }

 

    private void createAreaEight()

    {

        Area area = new Area("This is area eigth",Constants.EIGHTH_AREA_ID);

        areaIDMap.put(Constants.EIGHTH_AREA_ID, area);

    }

 

    private void createAreaNine()

    {

        Area area = new Area("This is area nine",Constants.NINTH_AREA_ID);

        areaIDMap.put(Constants.NINTH_AREA_ID, area);

    }

 

    private void createAreaTen()

    {

        Area area = new Area("This is area ten",Constants.TENTH_AREA_ID);

        areaIDMap.put(Constants.TENTH_AREA_ID, area);

    }

 

////////////////////////END AREA CREATE METHODS////////////////////////////

  

 

////////////////////////AREA MAP METHODS///////////////////////////////////

 

 

    private void mapAreaOne()

    {

        Area area = areaIDMap.get(Constants.FIRST_AREA_ID);

        area.areaMap.put(Constants.North, areaIDMap.get(Constants.SECOND_AREA_ID));

        area.areaMap.put(Constants.South, areaIDMap.get(Constants.FIFTH_AREA_ID));

        area.areaMap.put(Constants.East, areaIDMap.get(Constants.FOURTH_AREA_ID));

        area.areaMap.put(Constants.West, areaIDMap.get(Constants.SIXTH_AREA_ID));

        area.paths = Constants.NorthSouthEastAndWest;

    }

 

    private void mapAreaTwo()

    {

        Area area = areaIDMap.get(Constants.SECOND_AREA_ID);

        area.areaMap.put(Constants.South, areaIDMap.get(Constants.FIRST_AREA_ID));

        area.areaMap.put(Constants.East, areaIDMap.get(Constants.THIRD_AREA_ID));

        area.areaMap.put(Constants.West, areaIDMap.get(Constants.TENTH_AREA_ID));

        area.paths = Constants.SouthEastAndWest;

    }

 

    private void mapAreaThree()

    {

        Area area = areaIDMap.get(Constants.THIRD_AREA_ID);

        area.areaMap.put(Constants.South, areaIDMap.get(Constants.FOURTH_AREA_ID));

        area.areaMap.put(Constants.West, areaIDMap.get(Constants.SECOND_AREA_ID));

        area.paths = Constants.SouthAndWest;

    }

 

    private void mapAreaFour()

    {

        Area area = areaIDMap.get(Constants.FOURTH_AREA_ID);

        area.areaMap.put(Constants.North, areaIDMap.get(Constants.THIRD_AREA_ID));

        area.areaMap.put(Constants.West, areaIDMap.get(Constants.FIRST_AREA_ID));

        area.paths = Constants.NorthAndWest;

    }

 

    private void mapAreaFive()

    {

        Area area = areaIDMap.get(Constants.FIFTH_AREA_ID);

        area.areaMap.put(Constants.North, areaIDMap.get(Constants.FIRST_AREA_ID));

        area.paths = Constants.North;

    }

 

    private void mapAreaSix()

    {

        Area area = areaIDMap.get(Constants.SIXTH_AREA_ID);

        area.areaMap.put(Constants.East, areaIDMap.get(Constants.FIRST_AREA_ID));

        area.areaMap.put(Constants.West, areaIDMap.get(Constants.SEVENTH_AREA_ID));

        area.paths = Constants.EastAndWest;

    }

 

    private void mapAreaSeven()

    {

        Area area = areaIDMap.get(Constants.SEVENTH_AREA_ID);

        area.areaMap.put(Constants.North, areaIDMap.get(Constants.EIGHTH_AREA_ID));

        area.areaMap.put(Constants.East, areaIDMap.get(Constants.SIXTH_AREA_ID));

        area.paths = Constants.NorthAndEast;

    }

 

    private void mapAreaEight()

    {

        Area area = areaIDMap.get(Constants.EIGHTH_AREA_ID);

        area.areaMap.put(Constants.North, areaIDMap.get(Constants.NINTH_AREA_ID));

        area.areaMap.put(Constants.South, areaIDMap.get(Constants.SEVENTH_AREA_ID));

        area.paths = Constants.NorthAndSouth;

    }

 

    private void mapAreaNine()

    {

        Area area = areaIDMap.get(Constants.NINTH_AREA_ID);

        area.areaMap.put(Constants.East, areaIDMap.get(Constants.TENTH_AREA_ID));

        area.areaMap.put(Constants.South, areaIDMap.get(Constants.EIGHTH_AREA_ID));

        area.paths = Constants.SouthAndEast;

    }

 

    private void mapAreaTen()

    {

        Area area = areaIDMap.get(Constants.TENTH_AREA_ID);

        area.areaMap.put(Constants.East, areaIDMap.get(Constants.SECOND_AREA_ID));

        area.areaMap.put(Constants.West, areaIDMap.get(Constants.NINTH_AREA_ID));

        area.paths = Constants.EastAndWest;

    }

   

    //area parameter is area we are currently in

    public Area GetNextAreaRandom(Area area)

    {

        Random rand = new Random();

        int i = 0;

        switch(area.paths)

        {

        case Constants.North:

         i = rand.nextInt(2);

         if(i==0)

                return area.areaMap.get(Constants.North);

         if(i==1)

          return area;

        case Constants.South:

         if(i==0)

                return area.areaMap.get(Constants.South);

         if(i==1)

          return area;

 

        case Constants.East:

         if(i==0)

                return area.areaMap.get(Constants.East);

         if(i==1)

          return area;

 

        case Constants.West:

         if(i==0)

                return area.areaMap.get(Constants.West);

         if(i==1)

          return area;

 

 

        case Constants.NorthAndSouth:

         i = rand.nextInt(3);

         if(i == 0)

          return area.areaMap.get(Constants.North);

         if(i == 1)

          return area.areaMap.get(Constants.South);

         if(i == 2)

          return area;

        case Constants.NorthAndEast:

         i = rand.nextInt(3);

         if(i == 0)

          return area.areaMap.get(Constants.North);

         if(i == 1)

          return area.areaMap.get(Constants.East);

         if(i == 2)

          return area;

        case Constants.NorthAndWest:

         i = rand.nextInt(3);

         if(i == 0)

          return area.areaMap.get(Constants.North);

         if(i == 1)

          return area.areaMap.get(Constants.West);

         if(i == 2)

          return area;

        case Constants.SouthAndEast:

         i = rand.nextInt(3);

         if(i == 0)

          return area.areaMap.get(Constants.East);

         if(i == 1)

          return area.areaMap.get(Constants.South);

         if(i == 2)

          return area;

        case Constants.SouthAndWest:

         i = rand.nextInt(3);

         if(i == 0)

          return area.areaMap.get(Constants.West);

         if(i == 1)

          return area.areaMap.get(Constants.South);

         if(i == 2)

          return area;

        case Constants.EastAndWest:

         i = rand.nextInt(3);

         if(i == 0)

          return area.areaMap.get(Constants.East);

         if(i == 1)

          return area.areaMap.get(Constants.West);

         if(i == 2)

          return area;

        case Constants.NorthSouthAndEast:

         i = rand.nextInt(4);

         if(i == 0)

          return area.areaMap.get(Constants.North);

         if(i == 1)

          return area.areaMap.get(Constants.South);

         if(i == 2)

          return area.areaMap.get(Constants.East);

         if(i == 3)

          return area;

        case Constants.NorthSouthAndWest:

         i = rand.nextInt(4);

         if(i == 0)

          return area.areaMap.get(Constants.North);

         if(i == 1)

          return area.areaMap.get(Constants.South);

         if(i == 2)

          return area.areaMap.get(Constants.West);

         if(i == 3)

          return area;

        case Constants.NorthEastAndWest:

         i = rand.nextInt(4);

         if(i == 0)

          return area.areaMap.get(Constants.North);

         if(i == 1)

          return area.areaMap.get(Constants.East);

         if(i == 2)

          return area.areaMap.get(Constants.West);

         if(i == 3)

          return area;

        case Constants.SouthEastAndWest:

         i = rand.nextInt(4);

         if(i == 0)

          return area.areaMap.get(Constants.West);

         if(i == 1)

          return area.areaMap.get(Constants.South);

         if(i == 2)

          return area.areaMap.get(Constants.East);

         if(i == 3)

          return area;

 

        case Constants.NorthSouthEastAndWest:

         i = rand.nextInt(5);

         if(i == 0)

          return area.areaMap.get(Constants.West);

         if(i == 1)

          return area.areaMap.get(Constants.South);

         if(i == 2)

          return area.areaMap.get(Constants.North);

         if(i == 3)

          return area.areaMap.get(Constants.East);

         if(i == 4)

          return area;

        }

       

        return area;

 

     

    }

 

////////////////////////END AREA MAP METHODS///////////////////////////////////

 

}

 

 

class Area {

 

 

    public int areaID;

 

    public int paths;

 

    public HashMap<Integer, Area>  areaMap;

 

    public String description;

   

    public Vector<AI> ai;

    public HashMap<Integer, AI> aiTypeMap;

   

    public boolean containsCharacter;

 

    public Area(String areaDescription, int id)

    {

 

        areaMap = new HashMap<Integer, Area>();

        aiTypeMap = new HashMap<Integer, AI>();

        description = areaDescription;

        areaID = id;

        ai = new Vector<AI>();

        containsCharacter = false;

 

    }


    public boolean GetAI(String name, AI ai)
    {
        /*/ uncomment if you wanna know what you can kill
        for (Map.Entry<Integer, AI> entry : aiTypeMap.entrySet())

        {

            Integer key = entry.getKey();

            AI value = entry.getValue();

            System.out.println("AI: " + key);

            System.out.println(value.description);

            //use key and value

        }/*/
        if(name.equals(Constants.FOX_STRING))
        {
            ai = aiTypeMap.get(Constants.FOX);
            if(ai !=  null)return true;
        }
        if(name.equals(Constants.RABBIT_STRING))
        {
            ai = aiTypeMap.get(Constants.RABBIT);
            if(ai !=  null)return true;
        }
        if(name.equals(Constants.UNICORN_STRING))
        {
            ai = aiTypeMap.get(Constants.UNICORN);
            if(ai !=  null)return true;
        }
        if(name.equals(Constants.HOUND_STRING))
        {
            ai = aiTypeMap.get(Constants.HOUND);
            if(ai !=  null)return true;
        }
        if(name.equals(Constants.PENGUIN_STRING))
        {
            ai = aiTypeMap.get(Constants.PENGUIN);
            if(ai !=  null)return true;
        }

        return false;


    }

    public AI GetAIObject(String name, AI ai)
    {
        /*/ uncomment if you wanna know what you can kill
        for (Map.Entry<Integer, AI> entry : aiTypeMap.entrySet())

        {

            Integer key = entry.getKey();

            AI value = entry.getValue();

            System.out.println("AI: " + key);

            System.out.println(value.description);

            //use key and value

        }/*/
        if(name.equals(Constants.FOX_STRING))
        {
            ai = aiTypeMap.get(Constants.FOX);
            if(ai !=  null)return ai;
        }
        if(name.equals(Constants.RABBIT_STRING))
        {
            ai = aiTypeMap.get(Constants.RABBIT);
            if(ai !=  null)return ai;
        }
        if(name.equals(Constants.UNICORN_STRING))
        {
            ai = aiTypeMap.get(Constants.UNICORN);
            if(ai !=  null)return ai;
        }
        if(name.equals(Constants.HOUND_STRING))
        {
            ai = aiTypeMap.get(Constants.HOUND);
            if(ai !=  null)return ai;
        }
        if(name.equals(Constants.PENGUIN_STRING))
        {
            ai = aiTypeMap.get(Constants.PENGUIN);
            if(ai !=  null)return ai;
        }

        return ai;


    }



}

 

class DisplayUtils

{

 

    private static final String North =

    "Only possible direction is North\n";

    private static final String South =

    "Only possible direction is South\n";

    private static final String East =

    "Only possible direction is East\n";

    private static final String West =

    "Only possible direction is North\n";

 

    private static final String NorthAndSouth =

        "Possible directions: North and South\n";

    private static final String NorthAndEast =

        "Possible directions: North and East\n";

    private static final String NorthAndWest =

        "Possible directions: North and West\n";

    private static final String SouthAndEast =

        "Possible directions: South and East\n";

    private static final String SouthAndWest =

        "Possible directions: South and West\n";

    private static final String EastAndWest =

        "Possible directions: East and West\n";

 

    private static final String NorthSouthAndEast =

        "Possible directions: North, South, and East\n";

    private static final String NorthSouthAndWest =

        "Possible directions: North, South, and West\n";

    private static final String NorthEastAndWest =

        "Possible directions: North, East, and West\n";

    private static final String SouthEastAndWest =

        "Possible directions: South, East, and West\n";

 

    private static final String NorthSouthEastAndWest =

        "Possible directions: North, South, East, and West\n";

 

 

   

    public static String possibleDirections(Area area)

    {

        switch(area.paths)

        {

        case Constants.North: return North;

        case Constants.South: return South;

        case Constants.East: return East;

        case Constants.West: return West;

 

        case Constants.NorthAndSouth: return NorthAndSouth;

        case Constants.NorthAndEast: return NorthAndEast;

        case Constants.NorthAndWest: return NorthAndWest;

        case Constants.SouthAndEast: return SouthAndEast;

        case Constants.SouthAndWest: return SouthAndWest;

        case Constants.EastAndWest: return EastAndWest;

 

        case Constants.NorthSouthAndEast: return NorthSouthAndEast;

        case Constants.NorthSouthAndWest: return NorthSouthAndWest;

        case Constants.NorthEastAndWest: return NorthEastAndWest;

        case Constants.SouthEastAndWest: return SouthEastAndWest;

 

        case Constants.NorthSouthEastAndWest: return NorthSouthEastAndWest;

        }

 

 

        return "THERE IS NO ESCAPE!";

    }

   

   

    public static void printCompass(Area area)

    {

        switch(area.paths)

        {

        case Constants.North: printCompassN();break;

        case Constants.South: printCompassS();break;

        case Constants.East: printCompassE();break;

        case Constants.West: printCompassW();break;

 

        case Constants.NorthAndSouth: printCompassNS();break;

        case Constants.NorthAndEast: printCompassNE();break;

        case Constants.NorthAndWest: printCompassNW();break;

        case Constants.SouthAndEast: printCompassSE();break;

        case Constants.SouthAndWest: printCompassSW();break;

        case Constants.EastAndWest: printCompassEW();break;

 

        case Constants.NorthSouthAndEast: printCompassNSE();break;

        case Constants.NorthSouthAndWest: printCompassNSW();break;

        case Constants.NorthEastAndWest: printCompassNEW();break;

        case Constants.SouthEastAndWest: printCompassSEW();break;

 

        case Constants.NorthSouthEastAndWest: printCompassNSEW();break;

        }

 

    }

   

    public static void printCompassN()

    {

        System.out.println("                              N");

        System.out.println("                              |");

        System.out.println("                           ---*---");

        System.out.println("                              |");

        System.out.println("                               ");

    }

   

    public static void printCompassS()

    {

        System.out.println("                               ");

        System.out.println("                              |");

        System.out.println("                           ---*---");

        System.out.println("                              |");

        System.out.println("                              S");

    }

   

    public static void printCompassE()

    {

        System.out.println("                               ");

        System.out.println("                              |");

        System.out.println("                           ---*---E");

        System.out.println("                              |");

        System.out.println("                              ");

    }

   

    public static void printCompassW()

    {

        System.out.println("                               ");

        System.out.println("                              |");

        System.out.println("                          W---*---");

        System.out.println("                              |");

        System.out.println("                               ");

    }

   

    public static void printCompassNS()

    {

        System.out.println("                              N ");

        System.out.println("                              |");

        System.out.println("                           ---*---");

        System.out.println("                              |");

        System.out.println("                              S");

    }

   

    public static void printCompassNE()

    {

        System.out.println("                              N");

        System.out.println("                              |");

        System.out.println("                           ---*---E");

        System.out.println("                              |");

        System.out.println("                               ");

    }

   

    public static void printCompassNW()

    {

        System.out.println("                              N");

        System.out.println("                              |");

        System.out.println("                          W---*---");

        System.out.println("                              |");

        System.out.println("                               ");

    }

   

    public static void printCompassSE()

    {

        System.out.println("                               ");

        System.out.println("                              |");

        System.out.println("                           ---*---E");

        System.out.println("                              |");

        System.out.println("                              S ");

    }

   

    public static void printCompassSW()

    {

        System.out.println("                               ");

        System.out.println("                              |");

        System.out.println("                          W---*---");

        System.out.println("                              |");

        System.out.println("                              S ");

    }

   

    public static void printCompassEW()

    {

        System.out.println("                               ");

        System.out.println("                              |");

        System.out.println("                          W---*---E");

        System.out.println("                              |");

        System.out.println("                               ");

    }

   

    public static void printCompassNSE()

    {

        System.out.println("                              N ");

        System.out.println("                              |");

        System.out.println("                           ---*---E");

        System.out.println("                              |");

        System.out.println("                              S ");

    }

   

    public static void printCompassNSW()

    {

        System.out.println("                              N ");

        System.out.println("                              |");

        System.out.println("                          W---*---");

        System.out.println("                              |");

        System.out.println("                              S ");

    }

   

    public static void printCompassNEW()

    {

        System.out.println("                              N ");

        System.out.println("                              |");

        System.out.println("                          W---*---E");

        System.out.println("                              |");

        System.out.println("                               ");

    }

   

    public static void printCompassSEW()

    {

        System.out.println("                               ");

        System.out.println("                              |");

        System.out.println("                          W---*---E");

        System.out.println("                              |");

        System.out.println("                              S ");

    }

   

    public static void printCompassNSEW()

    {

        System.out.println("                              N ");

        System.out.println("                              |");

        System.out.println("                          W---*---E");

        System.out.println("                              |");

        System.out.println("                              S ");

    }

 

  

 

 

    public static void printInitialAreaText(Area area)

    {

        printAreaDescription(area);

        Enumeration<AI> vEnum = area.ai.elements();

        while (vEnum.hasMoreElements())

        {

            System.out.println(vEnum.nextElement().description);

        }

        printDirections(area);

    }

 

    public static void printAreaDescription(Area area)

    {

        System.out.println();

        System.out.println(area.description);

    }

 

    public static void printDirections(Area area)

    {

       

        System.out.println(possibleDirections(area));

        printCompass(area);

    }

    public static void printStats(Character character)
    {
        System.out.println();
        System.out.println("Possessed: " + character.possessed);
        System.out.println("Max HP: " + character.base_hp);
        System.out.println("Current HP: " + character.hp);
        System.out.println("Max SP: " + character.base_sp);
        System.out.println("Current SP: " + character.sp);
        System.out.println("Damage: " + character.base_damage_infliction);
        System.out.println("Attack Speed: " + character.attack_speed);
        System.out.println();


    }

    public static String getStats(Character character)
    {
        String stats =  "<html>Possessed: " + character.possessed + "<br>";
        stats = stats + "Max HP: " + character.base_hp + "<br>";
        stats = stats + "Current HP: " + character.hp + "<br>";
        stats = stats + "Max SP: " + character.base_sp + "<br>";
        stats = stats + "Current SP: " + character.sp + "<br>";
        stats = stats + "Damage: " + character.base_damage_infliction + "<br>";
        stats = stats + "Attack Speed: " + character.attack_speed + "<br>";
        stats = stats + "<br></html>";
        return stats;


    }

 

}

 

 

class Character

{

 

 

    public  Area currentArea;


    public int level;

    public int hp;
    public int base_hp;
    
    public int base_sp;
    public int sp;

    public int attack_speed;

    public int base_damage_infliction;

    public AI currentTarget;

    public boolean dead;

    public boolean fighting;

    public Timer attackTimer;
    
    public Timer soulTimer;
    
    public Timer spellPowerTimer;
    
    public int  spRegenerationRate = 8;
    
    public int spRegenerationInc = 3;

    public String possessed;

    public boolean canPossess = false;
    
    public int healIncrement = 5;

    public void moveToArea(Area targetArea)

    {

 
        if(targetArea.areaID == 3)
        {
        	if(possessed.equals("A " + Constants.RABBIT_STRING))
            {
        		move(targetArea);
        	}
        	else
        	{
        		NewFrame.addToCombatLog("You cannot take this path in your current form");
        	}
        }

        else
        {
        	move(targetArea);
        }
        NewFrame.updateButtons();

 

    }
    
    public void move(Area targetArea)
    {
        currentArea.containsCharacter = false;

        currentArea = targetArea;

        DisplayUtils.printInitialAreaText(currentArea);

        currentArea.containsCharacter = true;
        

    }

 

    public Character(Area startingArea)

    {
      

        currentArea = startingArea;

        DisplayUtils.printInitialAreaText(startingArea);

        startingArea.containsCharacter = true;

        level = 1;

        hp = 100;
        
        base_hp = 100;
        
        sp = 20;
        
        base_sp = 20;

        attack_speed = 3;

        base_damage_infliction = 8;

        currentTarget = null;

        dead = false;

        fighting = false;

        possessed = "none";

        canPossess = false;
        
        soulTimer = new Timer();

        soulTimer.schedule(new SoulTimer(), 1000 * 5);
        
        spellPowerTimer = new Timer();

        spellPowerTimer.schedule(new SpellPowerTimer(), 1000 * spRegenerationRate);

    }


    public void Attack()
    {
            attackTimer = new Timer();
            attackTimer.schedule(new AttackTask(), attack_speed*1000);
    }

    class AttackTask extends TimerTask 
    {
        public void run() 
        {
            if(dead || currentTarget.dead)
            {
                fighting = false;
            	currentTarget.attackTimer.cancel();
                attackTimer.cancel(); //Terminate the timer thread

            }
            else
            {
                fighting = true;
                NewFrame.addToCombatLog("You attack " + currentTarget.description + " with fury!"); 
                NewFrame.addToCombatLog("HP " + hp + " Fighting: " + currentTarget.description + " HP " + currentTarget.hp);
                currentTarget.hp = currentTarget.hp - base_damage_infliction;
                NewFrame.updateStats();
                if(currentTarget.hp < 0)
                {
                    currentTarget.dead = true;
                    NewFrame.addToCombatLog("You have killed " + currentTarget.description);
                    canPossess = true;
                    fighting = false;
                    currentArea.aiTypeMap.remove(currentTarget.type);
                    currentArea.ai.remove(currentTarget);
                    if(NewFrame.possessDialog())
                    {
                    	Possess(currentTarget);
                    }
                    NewFrame.updateStats();
                    NewFrame.addCharacters();
                }
                Attack();
            }
        }
    }
    
    class SoulTimer extends TimerTask {

        public void run() {

         if(possessed == "none")
         {
        	 NewFrame.addToCombatLog("Your soul is damaged");
        	 hp = hp - 3;
        	 if(hp < 0)
        	 {
        		 NewFrame.addToCombatLog("You have dissipated into the void");
        		 soulTimer.cancel();
        		 System.exit(0);
        	 }
        	 else
        	 {
        		 NewFrame.addToCombatLog("HP " + hp);
                     NewFrame.updateStats();
        	     soulTimer.schedule(new SoulTimer(), 1000* 5);
        	 }
         }
         else
        	 soulTimer.cancel();

        }

    }
    
    class SpellPowerTimer extends TimerTask {

        public void run() {

        	 int count =0;
             if(sp < base_sp)
             {
            	 while(sp <= base_sp && count<spRegenerationInc )
            	 {
            		 sp = sp + 1;
            		 count++;
                         NewFrame.updateStats();
            	 }
             }
        	 spellPowerTimer.schedule(new SpellPowerTimer(), 1000* spRegenerationRate);


        }

    }


    public void Possess(AI ai)
    {
    	possessed = ai.description;
    	NewFrame.addToCombatLog("You are now attempting to possess " + ai.description);
    	NewFrame.addToCombatLog("Everything becomes black as you force the weight of your soul onto the lifeless corpse");
    	NewFrame.addToCombatLog("Your HP has gone from " + hp + "->" + ai.base_hp);
    	NewFrame.addToCombatLog("Your Attack Speed has gone from " + attack_speed + "->" + ai.attack_speed);
    	NewFrame.addToCombatLog("Your base damage output has gone from " + base_damage_infliction + "->" + ai.base_damage_infliction);
    	NewFrame.addToCombatLog("Congrats, you are now a " + ai.description + ". Your soul will survive for a little longer.");
        possessed = ai.description;
        hp = ai.base_hp;
        attack_speed = ai.attack_speed;
        base_damage_infliction = ai.base_damage_infliction;
        base_hp = ai.base_hp;
        base_sp = ai.base_sp;
        sp = ai.sp;
        NewFrame.updateStats();
        canPossess = false;

    }

 

 

 

}

 

class AI

{

 

    public  Area currentArea;


    public String description;

    public int type;

    public int hp;
    
    public int sp;

    public int base_hp;

    public int base_sp;

    public int attack_speed;

    public int base_damage_infliction;

    public Character currentTarget;

    public Character character;

    public boolean dead;

    public Timer attackTimer;

    public boolean fighting;

   

    public void Greeting()

    {

     

    }

   

    public void moveToArea(Area targetArea)

    {

     if(currentArea != targetArea && !fighting &&!dead)

     {

            currentArea.ai.remove(this);

            currentArea.aiTypeMap.remove(type);

            if(currentArea.containsCharacter)

            {

            	NewFrame.addToCombatLog(description + " has left the area");
             NewFrame.addCharacters();

            }

            currentArea = targetArea;
            

            currentArea.ai.add(this);

            currentArea.aiTypeMap.put(type,this);
            

            if(targetArea.containsCharacter)

            {

            	NewFrame.addToCombatLog(description + " has entered the area");

             Greeting();
             NewFrame.addCharacters();

            }

     }

       

 

 

    }

 

    public AI(Area startingArea, Character main_character)

    {
   

        character = main_character;      
  
        currentArea = startingArea;

        currentArea.ai.add(this);

        dead = false;

        fighting = false;

        base_damage_infliction = 3;

        attack_speed = 2;

        hp = 50;
        
        sp = 15;

        base_hp = 50;

        base_sp = 15;

    }

    public AI()
    {
        dead = false;
    }

    public void Attack()
    {
            attackTimer = new Timer();
            attackTimer.schedule(new AttackTask(), attack_speed*1000);
    }

    class AttackTask extends TimerTask 
    {
        public void run()
        {
            if(dead || currentTarget.dead)
            {
            	currentTarget.attackTimer.cancel();
                attackTimer.cancel(); //Terminate the timer thread
                fighting = false;
            }
            else
            {
                fighting = true;
                NewFrame.addToCombatLog(description + " hits back doing damage!"); 
                currentTarget.hp = currentTarget.hp - base_damage_infliction;
                NewFrame.addToCombatLog("HP " + currentTarget.hp + " Fighting: " + description + " HP " + hp);
                if(currentTarget.hp < 0)
                {
                    currentTarget.dead = true;
                    NewFrame.addToCombatLog("You have been killed!!!");
                    System.exit(0);
                    fighting = false;
                }
                Attack();
            }
        }
    }

   
 

}

 

class Fox extends AI

{

 

public Fox(Area startingArea, Character main_character) {

super(startingArea, main_character);
description = "A fox";

type = Constants.FOX;

hp = 75;
base_hp = 75;

attack_speed = 4;

currentArea.aiTypeMap.put(type, this);


}

 

public void Greeting()

{

	NewFrame.addToCombatLog("The fox snarls at you with disgust");

}

 

}

 

class Hound extends AI

{

 

public Hound(Area startingArea,Character main_character) {

super(startingArea, main_character);
description = "A hound";

type = Constants.HOUND;
hp = 45;
base_hp = 45;
currentArea.aiTypeMap.put(type, this);

}

}

 

class Penguin extends AI

{

 

public Penguin(Area startingArea, Character main_character) {

super(startingArea, main_character);
description = "A penguin";

type = Constants.PENGUIN;
hp = 75;
base_hp=75;
currentArea.aiTypeMap.put(type, this);

}

}

 

class Rabbit extends AI

{

 

public Rabbit(Area startingArea, Character main_character) {

super(startingArea, main_character);
description = "A rabbit";

type = Constants.RABBIT;
hp = 75;
base_hp = 75;
currentArea.aiTypeMap.put(type, this);

}

}

 

class Unicorn extends AI

{

 

public Unicorn(Area startingArea, Character main_character) {

super(startingArea, main_character);
description = "An elusive unicorn";

type = Constants.UNICORN;
hp = 150;
base_hp = 150;
currentArea.aiTypeMap.put(type, this);

}

 

public void Greeting()

{

	NewFrame.addToCombatLog("The gentle giant looks down upon you" +

" with eyes unclouded by hate");

}

}

 

class IOUtils

{

 

 

    public static BufferedReader reader;

 

 

   

    public IOUtils()

    {

        reader = new BufferedReader(new InputStreamReader(System.in));

    }

 

    public String getCommand()

    {

    	NewFrame.addToCombatLog("What would you like to do:");

        return getLine();

 

    }

 

    public static String getLine()

    {

        String line = new String();

        try

        {

            line = reader.readLine();

        }

        catch (IOException ioe)

        {

            //statement to execute if an input/output exception occurs

        	NewFrame.addToCombatLog("An unexpected error occured.");

        }

        return line;

    }

 

 

    public boolean isNorth(String command)

    {

        if(command.equals("n") || command.equals("N") ||

            command.equals("North") || command .equals("north"))

            return true;

        else

            return false;

    }

 

    public boolean isSouth(String command)

    {

        if(command.equals("s") || command.equals("S") ||

            command.equals("South") || command.equals("south"))

            return true;

        else

            return false;

 

 

    }

 

    public boolean isEast(String command)

    {

 

        if(command.equals("e") || command.equals("E") ||

            command.equals("East") || command.equals("east"))

            return true;

        else

            return false;

 

    }

 

    public boolean isWest(String command)

    {

 

        if(command.equals("w") || command.equals("W") ||

            command.equals("West") || command.equals("west"))

            return true;

        else

            return false;

 

    }

 

    public boolean isDance(String command)

    {

        if(command.equals("dance") || command.equals("Dance") ||

                command.equals("DANCE"))

                return true;

            else

                return false;

    }

   

    public void HandleDance()

    {

    	NewFrame.addToCombatLog("You dance like no one is watching");

    	NewFrame.addToCombatLog("\n");

    }

   

    public boolean isSing(String command)

    {

        if(command.equals("sing") || command.equals("Sing") ||

                command.equals("SING"))

                return true;

            else

                return false;

    }

   

    public void HandleSing()

    {

    	NewFrame.addToCombatLog("You sing with the voice of a thousand angels");

    	NewFrame.addToCombatLog("\n");

    }

   

    public boolean isSit(String command)

    {

        if(command.equals("sit") || command.equals("Sit") ||

                command.equals("SIT"))

                return true;

            else

                return false;

    }

    public void HandleSit()

    {

    	NewFrame.addToCombatLog("You sit that fine ass down");

    	NewFrame.addToCombatLog("\n");

    }

    
    public boolean isKill(String command)

    {
 
        String subString = command.substring(0,4);


        if(subString.equals("kill") || subString.equals("Kill") ||

                subString.equals("KILL"))

                return true;

            else

                return false;

    }

   

    public static void HandleKill(Character character, String command)

    {

        String subString = command.substring(5);   
        AI ai = new AI();  

        if(character.currentArea.GetAI(subString, ai))
        {
        	NewFrame.addToCombatLog("-------------------------FIGHT---------------------------");
            character.currentTarget = character.currentArea.GetAIObject(subString, ai);
            character.currentTarget.currentTarget = character;
            character.Attack();
            character.currentTarget.Attack();
             
        }
        else
        {
        	NewFrame.addToCombatLog("This creature does not exist in this area!");
        }

    }

    public boolean isJump(String command)

    {

        if(command.equals("jump") || command.equals("Jump") ||

                command.equals("JUMP"))

                return true;

            else

                return false;

    }

   

    public static void HandleJump()

    {

    	NewFrame.addToCombatLog("Hoppity hop hop");

    	NewFrame.addToCombatLog("\n");

    }
    
    public boolean isHeal(String command)

    {

        if(command.equals("heal") || command.equals("Heal") ||

                command.equals("HEAL"))

                return true;

            else

                return false;

    }

   

    public static void HandleHeal(Character character)

    {

         if(character.sp < 3)
        	 NewFrame.addToCombatLog("Not enough spell power");
         else
         {
             character.sp = character.sp - 3;
             if(character.hp + character.healIncrement > character.base_hp)
             {
            	 NewFrame.addToCombatLog("You are at max health");
            	 character.hp = character.base_hp;
             }
             else
             {
             character.hp = character.hp + character.healIncrement;
             NewFrame.addToCombatLog("Healing for " + character.healIncrement +" HP: " + character.hp);
             NewFrame.updateStats();
             }
         }

    }

   

    public boolean isDirections(String command)

    {

        if(command.equals("directions") || command.equals("Directions") ||

                command.equals("DIRECTIONS"))

                return true;

            else

                return false;

    }

   

    public void HandleDirections(Area area)

    {

     DisplayUtils.printDirections(area);

    }

   

    public boolean isExit(String command)

    {

        if(command.equals("exit") || command.equals("Exit") ||

                command.equals("EXIT"))

                return true;

            else

                return false;

    }


   

    public void HandleExit()

    {

        System.exit(0);

    }

    public boolean isPossess(String command)

    {

        if(command.equals("possess") || command.equals("Possess") ||

                command.equals("POSSESS"))
        {
                return true;
        }

            else

                return false;

    }

    public void HandlePossess(Character character)
    {
        if(character.canPossess)
        {
            character.Possess(character.currentTarget);
        }
        else
        {
        	NewFrame.addToCombatLog("Cannot currently possess.");
        }
        character.canPossess = false;
    }

    public boolean isDontPossess(String command)
    {
        if(command.equals("don't possess") || command.equals("Don't Possess") ||

                command.equals("DON'T POSSESS"))
        {
                return true;
        }

            else

                return false;
        
    }

    public void HandleDontPossess(Character character)
    {
        character.currentArea.aiTypeMap.remove(character.currentTarget.type);
        character.currentArea.ai.remove(character.currentTarget);
        character.canPossess = false;
    }


    public boolean isStats(String command)

    {

        if(command.equals("stats") || command.equals("Stats") ||

                command.equals("STATS"))

                return true;

            else

                return false;

    }

    public void HandleStats(Character character)
    {
        DisplayUtils.printStats(character);
    }

   
   

    //Is this a possible path?

    public boolean isCommandValid(Character character, String command)

    {

     

        if(command.length() > 4 && isKill(command))
        {  
            HandleKill(character, command);
            return true;
        }
        if(isPossess(command))
        {
            HandlePossess(character);
            return true;
        }
        if(isDontPossess(command))
        {
            HandleDontPossess(character);
            return true;
        }
        if(isJump(command))

        {

         HandleJump();

         return true;

        }

        if(isSit(command))

        {

         HandleSit();

         return true;

        }

        if(isSing(command))

        {

         HandleSing();

         return true;

        }

        if(isDance(command))

        {

         HandleDance();

         return true;

        }

        if(isDirections(command))

        {

         HandleDirections(character.currentArea);

         return true;

        }

        if(isExit(command))

        {

         HandleExit();

         return true;

        }
        
        if(isHeal(command))

        {

         HandleHeal(character);

         return true;

        }

        if(isStats(command))

        {

         HandleStats(character);

         return true;

        }

       

        switch(character.currentArea.paths)

        {

        case Constants.North:

            if(isNorth(command))

                return true;

            else

                return false;

        case Constants.South:

            if(isSouth(command))

                return true;

            else

                return false;

        case Constants.East:

            if(isEast(command))

                return true;

            else

                return false;

        case Constants.West:

            if(isWest(command))

                return true;

            else

                return false;

 

        case Constants.NorthAndSouth:

            if(isNorth(command) || isSouth(command))

                return true;

            else

                return false;

        case Constants.NorthAndEast:

            if(isNorth(command) || isEast(command))

                return true;

            else

                return false;

        case Constants.NorthAndWest:

            if(isNorth(command) || isWest(command))

                return true;

            else

                return false;

        case Constants.SouthAndEast:

            if(isSouth(command) || isEast(command))

                return true;

            else

                return false;

        case Constants.SouthAndWest:

            if(isSouth(command) || isWest(command))

                return true;

            else

                return false;

        case Constants.EastAndWest:

            if(isEast(command) || isWest(command))

                return true;

            else

                return false;

 

        case Constants.NorthSouthAndEast:

            if(isNorth(command) || isSouth(command) || isEast(command))

                return true;

            else

                return false;

        case Constants.NorthSouthAndWest:

            if(isNorth(command) || isSouth(command) || isWest(command))

                return true;

            else

                return false;

        case Constants.NorthEastAndWest:

            if(isNorth(command) || isEast(command) || isWest(command))

                return true;

            else

                return false;

        case Constants.SouthEastAndWest:

            if(isSouth(command) || isEast(command) || isWest(command))

                return true;

            else

                return false;

 

        case Constants.NorthSouthEastAndWest:

            if(isNorth(command) || isSouth(command) || isWest(command) || isEast(command))

                return true;

            else

                return false;

         default:

         break;

         

        }

 
        character.canPossess = false;
        return false;

 

    }

 
    //area is the area we are currently in

    public Area enterCommand(Character character)

    {

        String command = getCommand();

 

        while(!isCommandValid(character,command))

        {

        	NewFrame.addToCombatLog("Command not recognized");

            DisplayUtils.printDirections(character.currentArea);

            NewFrame.addToCombatLog("\n");

            command = getCommand();

        }

       

      

 

 

        if(isNorth(command))

            return character.currentArea.areaMap.get(Constants.North);

 

        if(isSouth(command))

            return character.currentArea.areaMap.get(Constants.South);

 

        if(isEast(command))

            return character.currentArea.areaMap.get(Constants.East);

 

        if(isWest(command))

            return character.currentArea.areaMap.get(Constants.West);

 

        return character.currentArea;

    }

 

}


public class EvolutionGame

{

 

 

 

    private static IOUtils ioUtils;

    private static World world;

    private static Character character;

    private static Fox fox;

    private static Penguin penguin;

    private static Rabbit rabbit;

    private static Timer aiMoveTimer;
     
    public static NewFrame newFrame;

 

    public EvolutionGame()

    {

     aiMoveTimer = new Timer();

     aiMoveTimer.schedule(new MoveAI(), 1000 * 10);



        world = new World();

        ioUtils = new IOUtils();

        character = new Character(world.areaIDMap.get(Constants.FIRST_AREA_ID));
        newFrame = new NewFrame(character);
        newFrame.setSize(650,750);
        newFrame.setLocationRelativeTo(null);
        newFrame.setVisible(true);
        NewFrame.setAreaDescription();
        
        NewFrame.addToCombatLog("\n");
        //newFrame.pack();
    	//Panel panel = new Panel();
    	//panel.setLayout(new BorderLayout());
    	//panel.add(new Button("Where Am I")); 
    	//newFrame.add(panel);

        fox = new Fox(world.areaIDMap.get(Constants.FIFTH_AREA_ID), character);

        penguin = new Penguin(world.areaIDMap.get(Constants.NINTH_AREA_ID), character);

        rabbit = new Rabbit(world.areaIDMap.get(Constants.FOURTH_AREA_ID), character);
 


        //The following will print out all areas

        /*/for (Map.Entry<Integer, Area> entry : world.areaIDMap.entrySet())

        {

            Integer key = entry.getKey();

            Area value = entry.getValue();

            System.out.println("Area: " + key);

            System.out.println(DisplayUtils.possibleDirections(value));

            //use key and value

        }/*/

 

 

    }

 

    class MoveAI extends TimerTask {

        public void run() {

            aiMoveTimer.schedule(new MoveAI(), 1000* 20);

         fox.moveToArea(world.GetNextAreaRandom(fox.currentArea));

         penguin.moveToArea(world.GetNextAreaRandom(penguin.currentArea));

         rabbit.moveToArea(world.GetNextAreaRandom(rabbit.currentArea));

        }

    }

 

    public static void main(String args[]) 
    {        

 

     

       /*/ gameFrame = new JFrame();

        JLabel label = new JLabel("Text-Only Label");

        label.setFont(new Font("Serif", Font.PLAIN, 22));

        gameFrame.add(label);

        gameFrame.setSize(1800, 1000);

        gameFrame.setVisible(true);/*/

        
       
    	NewFrame.introDialog();
        EvolutionGame game = new EvolutionGame();
        
    
        while(true)

        {
                Area nextArea = ioUtils.enterCommand(character);

                if(!character.fighting)
                {
                    if(nextArea != character.currentArea)

                    {

                     character.moveToArea(nextArea);
                     NewFrame.setAreaDescription();
                     NewFrame.addCharacters();

                    }
                }
                else
                {

                }
           

        }

    }
 

 

 

}

class NewFrame extends JFrame {

	public static  JPanel contentPane;
	public static JPanel panel = new JPanel();;
	public static JPanel panel_1;
	public static JPanel panel_2;
	public static JPanel panel_3;
	public static JPanel panel_4;
	public static JPanel panel_5;
	public static JPanel panel_6;
	public static JPanel panel_8;
	
	public static JPanel directionButtonPanel;
	public static JPanel killPanel;
	public static JPanel actionButtonPanel;
	
	public static JLabel lblStats;
	public static JLabel lblNewLabel;
	public static JLabel lblNewLabel_1;
	public static JLabel areaDescription;
	public static JTextArea combatLog = new JTextArea();
	public static JScrollPane scrollPane_1;
	public static Character character;
	
    public static JLabel rabbitLabel;
    public static JLabel foxLabel;
    public static JLabel penguinLabel;
    
    public static JButton north;
    public static JButton south;
    public static JButton east;
    public static JButton west;
    public static JButton heal;
    public static JButton jump;
    public static JButton killFox;
    public static JButton killPenguin;
    public static JButton killRabbit;
    
    public static JMenuBar menuBar;
    public static JMenu menu, submenu;
    public static JMenuItem menuItem;
    public static JRadioButtonMenuItem rbMenuItem;
    public static JCheckBoxMenuItem cbMenuItem;
    
	



	/**
	 * Create the frame.
	 */
	public NewFrame(Character mainChar) {
		super("EVOLUTION");
		character = mainChar;
        rabbitLabel = new JLabel();
        foxLabel = new JLabel();
        penguinLabel = new JLabel();

        
        
        ImageIcon foxImage = new ImageIcon(getClass().getResource("/resources/fox.jpeg"));
        ImageIcon penguinImage = new ImageIcon(getClass().getResource("/resources/penguin.jpg"));
        ImageIcon rabbitImage = new ImageIcon(getClass().getResource("/resources/rabbit.jpeg"));
        rabbitLabel.setIcon(rabbitImage);
        rabbitLabel.add(new JButton("Kill"));
        foxLabel.setIcon(foxImage);
        penguinLabel.setIcon(penguinImage);
        killPanel = new JPanel();
        directionButtonPanel = new JPanel();
        actionButtonPanel = new JPanel();

        
        
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 2, 0, 0));
		contentPane.setBackground(Color.BLACK);
		
	    panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 2, 0, 0));
		
		panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(2, 1, 0, 0));
		

		lblNewLabel = new JLabel("In This Area...");
		lblNewLabel.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 22));
		

		panel_3.add(lblNewLabel);
		
		panel_8 = new JPanel();
		panel_8.setLayout(new FlowLayout());
		panel_3.add(panel_8);
		
		panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(2, 1, 0, 0));
		
		lblStats = new JLabel("Stats");
		lblStats.setVerticalAlignment(SwingConstants.CENTER);
		lblStats.setHorizontalAlignment(SwingConstants.CENTER);
		lblStats.setFont(new Font("Serif", Font.PLAIN, 22));;
		panel_4.add(lblStats);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setText(DisplayUtils.getStats(character));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Courier New", Font.ITALIC, 12));
		lblNewLabel_1.setForeground(Color.RED);
		
		panel_4.add(lblNewLabel_1);
		//panel_4.add(killPanel);
		
		panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(2, 1, 0, 0));
		
		
		panel_5 = new JPanel();
		panel_2.add(panel_5);
		
		areaDescription = new JLabel();
		areaDescription.setFont(new Font("Courier New", Font.ITALIC, 12));
		setAreaDescription();

		panel_5.add(areaDescription);
		
		panel_6 = new JPanel();
		panel_2.add(panel_6);
		
		//combatLog = new JTextArea();
		combatLog.setEditable(false);
		//combatLog.setPreferredSize(new Dimension(600,200));
		
		
		scrollPane_1 = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
			      JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.getViewport().add(combatLog);
		scrollPane_1.setPreferredSize(new Dimension(600,125));
		panel_6.add(scrollPane_1);
		
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3,1));
		directionButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel.add(directionButtonPanel);
		panel.add(actionButtonPanel);
		panel.add(killPanel);
	
		initButtons();
		initMenuBars();
		this.setJMenuBar(menuBar);
		

	}
	
	
    public static void addCharacters()
    {
        panel_8.removeAll();
        killPanel.removeAll();
        AI ai = new AI();
        if(character.currentArea.GetAI(Constants.FOX_STRING, ai))
        {
        	killPanel.add(killFox);
        	panel_8.add(foxLabel);
        }
        if(character.currentArea.GetAI(Constants.PENGUIN_STRING, ai))
        {
        	killPanel.add(killPenguin);
        	panel_8.add(penguinLabel);
        }
        if(character.currentArea.GetAI(Constants.RABBIT_STRING, ai))
        {
        	killPanel.add(killRabbit);
        	panel_8.add(rabbitLabel);
        }
        panel_8.revalidate();
        panel_8.repaint();
        killPanel.revalidate();
        killPanel.repaint();
    }
    
    public static void updateStats()
    {
    	lblNewLabel_1.setText(DisplayUtils.getStats(character));
    }
    
    public static void setAreaDescription()
    {
    	areaDescription.setText(character.currentArea.description);
    	panel_5.revalidate();
    	panel_5.repaint();
    	
    }
    
    public static void addToCombatLog(String string)
    {
    	combatLog.append(string);
    	combatLog.append("\n");
    	combatLog.setCaretPosition(combatLog.getDocument().getLength());
    	panel_6.revalidate();
    	panel_6.repaint();

    }
    
    public static void initButtons()
    {
    	
		 north = new JButton("North");
		 north.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Area nextArea = character.currentArea.areaMap.get(Constants.North);
				character.moveToArea(nextArea);
				setAreaDescription();
				addCharacters();
			}
		});
		 north.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		 
		 directionButtonPanel.add(north);
		
		 south = new JButton("South");
		 south.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Area nextArea = character.currentArea.areaMap.get(Constants.South);
				character.moveToArea(nextArea);
				setAreaDescription();
				addCharacters();
			}
		});
		 directionButtonPanel.add(south);
		
		 east = new JButton("East");
		 east.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Area nextArea = character.currentArea.areaMap.get(Constants.East);
				character.moveToArea(nextArea);
				setAreaDescription();
				addCharacters();
			}
		});
		 directionButtonPanel.add(east);
		
		west = new JButton("West");
		west.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Area nextArea = character.currentArea.areaMap.get(Constants.West);
				character.moveToArea(nextArea);
				setAreaDescription();
				addCharacters();
			}
		});
		directionButtonPanel.add(west);
		
		 jump = new JButton("Jump");
		 jump.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				IOUtils.HandleJump();
			}
		});
		 actionButtonPanel.add(jump);
		
		 heal = new JButton("Heal");
		 heal.setBackground(Color.GREEN);
		heal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				IOUtils.HandleHeal(character);
			}
		});
		actionButtonPanel.add(heal);
		
		setupKillButtons();

		
		
    }
    
	private static void setupKillButtons() 
	{
		killFox = createButton("Kill fox");
		killRabbit = createButton("Kill rabbit");
		killPenguin = createButton("Kill penguin");
		setupKillCallbacks();
		
	}
	
	private static JButton createButton(String btnLabel)
	{
		JButton btn = new JButton(btnLabel);
		btn.setPreferredSize(new Dimension(120,25));
		btn.setBackground(Color.RED);
		btn.setForeground(Color.WHITE);
		return btn;
	}
	
	private static void setupKillCallbacks()
	{
		setupKillCallback(killFox);
		setupKillCallback(killRabbit);
		setupKillCallback(killPenguin);
	}
	private static void setupKillCallback(final JButton btn)
	{
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				IOUtils.HandleKill(character, btn.getText() );
				btn.setVisible(false);
			}
		});
	}


	public static void updateButtons()
    {
        switch(character.currentArea.paths)

        {

        case Constants.North:
            setDirectionVisibility(true, false, false, false);
            break;


        case Constants.South:
            setDirectionVisibility(false, true, false, false);
            break;


        case Constants.East:
            setDirectionVisibility(false, false, true, false);
            break;

        case Constants.West:
            setDirectionVisibility(false, false, false, true);
            break;

 

        case Constants.NorthAndSouth:
            setDirectionVisibility(true, true, false, false);
            break;



        case Constants.NorthAndEast:
            setDirectionVisibility(true, false, true, false);
            break;



        case Constants.NorthAndWest:
            setDirectionVisibility(true, false, false, true);
            break;

        case Constants.SouthAndEast:
            setDirectionVisibility(false, true, true, false);
            break;

        case Constants.SouthAndWest:
            setDirectionVisibility(false, true, false, true);
            break;

        case Constants.EastAndWest:
            setDirectionVisibility(false, false, true, true);
            break;

 

        case Constants.NorthSouthAndEast:
            setDirectionVisibility(true, true, true, false);
            break;

        case Constants.NorthSouthAndWest:
        
            setDirectionVisibility(true, true, false, true);
            break;        


        case Constants.NorthEastAndWest:
        
            setDirectionVisibility(true, false, true, true);
            break;       


        case Constants.SouthEastAndWest:
        
            setDirectionVisibility(false, true, true, true);
            break;       


 

        case Constants.NorthSouthEastAndWest:
        
            setDirectionVisibility(true, true, true, true);
            break;       


         default:

         break;

         

        }
    }
	
	public static void setDirectionVisibility(boolean n, boolean s, boolean e, boolean w)
	{
		north.setVisible(n);
		south.setVisible(s);
		east.setVisible(e);
		west.setVisible(w);
	}
	
	public static boolean possessDialog()
	{
		int dialogButton = JOptionPane.YES_NO_OPTION;
	
		int dialogResult = JOptionPane.showConfirmDialog (null, "Would you like to possess this creature?","Congratz!!",dialogButton);
		if(dialogResult == JOptionPane.YES_OPTION)
		{
			return true;
	    }
		else 
		{
			return false;
		}
	
    }
	
	public static void introDialog()
	{
		

        String intro = "You hear a faint humming sound and aren't able to focus on anything.\n"
           + "A voice in the distance seems to be getting closer and as it does,\nsome form of comfort washes over your consciousness.\n"
           + "You are in between worlds, says the voice, and we are counting on you \nto summon every ounce of courage you have remaining in order to defeat\n"
           + "the evil within. Just like that, the voice disappeared. Your eyesight finally \nreturns and you are surprised when you realize you have"
           + "no physical form. \nYou remember Lliam mentioning some technique allowing a soul to \"possess\" \na creature once it has been \"kill\"ed."
           +  "You had better start exploring before your soul \nis vanquished into the nether."
           + "You are strong in this form but with every passing \nsecond you are losing your hold in this realm. Find a vessel, and fast!\n" +
           "If things get scary try and \"heal\" yourself";
		
		JOptionPane.showConfirmDialog (null, intro,"EVOLUTION",JOptionPane.DEFAULT_OPTION);
	}
	
	public static void initMenuBars()
	{
		//Create the menu bar.
		menuBar = new JMenuBar();

		//Build the first menu.
		menu = new JMenu("Options");
		menu.setMnemonic(KeyEvent.VK_A);
		menu.getAccessibleContext().setAccessibleDescription(
		        "The only menu in this program that has menu items");
		menuBar.add(menu);

		//a group of JMenuItems
		menuItem = new JMenuItem("Quit",
		                         KeyEvent.VK_T);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(
		        KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuItem.getAccessibleContext().setAccessibleDescription(
		        "This doesn't really do anything");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

		menu.add(menuItem);

		menuItem = new JMenuItem("Both text and icon",
		                         new ImageIcon("images/middle.gif"));
		menuItem.setMnemonic(KeyEvent.VK_B);
		menu.add(menuItem);

		menuItem = new JMenuItem(new ImageIcon("images/middle.gif"));
		menuItem.setMnemonic(KeyEvent.VK_D);
		menu.add(menuItem);

		//a group of radio button menu items
		menu.addSeparator();
		ButtonGroup group = new ButtonGroup();
		rbMenuItem = new JRadioButtonMenuItem("A radio button menu item");
		rbMenuItem.setSelected(true);
		rbMenuItem.setMnemonic(KeyEvent.VK_R);
		group.add(rbMenuItem);
		menu.add(rbMenuItem);

		rbMenuItem = new JRadioButtonMenuItem("Another one");
		rbMenuItem.setMnemonic(KeyEvent.VK_O);
		group.add(rbMenuItem);
		menu.add(rbMenuItem);

		//a group of check box menu items
		menu.addSeparator();
		cbMenuItem = new JCheckBoxMenuItem("A check box menu item");
		cbMenuItem.setMnemonic(KeyEvent.VK_C);
		menu.add(cbMenuItem);

		cbMenuItem = new JCheckBoxMenuItem("Another one");
		cbMenuItem.setMnemonic(KeyEvent.VK_H);
		menu.add(cbMenuItem);

		//a submenu
		menu.addSeparator();
		submenu = new JMenu("A submenu");
		submenu.setMnemonic(KeyEvent.VK_S);

		menuItem = new JMenuItem("An item in the submenu");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(
		        KeyEvent.VK_2, ActionEvent.ALT_MASK));
		submenu.add(menuItem);

		menuItem = new JMenuItem("Another item");
		submenu.add(menuItem);
		menu.add(submenu);

		//Build second menu in the menu bar.
		menu = new JMenu("Another Menu");
		menu.setMnemonic(KeyEvent.VK_N);
		menu.getAccessibleContext().setAccessibleDescription(
		        "This menu does nothing");
		menuBar.add(menu);
	}
}

 
