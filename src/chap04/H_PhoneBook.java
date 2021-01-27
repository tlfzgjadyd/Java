package chap04;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

import java.util.Scanner;
class Phone{
    private String name;
    private String tel;
    Phone(){
        ;
    }
    Phone(String name, String tel){
        this.name = name;
        this.tel = tel;
    }
    void setName(String name){
        this.name=name;
    }
    void setTel(String tel){
        this.tel=tel;
    }
    String getName(){
        return name;
    }
    String getTel(){
        return tel;
    }
}
public class H_PhoneBook {
    int num;
    Phone[] phone;
    Scanner sc = new Scanner(System.in);
    H_PhoneBook(int num){
        this.num=num;
        phone = new Phone[num];
        for(int i=0;i<phone.length;i++){
            phone[i]=new Phone();
        }
    }
    void input(){
        for(int i=0;i<num;i++)
        {
            System.out.print("이름고 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            phone[i].setName(sc.next());
            phone[i].setTel(sc.next());
        }
        System.out.println("저장되었습니다...");
    }
    void find(){
        System.out.print("검색할 이름>>");
        String name=sc.next();
        if(name.equals("그만"))
            System.exit(0);

        int findNum=-1;
        for(int i=0;i<phone.length;i++){
            if(phone[i].getName().equals(name))
                findNum=i;
        }
        if(findNum==-1)
            System.out.println(name+" 이 없습니다.");
        else
            System.out.println(name+"의 번호는 "+phone[findNum].getTel()+" 입니다");
    }
}
