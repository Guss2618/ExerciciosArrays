public class Questao02
{
    public static void main(String[] args)
    {
        int[] vet;
        System.out.println("a) int vet[];");
        System.out.println("b) Apos a declaracao, vet = null");

        vet = new int[15];
        System.out.println("c) vet = new int[15];");
        System.out.println("d) vet[5] = " + vet[5]);

        int tam = vet.length;
        System.out.println("e) tam = " + tam);
        System.out.println("f) Ultimo elemento: indice 14, conteudo = " + vet[14]);
        System.out.println("g) Indice do primeiro elemento: 0");

        double[] medias = new double[20];
        System.out.println("h) double[] medias = new double[20];");
        System.out.println("   medias.length = " + medias.length);
    }
}
