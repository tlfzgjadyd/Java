package chap06.others;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

//방금 전 파일에서도 했지만 next는 공백나오기 전까지의 한단어고 nextLine은 엔터전까지라 한문장이다

//StringBuffer 사용법 : sc통해서 읽어들이더라도 일단은 new를 통해서 객체 사용해야하며
//new를 사용하더라도 전달인자로 sc.nextLine()받으면 바로 가능

//명령어 분리를 해야하므로 StringTokenizer 사용, 다음꺼 얻을땐 nextToken맞음

//문자열 포함 확인은 contains고 사용법은 내 추측대로인거 맞는데
//contains의 대상은 문자열이기 때문에 일단 toString으로 StringBuffer 변환시킨 후에 사용해야됨
//근데 여기서는 있는지 찾아서 그 위치에서 수정해야하므로 contains 대신 indexOf를 사용했음

//수정할때는 insert말고 replace 사용함, 기존의 한단어 알아서 제거해주는게 아니기 때문에
//내가 직접 길이 알아내서 끝index까지 알려줘야 작업 가능

//근데 명령에 null들어가면 에러나므로 그것에 대비하기 위해서는 입력받을때 null처리 해줘야하며
//이때 if문에 쓰려고 임시로 st.nextToken()한번 했더니 할당도 안했는데 알아서 다음토큰으로 넘어가더라
//그래서 한번만 nextToken 사용해서 변수에 할당하고 그 변수로 null판단 하려 했지만
//이미 할당 시점에서 에러나버림
//그래서 hasMoreTokens으로 확인후에 하는 방법을 택했다

//continue는 여태까지 제대로 써본적 없지만 밑에 실행 안하고 루프로 다시 돌아가는거 맞았음
//else문에는 많은내용 담아놓으면 보기 안좋으니까

import java.util.Scanner;
import java.util.StringTokenizer;
public class K_StringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(">>");
        StringBuffer strAlter = new StringBuffer(sc.nextLine());

        while(true){
            System.out.print("명령: ");
            String command = sc.next();

            if(command.equals("그만"))
                break;

            StringTokenizer st = new StringTokenizer(command, "!");
            String c1;
            String c2;
            int length1=0;
            int length2=0;
            if(st.hasMoreTokens())
            {
                c1=st.nextToken();
                length1=c1.length();

                if(st.hasMoreTokens())
                {
                    c2=st.nextToken();
                    length2=c2.length();

                }
                else {
                    System.out.println("잘못된 명령입니다!");
                    continue;
                }
            }
            else
            {
                System.out.println("잘못된 명령입니다!");
                continue;
            }

            String strFind = strAlter.toString();
            int index = strFind.indexOf(c1);
            if(index!=-1)
            {
                strAlter.replace(index, index+length1, c2);
                System.out.println(strAlter);
            }
            else{
                System.out.println("찾을 수 없습니다!");
            }
        }
        System.out.println("종료합니다");
        sc.close();
    }
}
