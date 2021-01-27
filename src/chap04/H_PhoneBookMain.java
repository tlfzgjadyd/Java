package chap04;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

import java.util.Scanner;
public class H_PhoneBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("인원수>>");
        int num = sc.nextInt();
        H_PhoneBook pb = new H_PhoneBook(num);
        pb.input();
        pb.find();
        pb.find();
        pb.find();
        sc.close();
    }
}
