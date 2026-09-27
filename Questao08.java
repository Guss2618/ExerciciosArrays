public class Questao08
{
    public static void main(String[] args)
    {
        int[][] m = {
            {10, 15, 20, 25},
            {30, 7, 45, 8},
            {60, 11, 9, 12}
        };

        double soma = 0;
        int total = 0;
        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[i].length; j++)
            {
                soma = soma + m[i][j];
                total++;
            }
        }
        double media = soma / total;
        System.out.println("a) Media aritmetica: " + media);

        int quantidade = 0;
        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[i].length; j++)
            {
                if (m[i][j] % 3 == 0 && m[i][j] % 5 == 0)
                {
                    quantidade++;
                }
            }
        }
        System.out.println("c) Multiplos comuns de 3 e 5: " + quantidade);
    }
}
