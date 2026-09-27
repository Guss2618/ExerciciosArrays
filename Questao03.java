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

        System.out.println("a) Array v com numeros impares:");
        for (int i = 0; i < v.length; i++)
        {
            System.out.print(v[i] + " ");
        }
        System.out.println();

        System.out.println("b) Digite as notas (intervalo [0.0, 10.0]):");
        for (int i = 0; i < notas.length; i++)
        {
            double nota;
            do
            {
                nota = Teclado.leDouble("Nota " + (i + 1) + ": ");
            } while (nota < 0.0 || nota > 10.0);
            notas[i] = nota;
        }

        System.out.println("Notas armazenadas:");
        for (int i = 0; i < notas.length; i++)
        {
            System.out.print(notas[i] + " ");
        }
        System.out.println();
    }
}
