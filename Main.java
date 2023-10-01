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
        int option;

        // Added loop to make testing easier
        do {
            System.out.println("\nPick an option:\n" +
                    "1. Add content\n" +
                    "2. Check if string contains substring\n" +
                    "3. Output length\n" +
                    "4. Output substring after prefix\n" +
                    "5. Output substring before suffix\n" +
                    "6. Output substring between prefix and suffix\n" +
                    "7. Exit");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {

                case 1:
                    System.out.print("Enter content to add: ");
                    s = addContent(s,sc);
                    System.out.println(s);
                    break;

                case 2:
                    System.out.print("Enter a substring to search for: ");
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
                    System.out.println("Output: " + afterPrefix(s, sc));
                    break;

                case 5:
                    System.out.println("Output: " + beforeSuffix(s, sc));
                    break;

                case 6:
                   prefixAndSuffix(s, sc);
                    break;

                case 7:
                    System.out.print("Exiting...");
                    break;

                default:
                    System.out.print("Invalid Entry!");
                    break;

            }

        } while (option != 7); // exit if user enters 7
    }

    static String addContent (String s, Scanner sc) {
        String add = sc.nextLine();
        return s + add;
    }
    static boolean stringContains (String s, Scanner sc) {
        String v = sc.nextLine();
        return s.contains(v); // tests if 's' contains 'v'; returns true if so
    }

    static int stringLength (String s) {
        return s.length(); // finds length of String 's'
    }

    static String afterPrefix (String s, Scanner sc) {

        System.out.print("Enter the prefix: ");

        // Prompt the user to enter the prefix
        String prefix = sc.nextLine();
        int prefixIndex = s.indexOf(prefix);

        // indexOf() returns -1 if substring not found
        // if  indexOf() finds substring prefix and prefixIndex + prefix.length is less than the length of 's'
        // returns piece of string after prefix
        if (prefixIndex != -1 && prefixIndex + prefix.length() < s.length()) {
            return s.substring(prefixIndex + prefix.length());
        } else {
            return "Prefix not found or end of string!";
        }
    }

    static String beforeSuffix (String s, Scanner sc) {

        // Prompt the user to enter the suffix
        System.out.print("Enter the suffix: ");
        String suffix = sc.nextLine();

        // Find the position of the last occurrence of the suffix in the string
        int suffixIndex = s.lastIndexOf(suffix);

        if (suffixIndex != -1) {
            // If the suffix is found, returns the substring before the suffix
            return s.substring(0, suffixIndex);
        } else {
            // If the suffix is not found, returns a message indicating it
            return "Suffix not found!";
        }
    }

    static void prefixAndSuffix (String s, Scanner sc) {

        System.out.print("Enter prefix: ");
        String prefix = sc.nextLine();

        System.out.print("Enter suffix: ");
        String suffix =  sc.nextLine();

        int prefixIndex = s.indexOf(prefix);
        int suffixIndex = s.indexOf(suffix);

        if (prefixIndex != -1 && suffixIndex != -1 && prefixIndex < suffixIndex) {
            String between = s.substring(prefixIndex + prefix.length(), suffixIndex);
            System.out.println("Output: " + between);

        } else {
            System.out.println("Substring not found.");
        }


    }


}


