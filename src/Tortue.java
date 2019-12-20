import java.util.ArrayList;

public class Tortue {
    int[] position;
    int orientation; // 1=N; 2=E; 3=S; 4=W;

    public Tortue(int x, int y){
        position = new int[2];
        position[0] = x;
        position[1] = y;
        orientation = 1;
    }

    public void afficherTortue(Tortue tortue){
        int x = tortue.position[0];
        int y = tortue.position[1];
        Plateau.plateau[x][y] = 'T';
    }
}