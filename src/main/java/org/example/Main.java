package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}

class App {
    public void run() {
        System.out.println("==명언 앱==");
        System.out.print("명령) ");
        Scanner scanner = new Scanner(System.in);
    }
}