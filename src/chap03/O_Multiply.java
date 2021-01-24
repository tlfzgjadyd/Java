package chap03;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/
//여기선 클래스명도다름
//힌트보고 겨우 해결할 수 있었음
//왜냐면 Scanner 에러처리 후에 n=0;m=0;초기화 해줬는데도 무한반복하는거임
//알고보니 sc.nextLint()호출로 Scanner에 입력된 키를 모두 제거해줘야하는 거였음
import java.util.InputMismatchException;
import java.util.Scanner;
public class O_Multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int m = 0;
        while(true){
            boolean flag = true;
            System.out.print("곱하고자 하는 두 수 입력>>");
            try {
                 n = scanner.nextInt();
                 m = scanner.nextInt();
            } catch (InputMismatchException e) {
                    System.out.println("실수는 입력하면 안됩니다.");
                    flag=false;
            } finally {
                if (flag == true)
                     break;
                scanner.nextLine();
            }
         }
             System.out.print(n+"x"+m+"="+n*m);
                scanner.close();
    }
}
