package src;

import java.util.ArrayList;

public class Tortue {
    int[] position;

    public Tortue(){
        position = new int[2];
    }
    public Tortue(int x, int y){
        position = new int[2];
        position[0] = x;
        position[1] = y;
    }
}
