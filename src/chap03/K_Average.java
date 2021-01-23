package chap03;

//11, 12번 문제 패스함 터미널 문제는 예전에 했던거 이용할것

public class K_Average {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i<args.length;i++)
        {
            sum+=Integer.parseInt(args[i]);
        }
        System.out.println(sum);
    }
}
