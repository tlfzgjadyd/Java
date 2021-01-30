package chap05;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

//이거 main이 문제 사진중에 없어서 인터넷에서 긁어온 main 썼으니까 주의
//또 널에러 뜨길래 keyArray랑 valueArray 생성자에서 for문 돌면서 초기화해줬음
//그리고 출력이 다 null로 나오길래 봤더니 추가에서 value만이 아니라 key도 넣어야했음
abstract class PairMap{
    protected String keyArray []; //key들을 저장하는 배열
    protected String valueArray []; //value 들을 저장하는 배열
    abstract String get(String key); //key 값을 가진 value 리턴, 없으면 null 리턴
    abstract void put(String key, String value); //key와 value를 쌍으로 저장, 기존에
                                                 //key가 있으면, 값을 value로 수정
    abstract String delete(String key); //key 값을 가진 아이템(value와 함께 ) 삭제,
                                        //삭제된 value값 리턴
    abstract int length(); //현재 저장된 아이템의 개수 리턴
}
class Dictionary extends PairMap{
    private int pointer=0;
    Dictionary(int num){
        super();
        keyArray = new String[num];
        valueArray = new String[num];
        for(int i=0;i<keyArray.length;i++){
            keyArray[i]="";
            valueArray[i]="";
        }
    }
    public String get(String key){
        int index=-1;
        for(int i=0;i< keyArray.length;i++)
        {
            if(keyArray[i].equals(key))
                index=i;
        }
        if(index==-1)
            return null;
        else
            return valueArray[index];
    }
    public void put(String key, String value){
        int index=-1;
        for(int i=0;i< keyArray.length;i++)
        {
            if(keyArray[i].equals(key))
                index=i;
        }
        if(index==-1)
        {
            keyArray[pointer]=key;
            valueArray[pointer]=value;
        }
        else
        {
            keyArray[index]=key;
            valueArray[index]=value;
        }

        pointer++;
    }
    public String delete(String key){
        int index=-1;
        for(int i=0;i< keyArray.length;i++)
        {
            if(keyArray[i].equals(key))
                index=i;
        }
        if(index==-1)
        {
            System.out.println("존재하지 않는 키입니다");
            return null;
        }
        else
        {
            String delStr=valueArray[index];
            keyArray[index]="";
            valueArray[index]="";
            pointer--;
            return delStr;
        }
    }
    public int length(){
        return pointer;
    }
}
public class J_DictionaryApp {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이선");
        dic.put("이재문", "C++"); // 이재문의 값을 C++로 수정
        System.out.println("이재문의 값은 "+dic.get("이재문"));
        System.out.println("황기태의 값은 "+dic.get("황기태"));
        dic.delete("황기태"); // 황기태 아이템 삭제
        System.out.println("황기태의 값은 "+dic.get("황기태")); //삭제된 아이템 접근
    }
}
