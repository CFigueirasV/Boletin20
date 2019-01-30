package boletin20;

/**
 *
 * @author cfigueirasvalverde
 */
class Goles {
     int[][] goles = {{3, 4, 2},
    {1, 2, 1},
    {3, 0, 1}};

    public void crearTaboa() {
        for (int f = 0; f < goles.length; f++) {
            for (int c = 0; c < goles.length; c++) {
            }
        }
    }

    public void amosar() {
        for (int f = 0; f < goles.length; f++) {
            System.out.print("| ");
            for (int c = 0; c < goles.length; c++) {
                System.out.print(goles[f][c] + "   ");
            }
            System.out.println("|\n");
        }
    }
}