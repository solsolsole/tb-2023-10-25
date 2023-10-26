package com.ll;

import java.util.Scanner;

class App {
    void run() {
        System.out.println("==명언앱==");

        while (true) {

            System.out.print("명령) ");

            Scanner scanner = new Scanner(System.in); //system out 모니터 in은 키보드 즉 이 말은 사용자의 키보드를 스캔한다.
            String cmd = scanner.nextLine(); //넥스트라인 == 정지

            if (cmd.equals("등록")){
                System.out.print("명언 : ");
                scanner.nextLine();
                System.out.print("작가 : ");
                scanner.nextLine();
            }

                if (cmd.equals("종료")) { //String의 경우에는 == 를 사용하지 않고 .equals("dd") 를 사용한다!
                    break;
                }

                //printf 이건 문장안에 빈칸[%s(문자) %d(정수)] 쓸 수 있음.



        }
    }
}