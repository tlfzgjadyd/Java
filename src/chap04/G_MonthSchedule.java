package chap04;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

//switch문 안에서 finish함수 호출해서 종료하기 위해 System.exit(0)을 사용한점
//근데 알고보니 switch3에서 finish();break;대신 finish();return;하면 종료시킬 수 있었음

//그리고 scanner 여러번 사용해야하니까 아예 멤버로 만들어버린게 포인트 (sc.close()는 finish에서)
//그리고 null포인터 에러나면 day[daySelect]와 같은 객체도 널인지 확인해야했던점
//아 그리고 그래도 계속 null뜨던데 이유는 그거였음
//알고보니 생성자에서 Day배열에 동적으로 new Day[];만 하고 끝나면 Day객체들을 담을 그릇만 만들고 끝내는거라
//그다음에 for문 돌면서 각 그릇칸에 Day객체들 생성시켜줘야하는 거였음
//=>null포인터 에러 뜨면 할 수 있는건 1. null검사 2. 실제로 안생성해서 객체가 null은 아닌지 확인

//그리고 여태까지 클래스들 분리시켜서 진행시켜왔지만 같은곳에 두려면
//public class 한개를 메인으로 두고 부속 클래스는 class라고만 한다
//next와 nextLine의 차이점은
//1. next눈 문자 또는 문자열을 공백 기준으로 한 단어 또는 한 문자씩 입력받는다
//2. nextLine은 문자 또는 문장 한라인 전체를 입력받는다
//근데 문제는 nextLine하니까 내가 입력할 틈도 없이 알아서 다음단계로 넘어가더라
//아무래도 안에있던 개행때문에 알아서 줄이 바뀐것같음
//그래서 next로 하기로 했다
import java.util.Scanner;

class Day {
    private String work; //하루의 할 일을 나타내는 문자열
    public void set(String work) {this.work = work;}
    public String get() {return work;}
    public void show(){
        if(work == null) System.out.println("없습니다.");
        else System.out.println(work +"입니다.");
    }
}

public class G_MonthSchedule {
    private int days;
    private Day[] day;
    Scanner sc = new Scanner(System.in);
    G_MonthSchedule(int days){
        this.days=days;
        day = new Day[days+1];
        for(int i=0;i<day.length;i++)
        {
            day[i]=new Day();
        }
    }
    void input(){
        int daySelect=0;
        System.out.print("날짜(1~"+days+")?");
        daySelect=sc.nextInt();

        System.out.print("할일(빈칸없이입력)?");
        String work = sc.next();
        if(day[daySelect]!=null)
            day[daySelect].set(work);
    }
    void view(){
        int daySelect=0;
        System.out.print("날짜(1~"+days+")?");
        daySelect=sc.nextInt();
        System.out.print(daySelect+"일의 할 일은 ");
        day[daySelect].show();

    }
    void finish(){
        System.out.println("프로그램을 종료합니다.");
        sc.close();
        System.exit(0);
    }
    void run(){
        System.out.println("이번달 스케쥴 관리 프로그램");
        while(true)
        {
            int doSelect = 0;
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
            doSelect = sc.nextInt();
            switch(doSelect){
                case 1: input();break;
                case 2: view();break;
                case 3: finish();break;
                default: ; break;
            }
            System.out.println();
        }
    }
}
