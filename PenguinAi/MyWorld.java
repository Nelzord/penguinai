import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Gold g = new Gold();
    Prince p = new Prince(g);
    Random rand = new Random ();
    Obstacle c = new Obstacle();
    Obstacle c2 = new Obstacle();
    Obstacle c3= new Obstacle();
    Obstacle c4 = new Obstacle();
    Obstacle c5 = new Obstacle();
    Obstacle c6 = new Obstacle();
    Obstacle c7 = new Obstacle();
    Obstacle c8 = new Obstacle();
    Obstacle c9 = new Obstacle();
    Obstacle c10 = new Obstacle();
    Obstacle c11 = new Obstacle();
    Road r1 = new Road();
    Road r2 = new Road();
    Road r3 = new Road();
    Road r4 = new Road();
    Road r5 = new Road();

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(1000, 1000, 1); 
        //horizontal grid
        getBackground().drawLine(0, 50, 1000,50);
        getBackground().drawLine(0, 150, 1000,150);
        getBackground().drawLine(0, 250, 1000,250);
        getBackground().drawLine(0, 350, 1000,350);
        getBackground().drawLine(0, 450, 1000,450);
        getBackground().drawLine(0, 550, 1000,550);
        getBackground().drawLine(0, 650, 1000,650);
        getBackground().drawLine(0, 750, 1000,750);
        getBackground().drawLine(0, 850, 1000,850);
        getBackground().drawLine(0, 950, 1000,950);
        //vertical grid
        getBackground().drawLine(50,0, 50, 1000);
        getBackground().drawLine(150,0, 150,1000);
        getBackground().drawLine(250,0, 250, 1000);
        getBackground().drawLine(350,0, 350, 1000);
        getBackground().drawLine(450,0, 450, 1000);
        getBackground().drawLine(550,0, 550, 1000);
        getBackground().drawLine(650,0, 650, 1000);
        getBackground().drawLine(750,0, 750, 1000);
        getBackground().drawLine(850,0, 850, 1000);
        getBackground().drawLine(950,0, 950, 1000);
        addObject(r1, 500, 400);
        addObject(r2, 600, 400);
        addObject(r3, 700, 600);
        addObject(r4, 600, 500);
        addObject(r5, 400, 400);
        addObject(g, rand.nextInt(10)*100+100, rand.nextInt(5)*100);
        addObject(p, rand.nextInt(8)*100+100, rand.nextInt(2)*100+700);
        addObject(c, 400, 500);
        addObject(c2, 300, 600);
        addObject(c3, 400, 600);
        addObject(c5, 500, 600);
        addObject(c6, 600, 600);
        addObject(c7, 400, 300);
        addObject(c8, 300, 200);
        addObject(c9, 400, 200);
        addObject(c10, 500, 200);
        addObject(c11, 600, 200);
        
    }
}
