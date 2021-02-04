package chap06.others;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

//다시한번 확인하자면 next는 공백전까지만 nextLine은 enter 전까지
import java.util.Scanner;
class Person{
    private String name="";
    public Person(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public boolean play(){
        int n1=(int)(Math.random()*3+1);
        int n2=(int)(Math.random()*3+1);
        int n3=(int)(Math.random()*3+1);
        if((n1==n2)&&(n2==n3)) {
            System.out.println("    "+n1+" "+n2+" "+n3+"  "+name+"님이 이겼습니다!");
            return true;
        }
        else {
            System.out.println("    "+n1 + " " + n2 + " " + n3 + "  아쉽군요!");
            return false;
        }

    }
}
public class J_Gambling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1번째 선수 이름>>");
        String name1 = sc.next();
        Person p1 = new Person(name1);

        System.out.print("2번째 선수 이름>>");
        String name2 = sc.next();
        Person p2 = new Person(name2);

        boolean res1;
        boolean res2;
        sc.nextLine();
        while (true) {
            System.out.print("[" + p1.getName() + "]:<Enter>");
            sc.nextLine();
            res1 = p1.play();
            if(res1==true)
                break;

            System.out.print("[" + p2.getName() + "]:<Enter>");
            sc.nextLine();
            res2 = p2.play();
            if(res2==true)
                break;
        }
        sc.close();
    }
}
