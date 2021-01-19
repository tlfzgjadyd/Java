package chap03;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

//개행시 i%9==0만하면 첫번째줄만 개행됨
//따라서 i%10==9로 해야했다
import java.util.Scanner;
public class H_ArrayRandom2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 몇개?");
        int num = sc.nextInt();
        int[] nums = new int[num];
        boolean flag = false;
        
        //1. 랜덤수 할당하기
        for(int i=0;i<num;i++)
        {
            int temp=(int)(Math.random()*100+1);
            for(int j=0;j<i;j++)
            {
                if(nums[j]==temp) {
                    flag=true;
                    break;
                }
            }
            if(flag==true)
            {
                i--;
                flag=false;
            }
            else{
                nums[i]=temp;
            }
        }
        //2. 출력하기
        for (int i=0;i<num;i++){
            System.out.print(nums[i]+" ");
            if(i%10==9)
                System.out.println();
        }
        sc.close();
    }
}
