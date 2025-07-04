import java.util.*;

// Bill of Items
public class BillofItems {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input prices of items
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        // Calculate total
        float total = pencil + pen + eraser;
        System.out.println("Bill is : " + total);

        // Add 18% tax
        float newTotal = total + (0.18f * total);
        System.out.println("Bill with 18% tax : " + newTotal);
    }
}

