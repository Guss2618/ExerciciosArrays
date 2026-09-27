public class Questao06
{
    public static void main(String[] args)
    {
        int[][] matriz;
        System.out.println("a) int matriz[][];");

        matriz = new int[6][4];
        System.out.println("b) matriz = new int[6][4];");
        System.out.println("c) matriz[1][3] = " + matriz[1][3] + " (zerado na instanciação)");

        double[][] notas;
        System.out.println("d) double notas[][];");

        char[][] letras;
        System.out.println("e) char letras[][];");

        notas = new double[2][2];
        letras = new char[2][2];
        System.out.println("Matriz instancia: " + matriz.length + "x" + matriz[0].length);
        System.out.println("notas e letras declaradas (e instanciadas no teste).");
    }
}
