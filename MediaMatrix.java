public class MediaMatrix
{
   public static void main (String [] args){
        MediaMatrix array = new MediaMatrix();
        int[][] matriz = new int[2][2];
        double temp = array.calculaMedia(matriz);
        System.out.println("Printando Media fora do metodo " + temp);

    }
   
    public double calculaMedia(int [][] matrix){
        int count=0;
        double media = 0;
        double soma = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                matrix[i][j] = Teclado.leInt("Digite um numero: ");
            soma = soma + matrix[i][j];
            count++;
            }
        }
        media = soma/count;
        System.out.println("Printando Media dentro do metodo " + media);
        return media;
    }

   
}
