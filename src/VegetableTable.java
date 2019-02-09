import java.util.Scanner;

public class VegetableTable {
    public static void main(String[] args) {
        Vegetable[] vegetablesTable = new Vegetable[3];
        int numberOfVegetables = 0;

        while (numberOfVegetables < vegetablesTable.length) {
            System.out.println("Give vegetable name: ");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            System.out.println("Give vegetable price: ");
            double price = scanner.nextDouble();

            Vegetable vegetable = new Vegetable(name, price);

            if (vegetableIsUnique(vegetablesTable, vegetable)) {
                vegetablesTable[numberOfVegetables] = vegetable;
                numberOfVegetables++;
            } else {
                System.out.println("Vegetable already exists.");
            }
        }
    }

    private static boolean vegetableIsUnique(Vegetable[] vegetablesTable, Vegetable vegetable) {
        boolean isUnique = true;
        int i = 0;
        do {
            if (vegetable.equals(vegetablesTable[i])) {
                isUnique = false;
            }
            i++;
        } while (isUnique && i < vegetablesTable.length);
        return isUnique;
    }
}
