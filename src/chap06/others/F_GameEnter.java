package chap06.others;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

//시간차 갱신이 안되길래 clear도 써보고 했는데
//알고보니 매번 cal객체를 새로 만들어야하는거였음

//그리고 엔터만 입력받을때 nextLine 맞았다
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class F_GameEnter {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        int start1=0;
        int end1=0;
        int res1=0;

        int start2=0;
        int end2=0;
        int res2=0;
        String winner="";

        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");

        System.out.print("황기태 시작 <Enter>키>>");
        sc.nextLine();
        Calendar cal1 = Calendar.getInstance();
        start1=cal1.get(Calendar.SECOND);
        System.out.println("    현재 초 시간 = "+start1);

        System.out.print("10초 예상 후 <Enter>키>>");
        sc.nextLine();
        Calendar cal2 = Calendar.getInstance();
        end1=cal2.get(Calendar.SECOND);
        System.out.println("  현재 초 시간 = "+end1);

        System.out.print("이재문 시작 <Enter>키>>");
        sc.nextLine();
        Calendar cal3 = Calendar.getInstance();
        start2=cal3.get(Calendar.SECOND);
        System.out.println("    현재 초 시간 = "+start2);

        System.out.print("10초 예상 후 <Enter>키>>");
        sc.nextLine();
        Calendar cal4 = Calendar.getInstance();
        end2=cal4.get(Calendar.SECOND);
        System.out.println("    현재 초 시간 = "+end2);

        res1=end1-start1;
        res2=end2-start2;
        if(res1>res2)
            winner="황기태";
        else
            winner="이재문";
        System.out.println("황기태의 결과 "+res1+", 이재문의 결과 "+res2+"승자는 "+winner);
        sc.close();
    }
}
