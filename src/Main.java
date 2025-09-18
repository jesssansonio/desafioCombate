import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Champion champion1;
        Champion champion2;

        System.out.println("Digite os dados do primeiro campeão:");
        System.out.print("Nome: ");
        String name1 = scanner.nextLine();
        System.out.print("Vida inicial: ");
        int lifeInitial1 = scanner.nextInt();
        System.out.print("Ataque: ");
        int attack1 = scanner.nextInt();
        System.out.print("Armadura: ");
        int armor1 = scanner.nextInt();
        champion1 = new Champion(name1, lifeInitial1, attack1, armor1);
        System.out.println();

        System.out.println("Digite os dados do segundo campeão:");
        System.out.print("Nome: ");
        scanner.nextLine(); // variableAssistant
        String name2 = scanner.nextLine();
        System.out.print("Vida inicial: ");
        int lifeInitial2 = scanner.nextInt();
        System.out.print("Ataque: ");
        int attack2 = scanner.nextInt();
        System.out.print("Armadura: ");
        int armor2 = scanner.nextInt();
        champion2 = new Champion(name2, lifeInitial2, attack2, armor2);
        System.out.println();

        System.out.print("Quantos turnos você deseja executar? ");
        int shift = scanner.nextInt();

        for (int i = 1; i <= shift; i++) {

            System.out.println("Resultado do turno " + i);
            champion1.takeDamage(champion2);
            System.out.println(champion1.status());
            champion2.takeDamage(champion1);
            System.out.println(champion2.status());
            System.out.println();

            if (champion1.getLife() == 0 || champion2.getLife() == 0) {
                break;
            }

        }

        System.out.println();
        System.out.println("FIM DO COMBATE");

        scanner.close();
    }
}