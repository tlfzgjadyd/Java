package chap05;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

import java.util.Scanner;
interface Stack{
    int length(); //현재 스택에 저장된 개수 리턴
    int capacity(); //스택의 전체 저장 가능한 개수 리턴
    String pop(); //스택의 톱(top)에 실수 저장
    boolean push (String val); //스택의 톱(top)에 저장된 실수 리턴
}
class StringStack implements Stack{
    private String[] array;
    int pointer=0;
    StringStack(int size){
        super();
        array = new String[size];
    }
    public int length(){
        return array.length;
    }
    public int capacity(){
        return (array.length-pointer);
    }
    public String pop(){
        String popStr = array[pointer-1];
        array[pointer-1]="";
        pointer--;
        return popStr;
    }
    public boolean push(String val){
        if(pointer==array.length)
        {
            System.out.println("스택이 꽉 차서 푸시 불가!");
            return false;
        }
        else
        {
            array[pointer]=val;
            pointer++;
            return true;
        }

    }

}
public class I_StackApp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("총 스택 저장 공간의 크기 입력 >>");
        int size = sc.nextInt();
        StringStack ss = new StringStack(size);

        while(true){
            System.out.print("문자열 입력 >>");
            String input = sc.next();
            if(input.equals("그만"))
            {
                System.out.print("스택에 저장된 모든 문자열 팝 : ");
                for(int i=0;i<ss.length();i++)
                    System.out.print(ss.pop()+" ");
                System.out.println();
                sc.close();
                System.exit(0);
            }
            else if(ss.capacity()<=0)
                System.out.println("스택이 꽉 차서 푸시 불가!");
            else{
                ss.push(input);
            }
        }

    }
}
