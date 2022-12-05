import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task3 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task3.class.getName());
        FileHandler fh = new FileHandler("log_calc.txt");
        List<Integer> resultLst = new ArrayList<>();
        logger.addHandler(fh);
        boolean flag = true;
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        String[] nums = new String[3];
        int result = 0;
        Scanner scan = new Scanner(System.in);
        while (flag) {
            System.out.println("Введите пример используя ('+', '-', '*', '/')");
            String problem = scan.nextLine();
            logger.info("Пользователь ввёл пример: " + problem);
            if (problem.contains("+")) {
                nums = problem.split(" ");
                for (int i = 0; i < nums.length; i++) {
                    if (isNumeric(nums[i])) {
                        result += Integer.parseInt(nums[i]);
                    }
                }
                resultLst.add(result);
            }
            if (problem.contains("-")) {
                nums = problem.split(" ");
                int num_one = Integer.parseInt(nums[0]);
                for (int i = 1; i < nums.length; i++) {
                    if (isNumeric(nums[i])) {
                        result = num_one - Integer.parseInt(nums[i]);
                    }
                }
                resultLst.add(result);
            }
            if (problem.contains("*")) {
                result = 1;
                nums = problem.split(" ");
                for (int i = 0; i < nums.length; i++) {
                    if (isNumeric(nums[i])) {
                        result *= Integer.parseInt(nums[i]);
                    }
                }
                resultLst.add(result);
            }
            if (problem.contains("/")) {
                nums = problem.split(" ");
                int num_one = Integer.parseInt(nums[0]);
                for (int i = 1; i < nums.length; i++) {
                    if (isNumeric(nums[i])) {
                        result = num_one / Integer.parseInt(nums[i]);
                    }
                }
                resultLst.add(result);
            }
            if (problem.equals("remove")){
                resultLst.remove(resultLst.size() - 1);
            }
            if (problem.equals("show")){
                System.out.println(resultLst.toString());
            }
            if (problem.equals("exit")){
                flag = false;
            }
            logger.info("И получил результат " + String.valueOf(result));
            System.out.printf("Результат = %d", result);
            System.out.println();
            System.out.println("Массив результатов:");
            System.out.println(resultLst.toString());
            System.out.println("Для удаления последнего результата, вместо примера введите remove");
            System.out.println();
        }
    }

    public static boolean isNumeric(final String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return str.chars().allMatch(Character::isDigit);

    }
}