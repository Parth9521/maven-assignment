import java.util.Scanner;
public final class Application {
    private Application() {
    }

    /**
     * @param args
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enetr 2 digits ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("make your selection ");
        System.out.println("ADD ");
        System.out.println("SUB ");
        System.out.println("MULTI ");
        System.out.println("DIV ");
        int select = scan.nextInt();
        final int max = 4;
        final int multi = 3;
        while (select > max) {
            System.out.println("wrong choice ");
            select = scan.nextInt();
        }
        Calulator mani = new Calulator();
        if (select == 1) {
            int c = mani.add(a, b);

        } else if (select == 2) {
            int c = mani.substract(a, b);

        } else if (select == multi) {
            int c = mani.multiply(a, b);

        } else {
            double c = mani.divide(a, b);

        }

    }
}
