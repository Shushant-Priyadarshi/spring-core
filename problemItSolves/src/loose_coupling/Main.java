package loose_coupling;

public class Main {
    public static void main(String[] args) {
        UsingBothLogicHereByPolymorphism obj =  new UsingBothLogicHereByPolymorphism();
        obj.setBLogic(new BLogic1());
//        obj.setBLogic(new BLogic2());
        obj.printMyLogic();
    }
}
