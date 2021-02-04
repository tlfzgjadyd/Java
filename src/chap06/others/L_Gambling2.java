package chap06.others;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

//다시한번 확인하자면 next는 공백전까지만 nextLine은 enter 전까지
import java.util.Scanner;
class Person2{
    private String name="";
    public Person2(String name){
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
public class L_Gambling2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("갬블링 게임에 참여할 선수 숫자>>");
        int num=sc.nextInt();
        String[] names = new String[num];
        Person[] people = new Person[num];
        for(int i=0;i<num;i++)
        {
            System.out.print((i+1)+"번째 선수 이름>>");
            names[i] = sc.next();
            people[i]= new Person(names[i]);
        }

        boolean res=false;
        sc.nextLine();
        while (true) {
            for(int i=0;i<num;i++){
                System.out.print("[" + people[i].getName() + "]:<Enter>");
                sc.nextLine();
                res = people[i].play();
                if(res==true)
                {
                    break;
                }
            }
            if(res==true)
            {
                break;
            }
        }
        sc.close();
    }
}
