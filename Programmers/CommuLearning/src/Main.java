import java.util.Scanner;

public class Main {
    // 프로그래머스에서는 배열을 대괄호로 묶지만, 자바에서는 중괄호로 묶는다.(변환코드)
    public void main() {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        input.replace('[','{');
        input.replace(']', '}');

        System.out.println(input);
    }

}
