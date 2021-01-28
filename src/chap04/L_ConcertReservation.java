package chap04;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

//int[] arr = new int[]{1,2,3,4,5};
//크기지정 안하면 이런식으로도 초기화 가능하지만
//나는 여기서 maxNum을 써야했기에 for문 돌리면서 초기화해줬음

//그리고 또 null 포인터 에러나서 배열을 담는 배열도 new해준 후에 내용물 담아야하는거 해결했고 (그릇 & 내용물)
//나중에도 또 null 에러나서 검사후에 하려다가 그냥 null초기화 했던걸 다 ""로 바꿔버렸음
import java.util.Scanner;
class Seat{
    private char type;
    private String[] seatArray;

    Seat(char type, int maxNum){
        this.type = type;
        seatArray = new String[maxNum];
        for(int i = 0; i<seatArray.length;i++)
            seatArray[i]="";
    }

    public void reserveLine(String name, int seatNum){
        if(seatArray[seatNum-1]=="")
            seatArray[seatNum-1]=name;
        else
            System.out.println("이미 예약된 좌석입니다");
    }

    public void showLine() {
        System.out.print(type+">>");
        for(int i = 0; i<seatArray.length;i++){
        if (seatArray[i] == "")
            System.out.print(" ---");
        else
            System.out.print(" " + seatArray[i]);
         }
        System.out.println();
    }

    public void cancelLine(String name){
        int index=-1;
        for(int i = 0; i<seatArray.length;i++){
            if(seatArray[i].equals(name))
            {
                seatArray[i]="";
                index=i;
            }
        }
        if(index==-1)
            System.out.println("존재하지 않는 이름입니다");
    }
}
class SeatManager{
    private Scanner sc = new Scanner(System.in);
    final static int MAX_NUM = 10;
    private Seat[] seats;

    SeatManager(){
        System.out.println("명품 콘서트홀 예약 시스템입니다.");
        seats = new Seat[3];
        seats[0] = new Seat('S', MAX_NUM);
        seats[1] = new Seat('A', MAX_NUM);
        seats[2] = new Seat('B', MAX_NUM);
    }

    public void run(){
        while(true){
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            int menuSelect = sc.nextInt();
            switch(menuSelect){
                case 1: reserve();break;
                case 2: show(4);break;
                case 3: cancel();break;
                case 4: {
                    sc.close();
                    System.exit(0);
                };break;
                default : System.out.println("없는 메뉴 번호입니다 1~4를 입력하세요");break;
            }
        }
    }

    public void reserve(){
        //1. 좌석출력
        System.out.print("좌석구분 S(1), A(2), B(3)>>");
        int lineSelect = sc.nextInt();
        show(lineSelect);

        //2. 이름입력
        System.out.print("이름>>");
        String name = sc.next();

        //3. 좌석번호 입력
        System.out.print("번호>>");
        int seatNum = sc.nextInt();
        if ((seatNum<1)||(seatNum>MAX_NUM))
            System.out.println("잘못된 좌석번호입니다");
        
        //4. 실제 처리
        seats[lineSelect-1].reserveLine(name, seatNum);
    }
    public void show(int lineSelect){
        if(lineSelect!=4)
            seats[lineSelect-1].showLine();
        else
        {
            for(int i=0;i<seats.length;i++)
                seats[i].showLine();
            System.out.println("<<<조회를 완료하였습니다.>>>");
        }
    }
    public void cancel(){
        //1. 좌석출력
        System.out.print("좌석구분 S(1), A(2), B(3)>>");
        int lineSelect = sc.nextInt();
        seats[lineSelect-1].showLine();

        //2. 이름입력
        System.out.print("이름>>");
        String name = sc.next();

        //3. 실제 처리
        seats[lineSelect-1].cancelLine(name);
    }
}
public class L_ConcertReservation {
    public static void main(String[] args) {
        SeatManager manager = new SeatManager();
        manager.run();
    }
}
