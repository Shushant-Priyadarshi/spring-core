package loose_coupling;

public class UsingBothLogicHereByPolymorphism {

    private  BLogic bLogic;

    public void setBLogic(BLogic bLogic) {
        this.bLogic = bLogic;
    }

   public void printMyLogic(){
        bLogic.yourLogic();
   }
}
