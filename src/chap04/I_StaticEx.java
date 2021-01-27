package chap04;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

class ArrayUtil{
    public static int[] concat(int[] a, int[] b){
        int length = a.length+b.length;
        int[] c = new int[length];
        for(int i=0;i<a.length;i++)
            c[i]=a[i];
        for(int i=a.length;i<length;i++)
            c[i]=b[i-a.length];
        return c;/*배열 a와 b를 연결한 새로운 배열 리턴*/
    }
    public static void print(int[] a){
        System.out.print("[ ");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println("]");/*배열 a 출력*/
    }
}
public class I_StaticEx {
    public static void main(String [] args){
        int [] array1={1, 5, 7, 9};
        int [] array2 = {3, 6, -1, 100, 77};
        int [] array3 = ArrayUtil.concat(array1, array2);
        ArrayUtil.print(array3);
    }
}
