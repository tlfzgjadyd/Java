package chap03;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

/* < 기본 제공 코드 >
        int sum = 0, i = 0;
        while(i<100){
            sum=sum+i;
            i+=2;
        }
      System.out.println(sum);

  (1) 무엇을 계산하는 코드이며 실행 결과 출력되는 내용은?
    : 0~100까지의 짝수들의 합을 계산하는 코드이며 출력되는 내용은 그렇게 구한 합계 */

public class A_JavaClass {
    //(2) 위의 코드를 main()메소드로 만들고 WhileTest 클래스로 완성해라
    //    ->함수 만드는걸로 착각하고 작성해놓고 왜 안되는거지했는데
    //      클래스로 만드는거니까 클래스 메소드로 원하는 내용 만들면 되겠지 
    //      초기값은 대강 필드값에 초기화해놓고
    //      이에 따라 WhileTest 뒤에 붙였던 함수 전달인자 기호()도 사라짐
    //      전달인자는 클래스 메소드에서만 받게됨
    public static void main(String[] args) {
        //(2) 실행코드
        WhileTest wt= new WhileTest();
        int sum=wt.calculate(100);
        System.out.println(sum);
        
        //(3) 실행코드
        ForTest ft = new ForTest();
        ft.calculate(100);
        System.out.println(sum);

        //(4) 실행코드
        DoWhileTest dwt = new DoWhileTest();
        dwt.calculate(100);
        System.out.println(sum);

    }
}

class WhileTest{
    int sum=0, i=0;
    int calculate(int end) {
        while (i < end) {
            sum = sum + i;
            i += 2;
        }
        return sum;
    }
}

//(3) for 문을 이용하여 동일하게 실행되는 ForTest 클래스를 작성해라
class ForTest{
    int sum=0;
    int calculate(int end){
        for(int i=0;i<end;i+=2){
            sum=sum+i;
        }
        return sum;
    }
}

//(4) do-while문을 이용하여 동일하게 실행되는 DoWhileTest 클래스를 작성해라
class DoWhileTest{
    int sum=0;
    int i=0;
    int calculate(int end){
        do{
            sum=sum+i;
            i+=2;
        }while(i<end);

        return sum;
    }
}