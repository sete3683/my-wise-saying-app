package org.example;

import java.util.*;

public class App {
    private final static String EXIT = "종료";
    private final static String ADD = "등록";
    private final static String PRINT = "목록";

    private Scanner scanner;
    private Deque<Saying> sayings;
    private int index;

    private void add() {
        System.out.print("명언 : ");
        String content = scanner.nextLine();

        System.out.print("작가 : ");
        String author = scanner.nextLine();

        sayings.add(new Saying(index, content, author));
        System.out.printf("%d번 명언이 등록되었습니다.\n", index++);
    }

    private void print() {
        System.out.println("번호 / 작가 / 명언");
        System.out.println("------------------");

        Iterator<Saying> iterator = sayings.descendingIterator();
        while (iterator.hasNext()) {
            Saying saying = iterator.next();
            System.out.printf("%s / %s / %s\n",
                    saying.getIndex(),
                    saying.getAuthor(),
                    saying.getContent());
        }
    }

    public void run() {
        System.out.println("==명언 앱==");
        scanner = new Scanner(System.in);
        sayings = new ArrayDeque<>();
        index = 1;

        while (true) {
            System.out.print("명령) ");
            String command = scanner.nextLine();

            if (command.equals(EXIT)) {
                break;
            } else if (command.equals(ADD)) {
                add();
            } else if (command.equals(PRINT)) {
                print();
            }
        }

        scanner.close();
    }
}
