package chap03;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

public class J_ArrayRandom4 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        int count =0;
        //만약 아직 count가 10개가 안찼을 경우 계속 돌면서 확인
        int prevI=-1;
        int prevJ=-1;
        while(count!=10){
            int i=(int)(Math.random()*4);
            int j=(int)(Math.random()*4);
            if(array[i][j]==0){ //이전에 썼던 칸이 아닌 경우에만 쓴다
                array[i][j]=(int)(Math.random()*10+1);
                count++;
            }
        }
//        for (int i=0;i<array.length;i++){
//
//            for(int j=0;j<array[i].length;j++){
//                {
//                    array[i][j]=(
//                    count++;
//                }
//            }
//        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
