public class Questao04
{
    public double media(int[] array)
    {
        double soma = 0;
        for (int i = 0; i < array.length; i++)
        {
            soma = soma + array[i];
        }
        return soma / array.length;
    }

    public void contarMultiplos(int[] array)
    {
        int quantidade = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] % 3 == 0 && array[i] % 5 == 0)
            {
                quantidade++;
            }
        }
        System.out.println("Quantidade de multiplos comuns de 3 e 5: " + quantidade);
    }

    public static void main(String[] args)
    {
        Questao04 q = new Questao04();
        int[] numeros = {10, 15, 30, 7, 45, 8, 60, 11};

        System.out.println("a) Media aritmetica: " + q.media(numeros));
        System.out.print("b) ");
        q.contarMultiplos(numeros);
    }
}
