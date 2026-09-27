public class Questao08
{
    public static void main(String[] args)
    {
        Questao08 array = new Questao08();
        int[][] matriz = new int[2][2];
        double temp = array.calculaMedia(matriz);
        System.out.println("Printando Media fora do metodo " + temp);

        int quantidade = 0;
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                if (matriz[i][j] % 3 == 0 && matriz[i][j] % 5 == 0)
                {
                    quantidade++;
                }
            }
        }
        System.out.println("b) Multiplos comuns de 3 e 5: " + quantidade);
    }

    public double calculaMedia(int[][] matrix)
    {
        int count = 0;
        double media = 0;
        double soma = 0;
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = Teclado.leInt("Digite um numero: ");
                soma = soma + matrix[i][j];
                count++;
            }
        }
        media = soma / count;
        System.out.println("a) Printando Media dentro do metodo " + media);
        return media;
    }
}
