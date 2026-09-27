public class Questao03
{
    public static void main(String[] args)
    {
        int[] v = new int[10];
        double[] notas = new double[5];

        int impar = 1;
        for (int i = 0; i < v.length; i++)
        {
            v[i] = impar;
            impar = impar + 2;
        }

        System.out.println("a) Array v com numeros impares a partir de 1:");
        for (int i = 0; i < v.length; i++)
        {
            System.out.print(v[i] + " ");
        }
        System.out.println();

        System.out.println("b) Digite as notas no intervalo [0.0, 10.0]:");
        for (int i = 0; i < notas.length; i++)
        {
            do
            {
                notas[i] = Teclado.leDouble("Digite a nota " + (i + 1) + ": ");
                if (notas[i] < 0.0 || notas[i] > 10.0)
                {
                    System.out.println("Nota invalida!");
                }
            } while (notas[i] < 0.0 || notas[i] > 10.0);
        }

        System.out.println("Notas armazenadas:");
        for (int i = 0; i < notas.length; i++)
        {
            System.out.print(notas[i] + " ");
        }
        System.out.println();
    }
}
