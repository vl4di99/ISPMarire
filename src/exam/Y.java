package exam;

public class Y implements A{
    public void met1 () {
        System.out.println("met1");
    }
    public void met(X o) {
        System.out.println("met 2"+o.p);
    }
}
