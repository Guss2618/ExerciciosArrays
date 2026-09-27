public class Questao01
{
    public static void main(String[] args)
    {
        int[] a = {507, 88, 147, 210, 300, 27, 888, -110, 45, 675};

        System.out.println("a) Qual e o indice do terceiro elemento do array a?");
        System.out.println("Resposta: " + 2);

        System.out.println("b) Qual e o conteudo do terceiro elemento do array a?");
        System.out.println("Resposta: " + a[2]);

        System.out.println("Exemplo - imprimir indice e conteudo:");
        for (int i = 0; i < a.length; i++)
        {
            System.out.println("Indice " + i + " = " + a[i]);
        }

        System.out.println("c) Indice do primeiro elemento: " + 0);
        System.out.println("d) Conteudo do primeiro elemento: " + a[0]);
        System.out.println("e) Indice do valor 888: " + 6);
        System.out.println("f) a[5] = " + a[5]);
        System.out.println("g) a[5] + 2 = " + (a[5] + 2));
        System.out.println("h) a[5 + 2] = " + a[5 + 2]);

        int x = 2;
        int y = 4;
        System.out.println("i) a[x] + a[y] + 1 = " + (a[x] + a[y] + 1));
        System.out.println("j) a[x + y + 1] = " + a[x + y + 1]);
        System.out.println("k) a.length = " + a.length);
        System.out.println("l) a[a.length - 1] = " + a[a.length - 1]);
    }
}
