import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Escreva o seu nome");
        String nome = leitor.next();

        System.out.println("Escreva a nota de seu checkpoint");
        double cp = leitor.nextFloat();

        System.out.println("Escreva a nota do seu segundo checkpoint");
        double cp2 = leitor.nextFloat();

        System.out.println("Agora a nota de seu terceiro checkpoint");
        double cp3 = leitor.nextFloat();
        double Mediacps = (cp + cp2 + cp3) /3;
        System.out.println("Agora escreva a sua nota do challenge");
        double challenge = leitor.nextFloat();

        System.out.println("Por fim, digite a nota da sua global solution");
        double gs = leitor.nextFloat();

        double media = Mediacps * 0.2 + challenge * 0.2 + gs * 0.2;

        System.out.println("O aluno " + nome +" ficou com a média de " +media);

    }
}
