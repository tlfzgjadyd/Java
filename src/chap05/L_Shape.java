package chap05;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

//동적배열 만들어서 썼음 ArrayList
//추가하고 싶으면 add쓰면됨
import java.util.ArrayList;
import java.util.Scanner;

class GraphicEditor{
    private Scanner sc=new Scanner(System.in);
    private int current=0;
    private ArrayList<String> graphics = new ArrayList<String>();

    public void run(){
        System.out.println("그래픽 에디터 beauty을 실행합니다.");
        while(true) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            int select = sc.nextInt();
            switch (select) {
                case 1: insert();break;
                case 2: delete();break;
                case 3: watch() ;break;
                case 4: exit()  ;break;
                default: ;break;
            }
        }
    }
    public void insert(){
        System.out.print("Line(1), Rect(2), Circle(3)>>");
        int select=sc.nextInt();
        switch(select){
            case 1: graphics.add(current, "Line");break;
            case 2: graphics.add(current, "Rect");break;
            case 3: graphics.add(current, "Circle");break;
        }
        current++;
    }
    public void delete(){
        System.out.print("삭제할 도형의 위치>>");
        int select = sc.nextInt();
        if(select<=current)
        {
            graphics.remove(select);
            current--;
        }
        else
            System.out.println("삭제할 수 없습니다.");
    }
    public void watch(){
        for(String graphic : graphics)
            System.out.println(graphic);
    }
    public void exit(){
        System.out.println("beauty을 종료합니다.");
        sc.close();
        System.exit(0);
    }
}
public class L_Shape{
    public static void main(String[] args) {
        GraphicEditor ge = new GraphicEditor();
        ge.run();
    }
}