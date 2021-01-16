package chap03;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

/*이전에도 자주 내던 실수 
* 갑자기 System.out.println이 인식이 안된다고 하면 그건 그냥 메인함수 안써서 그런거임
* 메인함수 안에 있어야만 println 인식 가능*/
public class B_Array {
    public static void main(String[] args) {
        int[][] n = {{1}, {1,2,3},{1},{1,2,3,4},{1,2}};
       // System.out.println(n[1][1]); //실험용 문장, 각{}는 한 행에 해당하며 쓰지 않은 1행 2열칸은 존재하지 않았음 계단형으로 되어있기 때문
        for(int i=0;i<n.length;i++)
        {
            for(int j=0;j<n[i].length;j++)
            {   System.out.print(n[i][j]+" "); }

            System.out.println();
        }
    }

}
