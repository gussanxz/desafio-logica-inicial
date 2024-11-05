import java.util.Scanner;

public class ClassificadorHeroi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do Heroi:");
        String nomeHeroi = scanner.next();

        System.out.println("Digite a quantidade de XP do heroi:");
        int xpHeroi = scanner.nextInt();

        if (xpHeroi < 1000) {
            System.out.println(nomeHeroi + " é Ferro.");
        } else if (xpHeroi >= 1001 && xpHeroi <= 2000) {
            System.out.println(nomeHeroi + " é Bronze.");
        } else if (xpHeroi >= 2001 && xpHeroi <= 5000) {
            System.out.println(nomeHeroi + " é Prata.");
        } else if (xpHeroi >= 5001 && xpHeroi <= 7000) {
            System.out.println(nomeHeroi + " é Ouro.");
        } else if (xpHeroi >= 7001 && xpHeroi <= 8000) {
            System.out.println(nomeHeroi + " é Platina.");
        } else if (xpHeroi >= 8001 && xpHeroi <= 9000) {
            System.out.println(nomeHeroi + " é Ascendente.");
        } else if (xpHeroi >= 9001 && xpHeroi <= 10000) {
            System.out.println(nomeHeroi + " é Imortal.");
        } else {
            System.out.println(nomeHeroi + " é Radiante.");
        }
    }
}