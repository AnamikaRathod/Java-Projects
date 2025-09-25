import java.util.*;

public class RestaurantOrderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, quantity;
        double total = 0;
        System.out.println("\n====================================");
        System.out.println("  Hello👋 Welcome to My Restaurant 🍴");
        System.out.println("====================================");

        while (true) {
            // Multiple Orders
            System.out.println("\n ********  Menu  ********");
            System.out.println("1. Pizza  🍕 - 200 Rs");
            System.out.println("2. Burger 🍔 - 150 Rs");
            System.out.println("3. Coffee 🍵 - 100 Rs");
            System.out.println("4. Exit & Generate Bill");

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter quantity of Pizza: ");
                    quantity = sc.nextInt();
                    total += quantity * 200;
                    break;

                case 2:
                    System.out.print("Enter quantity of Burger: ");
                    quantity = sc.nextInt();
                    total += quantity * 150;
                    break;

                case 3:
                    System.out.print("Enter quantity of Coffee: ");
                    quantity = sc.nextInt();
                    total += quantity * 100;
                    break;

                case 4:
                    System.out.println("\n\tGenerating Your Bill......");
                    break;

                default:
                    System.out.println("Invalid choice! Please select again");
                    break;
            }
            if (choice == 4)
                break;
        }
        if (total >= 500) {
            System.out.println("🎉🎉Congrats! you got 10% discount");
            total = total - (total * 10 / 100);
        } else {
            System.out.println("No discount");
        }
        System.out.println("Total Bill : RS " + total);
        System.out.println("\n🙏Thanks for visiting!");
        System.out.println("====================================");
        sc.close();
    }
}
