import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;


class PanchornTest {
    public static void main(String[] args) {
        test1(100);
        test2("Panchorn Lertvipada");
        test3(19, 22);
        test4(9);
        test5();
    }

    private static void test1(int input) {
        System.out.println("========= Starting test1 =========");
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 2; i < input; i++) {
            Boolean isPrime = true;
            for (int j = 2; j <= i; j++) {
                if (j == i) {
                    break;
                }
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                result.add(i);
            }
        }
        System.out.println("result is " + result);
        System.out.println("total count " + result.size());
        System.out.println("========= Done test1 =========");
        System.out.println("");
    }

    private static void test2(String input) {
        System.out.println("========= Starting test2 =========");
        Map<String, Integer> result = new HashMap<String, Integer>();
        for (char c: input.toCharArray()) {
            if (c == ' ') break;
            result.put(String.valueOf(c).toLowerCase(), result.getOrDefault(String.valueOf(c).toLowerCase(), 0) + 1);
        }
        System.out.println("result is " + result);
        System.out.println("========= Done test2 =========");
        System.out.println("");
    }

    private static void test3(int hr, int min) {
        System.out.println("========= Starting test3 =========");
        
        System.out.println("========= Done test3 =========");
        System.out.println("");
    }

    private static void test4(int input) {
        System.out.println("========= Starting test4 =========");
        String output = "";
        for (int i = 1; i <= input ; i++) {
            for (int j = input; j > i; j--) {
                output = output + "  ";
            }
            for (int j = i; j > 1; j--) {
                if (input >= j) {
                    output = output + (i - j + 1) + " ";
                }
            }
            for (int j = 1; j <= input * 2; j++) {
                if (input == j) {
                    output = output + (i) + " ";
                }
            }
            for (int j = 1; j < i; j++) {
                output = output + (i - j) + " ";
            }
            System.out.println(output);
            output = "";
        }
        System.out.println("========= Done test4 =========");
        System.out.println("");
    }

    private static void test5() {
        System.out.println("========= Starting test5 =========");
        String result = "select e.Name, b.Branch_Name, o.Product from Employees e join Order o on e.Employee_ID = o.Employee_ID join Branch b on e.Employee_ID = b.Employee_ID;";
        System.out.println("result is `" + result + "`");
        System.out.println("========= Done test5 =========");
        System.out.println("");
    }
}