import java.util.Random;

public class Questao07
{
    public static void main(String[] args)
    {
        int[][] m = new int[3][4];

        int impar = 1;
        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[i].length; j++)
            {
                m[i][j] = impar;
                impar = impar + 2;
            }
        }

        System.out.println("a) Matriz com numeros impares a partir de 1:");
        exibir(m);

        Random gerador = new Random();
        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[i].length; j++)
            {
                m[i][j] = gerador.nextInt(41) + 10;
            }
        }

        System.out.println("b) Matriz com numeros aleatorios no intervalo [10, 51):");
        exibir(m);
    }

    public static void exibir(int[][] m)
    {
        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[i].length; j++)
            {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
