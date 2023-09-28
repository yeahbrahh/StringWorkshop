/* For this exercise, you are to write a program that reads
 in a String from the user and then lets you perform one of
 many operations to confirm some details about the string,
 in addition to optionally modifying the string.

 Name the project StringWorkshop.
First, ask the user for a starting string
Then, prompt the user with a menu allowing them to do the following:
Add more content to the string
Check if a string contains a substring
Output the length of the string
Output the substring after a given prefix
Output the substring before a given suffix
Output the substring before and after a given prefix and suffix
Exit the program
Each of the above options should be in their own method
You can re-use some of the methods in other methods
After running a given option, you should bring them back to the menu to pick another option */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a starting string: ");
        String s = sc.nextLine();

        System.out.println("Pick an option:\n" +
                "1. Add content\n" +
                "2. Check if string contains substring\n" +
                "3. Output length\n" +
                "4. Output substring after prefix\n" +
                "5. Output substring before suffix\n" +
                "6. Output substring between prefix and suffix\n" +
                "7. Exit");

        int option = sc.nextInt();
        sc.nextLine();

        switch (option) {

            case 1:
                System.out.print("Enter content to add: ");
                addContent(s, sc);
                System.out.println(s + addContent(s, sc));
                break;

            case 2:
                System.out.print("Enter a substring to search for: ");
                stringContains(s, sc);
                if (stringContains(s, sc)) {
                    System.out.println("Substring found! ");
                } else {
                    System.out.println("Substring not found :( ");
                }
                break;

            case 3:
                System.out.println("Your string length is: " + stringLength(s));
                break;


            case 4:
                System.out.print("Chosen Prefix: ");
                prefix(s);


            case 5:

            case 6:

            case 7:
                System.out.print("Exiting...");
                break;

            default:
                System.out.print("Invalid Entry!");
                break;

        }

    }
    static String addContent(String s, Scanner sc) {
        return sc.nextLine();
    }

    static boolean stringContains(String s, Scanner sc) {
        String v = sc.nextLine();
        return s.contains(v);
    }

   static int stringLength(String s) {
        return s.length();
    }

    static String prefix(String s) {

        String pre = s.substring(prefix.length());

    }

    static String suffix(String s) {

    }

    static String press(String s) {

    }

}


