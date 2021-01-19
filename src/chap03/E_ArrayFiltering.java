package chap03;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

/*배열 선언법 기억해두기
  int[] nums=new int[10];
  int[] num=null;
  int[] num={1,2,3,4,5};
*/
import java.util.Scanner;
public class E_ArrayFiltering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수 10개를 입력하시오>>");
        int[] nums=new int[10];
        nums[0]=sc.nextInt();
        nums[1]=sc.nextInt();
        nums[2]=sc.nextInt();
        nums[3]=sc.nextInt();
        nums[4]=sc.nextInt();
        nums[5]=sc.nextInt();
        nums[6]=sc.nextInt();
        nums[7]=sc.nextInt();
        nums[8]=sc.nextInt();
        nums[9]=sc.nextInt();
        System.out.print("3의 배수는 ");
        for (int i=0;i<10;i++)
            if((nums[i]%3)==0)
                System.out.print(nums[i]+" ");


        sc.close();
    }

}
