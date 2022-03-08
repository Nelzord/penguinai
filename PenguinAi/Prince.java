import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.lang.Thread;

/**
 * Write a description of class Prince here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prince extends Actor
{
    Gold goal;
    Obstacle cactus;
    int count = 0;
    int count2 = 0;
    int finish;
    
    Prince(Gold g) {
        goal = g;
       
     
    }

    
    /**getBackground().drawLine(850,0, 850, 1000);
     * Act - do whatever the Prince wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
    
        if (count == 0){
            
        
        
        int finX = goal.getX();
        int finY = goal.getY();
        List moves = findPath(getX(), getY(), finX, finY);
        
        for (int i = 0; i < moves.size(); i++){

            int nextMove = (int)moves.get(i);
            System.out.print(nextMove);
            setLocation((nextMove%10)*100, (nextMove/10)%10*100);
            Greenfoot.delay(20);
            
        }
        Greenfoot.stop();
        }
        
        
        
        
    }
    
    
    public List findPath(int getX, int getY, int finX, int finY){
        
        List<Integer> l = new ArrayList<Integer>();
        List<String> v = new ArrayList<String>();
        int startX = getX/100;
        int startY = getY/100;
        finX = finX/100;
        finY = finY/100;
  
        
        ArrayList<ArrayList<Integer>> grid = new ArrayList<ArrayList<Integer>>(100);
        
        for (int i = 0; i < 100; i++) {
            grid.add(new ArrayList<Integer>());
        }
        
        for (int i = 1; i < 90; i++){
        
                
            
            if (i % 10 == 0){
                grid.get(i).add(i+1);
                grid.get(i+1).add(i);
                grid.get(i).add(i+10);
                grid.get(i+10).add(i);
                grid.get(i+1).add(i+10);
                grid.get(i+10).add(i+1);
                
            } 
            else if (i % 9 == 0){
                
                grid.get(i).add(i-1);
                grid.get(i-1).add(i);
                grid.get(i).add(i+10);
                grid.get(i+10).add(i);
                grid.get(i-1).add(i+10);
                grid.get(i+10).add(i-1);
                
            } else if (i > 10 && i < 89){
                grid.get(i).add(i+1);
                grid.get(i+1).add(i);
                grid.get(i-1).add(i+1);
                grid.get(i+1).add(i-1);
                grid.get(i).add(i+1);
                grid.get(i+1).add(i);
                grid.get(i).add(i+10);
                grid.get(i+1).add(i+10);
                grid.get(i+10).add(i+1);
                grid.get(i-1).add(i+10);
                grid.get(i+10).add(i-1);
                
            } else {
                grid.get(i).add(i+1);
                grid.get(i+1).add(i);
                grid.get(i).add(i+10);
                grid.get(i+1).add(i+10);
                grid.get(i+10).add(i+1);
                grid.get(i-1).add(i+10);
                grid.get(i+10).add(i-1);
            }
        }

        
        
        
        int start = startX+(startY*10);  
        int destination = finX+(finY*10);
        int cur[] = new int[100];
        int pos[] = new int[100];
        int head = 0;
        
        if (BreadthSearch(grid, start, destination, 100, cur, pos) != false) {
            
            LinkedList<Integer> temp = new LinkedList<Integer>();
            int node = destination;
            temp.add(node);
            
            while (cur[node] >= head) {
                temp.add(cur[node]);
                node = cur[node];
            }
            
            int pathSize = temp.size() - 1;
            System.out.print(pathSize);
            int zed = pathSize;
            
            while (zed >= head){
                l.add(temp.get(zed));
                zed = zed - 1;
            }
            
        }
        
        return l;
        
    
        }
        
        
    public boolean  BreadthSearch(ArrayList<ArrayList<Integer>> grid, int tail,int dest, int sz, int lst[], int stk[])
    {
        
        LinkedList<Integer> q = new LinkedList<Integer>();
        boolean walked[] = new boolean[sz];
 
        int j = 0;
        while (j != sz){ 
            stk[j] = 2147483647;
            lst[j] = -1;
            j++;
        }
 
        walked[tail] = true;
        q.add(tail);
        stk[tail] = 0;
        
        
        while (q.size() != 0) {
            
            int x = q.remove();
            //checking stack
            for (int z = 0; z < grid.get(x).size(); z++) {
                
                int foo = grid.get(x).get(z);
                
                //spaces that are not good/able to be crossesd
                walked[23] = true;
                walked[34] = true;
                walked[33] = true;
                walked[24] = true;
                walked[25] = true;
                walked[26] = true;
                walked[55] = true;
                walked[63] = true;
                walked[64] = true;
                walked[65] = true;
                walked[66] = true;
                walked[9] = true;
                walked[18] = true;
                walked[27] = true;
                walked[36] = true;
                walked[45] = true;
                walked[54] = true;
                walked[63] = true;
                walked[72] = true;
                walked[81] = true;
                walked[0] = true;
                walked[10] = true;
                walked[20] = true;
                walked[30] = true;
                walked[40] = true;
                walked[50] = true;
                walked[60] = true;
                walked[70] = true;
                walked[80] = true;
                if (walked[foo] != walked[0]) {
                    
                    lst[foo] = x;
                    stk[foo] = stk[x]++;
                    q.add(foo);
                    walked[foo] = true;
                    
                    if (grid.get(x).get(z) == dest){
                        
                        return true;
                    }
                }
            }
        }
        return false;
    } 
    }
    



