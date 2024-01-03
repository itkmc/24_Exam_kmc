import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("== 명언 앱 실행 ==");

		int lastId = 1;

		while (true) {

			System.out.print("명령어 )");

			String cmd = sc.nextLine().trim();

			if (cmd.equals("등록")) {

				System.out.print("명언 :");
				String content = sc.nextLine().trim();
				System.out.print("작가 :");
				String author = sc.nextLine().trim();

				System.out.printf("%d번 명언이 등록되었습니다.\n", lastId);
				lastId++;

			} else if (cmd.equals("목록")) {
				System.out.println("번호   /   명언      /    작가   ");
				System.out.println("=".repeat(30));

			} else {
				System.out.println("명령어를 제대로 입력해 주세요.");
			}
		}
	}
}
