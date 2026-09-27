public class Questao05
{
    public static void main(String[] args)
    {
        int[][] mat = {
            {0, 0, 0, 19},
            {0, -5, 0, 0},
            {11, 0, 13, 0},
            {0, 0, 29, 0},
            {0, 14, 19, 0}
        };

        System.out.println("a) Linhas: " + mat.length);
        System.out.println("b) Colunas: " + mat[0].length);
        System.out.println("c) Valor 19 em mat[0][3] e mat[4][2]");
        System.out.println("d) mat[1][1] = " + mat[1][1]);
        System.out.println("e) mat[2][0] + 1 = " + (mat[2][0] + 1));
        System.out.println("f) mat[3+1][3-1] = " + mat[3 + 1][3 - 1]);

        int x = 2;
        System.out.println("g) mat[x][x] = " + mat[x][x]);
        System.out.println("h) mat[x+1][x] = " + mat[x + 1][x]);
        System.out.println("i) mat[x][x] + 1 = " + (mat[x][x] + 1));
        System.out.println("j) mat.length = " + mat.length);
        System.out.println("k) mat[mat.length-1][1] = " + mat[mat.length - 1][1]);
        System.out.println("l) Total de numeros: " + (mat.length * mat[0].length));
    }
}
