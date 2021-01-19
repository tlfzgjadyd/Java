package chap03;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

//여기서는 안보고 배열만들기, 랜덤수 생성 범위지정이 포인트임
//랜덤수 생성법 아예 문제에서 주긴했는데 나는 Math.random()까지밖에 기억을 못했음
//아마 0<=x<1값 생성되니까 각각 10곱하고 1부터 시작하게 1더한걸껄
//그리고 그렇게 했을때 0.0011같은건 이상한 랜덤수로 나오니까 마지막에 int로 캐스팅
public class G_ArrayRandom {
    public static void main(String[] args) {
        int sum=0;
        int[] nums = new int[10];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=(int)(Math.random()*10+1);
            sum+=nums[i];
        }

        System.out.print("랜덤한 정수들 : ");
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
        System.out.print("\n평균은 "+((double)sum/nums.length));

    }
}
