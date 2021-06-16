package demo12;

public class SmartSon extends Smart {

    @Override
    public int method(int x, float y) {
        System.out.println("Cool");
        return super.method(x, y);
        //System.out.println("Cool");  return后的语句不能访问
    }

    @Override
    public void method(int x, int y) {
        super.method(x, y);
    }

    @Override
    public void method(double x, int y) {
        super.method(x, y);
    }

    @Override
    public void method(int x, int y, int z) {
        super.method(x, y, z);
    }
}
