package chap06.others;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

//Calendar객체 사용하는법
//Calendar클래스는 여러 나라 시간 구현해야해서 추상클래스로 되어있음
// 그래서 추상클래스라 직접 인스턴스 생성 불가능하고 getInstance 필요
//그리고 객체를 직접 생성하는게 아니라 new 키워드를 쓰면 에러난다
//그래서 new없이 바로 Calendar.getInstance()해야됨

//getInstance후엔 프로퍼티 개념으로 시간 등을 가져온다
//cal.HOUR 이런식으로 (그런줄 알았는데 나중에 보니까 아니었음 계속 읽을것)

//근데 문제는 cal.HOUR은 12시간제란거다
//cal.HOUR_OF_DAY해야 24시간제로 나온다고함
//나머지는 여기 참고 https://hyeonstorage.tistory.com/205

//그리고 인쇄해봤더니 지금 시간이 아니라서 시차떄문인거같아서
//getInstance(Locale.KOREA)로 만들었는데도 계속 이상한 시간뜸 뭐지
//그래서 cal만든 직후에 cal.set까지 해줬는데도 계속 10시 12분뜸 뭐임
//그래서 보니까 저런 cal.HOUR같은 상수식으로 사용하는게 아니라
//cal.get(Calendar.HOUR) 이런식으로 get함수 써서 해야하는거였음
//이때 get(Calendar.프로퍼티) 여기서 Calendar은 고정이고
//cal.get에서 cal부분은 객체명 내가 정한거 쓰면 된다

import java.util.Calendar;
import java.util.Locale;

public class E_Time {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance(Locale.KOREA);
        cal.set(2021, 2, 3, 2, 15);
        System.out.println("현재 시간은 "+cal.get(Calendar.HOUR)+"시 "+cal.get(Calendar.MINUTE)+"분입니다.");
        if(4<=cal.get(Calendar.HOUR_OF_DAY) && cal.get(Calendar.HOUR_OF_DAY)<=12)
            System.out.println("Good Morning");
        else if (12<=cal.HOUR_OF_DAY && cal.HOUR_OF_DAY<=18)
            System.out.println("Good Afternoon");
        else if(18<=cal.HOUR_OF_DAY && cal.HOUR_OF_DAY<=22)
            System.out.println("Good Evening");
        else
            System.out.println("Good Night");
    }
}
