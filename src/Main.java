import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //INPUTS AND INSTRUCTIONS
        Scanner scanner = new Scanner(System.in);
        System.out.print("INSTRUCTIONS:\n1. Enter a FROM and TO base to convert to (i.e 10 and 16).\n2. Enter value to be converted.\n3. Console will output your solution.\n\nFROM: ");
        String from = scanner.nextLine();
        System.out.print("TO: ");
        String to = scanner.nextLine();
        System.out.print("\nEnter a value to convert from base " + from + " to " + to + ": ");
        String value = scanner.nextLine();
        System.out.print("\nConverting " + value + " from base " + from + " to " + to + " gives you ");

        //LOGIC AND OUTPUTS
        switch (from) {
            case "2": // converting from base 2 to:
                switch (to) {
                    case "2":
                        System.out.println(value);
                        break;
                    case "10":
                        int decimal = Integer.parseInt(value,2);
                        System.out.println(decimal);
                        break;
                    case "16":
                        String hexadecimal = Integer.toHexString(Integer.parseInt(value,2));
                        System.out.println(hexadecimal);
                        break;
                    default:
                        System.out.println("no solution. This program only supports base 2, 10, and 16 conversion. Rerun the program and enter a valid TO value.");

                }
                break;
            case "10": // converting from base 10 to:
                switch (to) {
                    case "2":
                        String binary = Integer.toBinaryString(Integer.parseInt(value,10));
                        System.out.println(binary);
                        break;
                    case "10":
                        System.out.println(value);
                        break;
                    case "16":
                        String hexadecimal = Integer.toHexString(Integer.parseInt(value,10));
                        System.out.println(hexadecimal);
                        break;
                    default:
                        System.out.println("no solution. This program only supports base 2, 10, and 16 conversion. Rerun the program and enter a valid TO value.");

                }
                break;
            case "16": // converting from base 16 to:
                switch (to) {
                    case "2":
                        String binary = Integer.toBinaryString(Integer.parseInt(value,16));
                        System.out.println(binary);
                        break;
                    case "10":
                        int decimal = Integer.parseInt(value,16);
                        System.out.println(decimal);
                        break;
                    case "16":
                        System.out.println(value);
                        break;
                    default:
                        System.out.println("no solution. This program only supports base 2, 10, and 16 conversion. Rerun the program and enter a valid TO value.");

                }
                break;
            default:
                System.out.println("no solution. This program only supports base 2, 10, and 16 conversion. Rerun the program and enter a valid FROM value.");

        }
    }
}
