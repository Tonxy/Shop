import org.junit.Test;

public class simpleTest {
    @Test
    public void output(){
        System.out.println("simpleTest Junit");
    }

    public float add(float x,float y){
       return x+y;
    }
    @Test
    public void outputAdd(){
        System.out.println("hh");
        System.out.println(add(1,2));
    }
    @Test
    public void outputDelay(){
        delay();
    }
    public void delay(){
        System.out.println("delay");
    }

    @Test
    public void testDec(){
        System.out.println(dec(10,2));
    }
    public int dec(int a,int b){
        return a-b;
    }

    @Test
    public void testClear(){
        System.out.println("git stash list success!");
    }
    @Test
    public void testResr(){
        System.out.println("git reset --hard success!");
    }
}
