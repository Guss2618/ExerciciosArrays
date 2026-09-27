public class Questao01
{
    public static void main(String[] args)
    {
        int[] a = {507, 0, 147, 0, 300, 27, 888, -110, 0, 675};

        System.out.println("a) Indice do terceiro elemento: " + 2);
        System.out.println("b) Conteudo do terceiro elemento: " + a[2]);
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
