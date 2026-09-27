public class Questao03
{
    public static void main(String[] args)
    {
        int[] v = new int[10];
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
        Questao03 arrays = new Questao03();
        double[] notas = new double[3];
        double temp = arrays.digitaNota(notas);
        System.out.println("Printando Media fora do metodo " + temp);
    }

    public double digitaNota(double[] vet)
    {
        double soma = 0;
        int count = 0;
        double media = 0;
        for (int i = 0; i < vet.length; i++)
        {
            vet[i] = Teclado.leDouble("Digite sua nota: ");
            if (vet[i] < 0.0 || vet[i] > 10.0)
            do {
                System.out.print("Nota invalida! ");
                vet[i] = Teclado.leDouble("\nDigite outra nota: ");
            } while (vet[i] < 0.0 || vet[i] > 10.0);
            soma = soma + vet[i];
            count++;
        }
        media = soma / count;
        System.out.println("Printando Media dentro do metodo " + media);
        return media;
    }
}
