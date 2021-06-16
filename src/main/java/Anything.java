import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Anything {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter someting: ");
        String userInput = sc.nextLine();
        System.out.println("You entered: " + userInput);

        if (StringUtils.isNumeric(userInput)) {
            System.out.println(userInput + " is a number");
        }else {
            System.out.println(userInput + " is not a number");
        }
        System.out.println("Flipped case: " + StringUtils.swapCase(userInput));
        System.out.println("Reversed: " + StringUtils.reverse(userInput));


    }
}
