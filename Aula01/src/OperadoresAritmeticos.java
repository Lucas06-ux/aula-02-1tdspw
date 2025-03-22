public class OperadoresAritmeticos {

    public static void main(String[] args) {
        //Declarar 3 variáveis
        float cp =10;
        float challenge =7;
        float gs = 8;

        //Calcular a média do semestre (20% cp. 20% challenge, 60% gs)
        double media = cp * 0.2 + challenge * 0.2 + gs * 0.6;
        System.out.println("Média " +media);

        //  Exibir a média do semestre

        int x = 10;
        x ++; //incremento em 1 unidade ( x = x+1)
        System.out.println(x); //x=11
        x --; //decremento em 1 unidade (x = x-1)
        System.out.println(x); // x = 10
        x += 2;
        System.out.println(x);
        x -= 4;
        System.out.println(x);
        x *=3;
        System.out.println(x);
        x /= 4;
        System.out.println(x);
        x %= 2;
        System.out.println(x);


    }
}
