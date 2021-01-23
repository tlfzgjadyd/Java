package chap03;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

public class M_Game369 {
    public static void main(String[] args) {

        for(int i=1;i<=99;i++){
            int count=0;
            if((i/10)%3==0)
                count++;
            if((i%10)%3==0)
                count++;
            if(count==1)
                System.out.println(i+" 박수 짝");
            else if(count==2)
                System.out.println(i+" 박수 짝짝");
        }
    }
}
