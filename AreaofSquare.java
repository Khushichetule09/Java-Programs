import java.util.*;

// Area of a Square
public class AreaofSquare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("Area of the square is: " + area);
    }
}

