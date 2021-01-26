package chap04;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

public class D_Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    D_Rectangle(int x, int y, int width, int height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
    int getWidth(){
        return width;
    }
    int getHeight(){
        return height;
    }
    int square(){
        return (width*height);
    }
    void show(){
        System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
    }
    boolean contains(D_Rectangle r){
        if((this.x<=r.getX()&&r.getX()<=(this.x+width))&&((this.y<=r.getY())&&(r.getY()<=(this.y+height))))
            return true;
        else
            return false;
    }
}
