package tight_coupling;

//the example here represents tight coupling of classes (they are dependent on each other)
// 1 -> By making an object
// 2 -> By inheritance

class Alpha{

    public void printAlpha(){
        System.out.println("Alpha");
    }
}

class Beta{
    public static void main(String[] args) {
        Alpha a =  new Alpha();
        a.printAlpha();
    }

}

class Gama extends  Alpha{
    public static void main(String[] args) {
        Gama  g = new Gama();
        g.printAlpha();
    }
}
public class Main {

}
