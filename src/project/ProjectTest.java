package project;

public class ProjectTest {
    public static void main(String[] args){
        Project a = new Project("Name A", "Description A");

        Project b = new Project();
        b.setName("Name B");
        b.setDescription("Description B");
        System.out.println(b.getName());
        System.out.println(b.getDescription());

        Project c = new Project("Name C");
        c.setName("Description C");
        c.setInitialCost(25.00);
        System.out.println(c.getInitialCost());

        System.out.println(a.elevatorPitch());
        System.out.println(b.elevatorPitch());
        System.out.println(c.elevatorPitch());

        Portfolio x = new Portfolio();
        x.addProject(a);
        x.addProject(b);
        x.addProject(c);
        System.out.print(x.getAllProjects());
    }
}
