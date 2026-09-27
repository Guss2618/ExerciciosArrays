public class Arrays3B
{
    public static void main (String[] args){
        Arrays3B arrays = new Arrays3B();
        double[] notas = new double [3];
        double temp = arrays.digitaNota(notas);
        System.out.println("Printando Media fora do metodo " + temp);
       
    }
   
    public double digitaNota(double [] vet){
        double soma = 0;
        int count = 0;
        double media = 0;
        for (int i=0; i<vet.length; i++){
            vet[i] = Teclado.leDouble("Digite sua nota: ");
            if(vet[i]<0.0 || vet[i]>10.0)
            do{
                System.out.print("Nota invalida! ");
                vet[i]= Teclado.leDouble("\nDigite outra nota: ");
            }
            while (vet[i]<0.0 || vet[i]>10.0);
            soma = soma + vet[i];
            count++;
        }
        media = soma/count;
        System.out.println("Printando Media dentro do metodo " + media);
        return media;
    }
}
