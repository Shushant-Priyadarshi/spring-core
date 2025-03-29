package loose_coupling_practice;

public class ReactCourse implements AboutCourse{
    @Override
    public void courseName() {
        System.out.println("React Course");
    }
}
