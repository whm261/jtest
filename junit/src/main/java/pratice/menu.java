package pratice;


class FrenshJuice{
    enum FrenshJuiceSize {SMALL,MIDDLE,LARGE}
    FrenshJuiceSize size;
}
public class menu {
    public static void main(String arg[]){
        FrenshJuice frenshjuice = new FrenshJuice();
        frenshjuice.size = FrenshJuice.FrenshJuiceSize.LARGE;
        System.out.println(frenshjuice.size);
    }

}
