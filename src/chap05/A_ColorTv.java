package chap05;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

//상속받았을 경우 default생성자 에러나는데 굳이 전달인자 없는애 만들지 않아도 생성자 만들면됨
//그리고 그 안에서 super에게 일부 인자 넘겨서 호출해주면 된다
//상속받은 메소드는 그대로 사용 가능하지만 상속받은 private 프로퍼티는 getter로 가져와야함

class TV{
    private int size;
    public TV(int size) {
        this.size = size;
    }
    protected int getSize(){return size;}
}
class ColorTV extends TV{
    private int color;

    ColorTV(int size, int color){
        super(size);
        this.color = color;
    }
    public int getColor(){return color;}
    public void printProperty(){
        System.out.print(getSize()+"인치 "+color+"컬러");
    }
}
public class A_ColorTv {
    public static void main(String[] args) {
        ColorTV myTV = new ColorTV(32, 1024);
        myTV.printProperty();
    }
}
