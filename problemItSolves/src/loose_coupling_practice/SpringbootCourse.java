package loose_coupling_practice;

public class SpringbootCourse implements AboutCourse{
    @Override
    public void courseName() {
        System.out.println("SpringBoot Course");
    }
}
