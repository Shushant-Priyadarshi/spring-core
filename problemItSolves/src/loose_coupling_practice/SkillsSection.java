package loose_coupling_practice;

//target class:
//where service of other classes is being used!!
public class SkillsSection {

    private AboutCourse aboutCourse;

    public SkillsSection(AboutCourse aboutCourse){
        this.aboutCourse = aboutCourse;
    }
    public SkillsSection(){}

    public void setAboutCourse(AboutCourse aboutCourse) {
        this.aboutCourse = aboutCourse;
    }

    public void printTheSkill(){
        aboutCourse.courseName();
    }
}
