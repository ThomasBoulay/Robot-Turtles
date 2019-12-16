package src;

public class Carte {
    public void droite (int orientation) { /* fonction qui prend en argument l'orientation et qui tourne la tortue vers la droite */
        orientation ++ ;
        if (orientation == 5) {
            orientation = 1 ;
        }

    }

    public void gauche (int orientation) { /* fonction qui prend en argument l'orientation et qui tourne la tortue vers la droite */
        orientation -- ;
        if (orientation == 0) {
            orientation = 4 ;
        }
    }

    public void avancer (int[] position, int orientation) {  /* rajouter le test mur */
        if (orientation == 1) {
            position[0] --;

        }
        else if (orientation == 3) {
            position[0] ++ ;
        }
        else if (orientation == 2) {
            position[1] --;
        }
        else {
            position[1] ++;
        }
    }
}
