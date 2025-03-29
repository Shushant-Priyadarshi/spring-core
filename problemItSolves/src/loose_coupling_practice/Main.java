package loose_coupling_practice;

public class Main {
    public static void main(String[] args) {
        SkillsSection skills =  new SkillsSection(new ReactCourse());

        //dependent object => whose services are being used
        // so dependent object are used inside the target class
        //react and springboot class are used inside the skill class
        //that is using the methods of dependent obj into the target obj
        //and this is called dependency injection!!

        //and if the dependent obj is injected to target class using a setter is called setter injection
        //and if done using constructor then it is called constructor injection

        //skills.setAboutCourse(new ReactCourse());
        //skills.setAboutCourse(new SpringbootCourse()); // AboutCourse course = new SpringBoot();
        skills.printTheSkill();
    }
}
