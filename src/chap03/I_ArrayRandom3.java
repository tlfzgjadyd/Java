package chap03;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

//이때 포인트는 2차원배열도 결국 1차원으로 이어져있긴 하지만
//array.length는 int[1][2]의 1에 대한 길이만 알려주고
//2에 대한 길이를 얻으려면 array[0].length등 한단계 들어가서 해야한단점이다
public class I_ArrayRandom3 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        for(int i=0;i< array.length;i++)
        {
            for(int j=0;j<array[i].length;j++){
                array[i][j]=(int)(Math.random()*10+1);
                System.out.print(array[i][j]+"    ");
            }
            System.out.println();
        }

    }
}
