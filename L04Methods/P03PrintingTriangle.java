    package L04Methods;

    import java.util.Scanner;

    public class P03PrintingTriangle {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int number = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i <= number; i++) {
                printLine(1, i);
            }
            for (int i = number-1; i >= 1; i--) {
                printLine(1, i);
            }
        }

        public static void printLine(int startNum, int endNum){
            for (int i = startNum; i <= endNum; i++) {
                System.out.printf("%d ", i);
            }
            System.out.println();

        }
    }
