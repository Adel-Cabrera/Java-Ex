package project;

import java.util.ArrayList;

public class Portfolio {
    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }

    private ArrayList<Project> projects = new ArrayList<>();

     public String getPortfolioCost(Portfolio portfolio){
         double sum = 0;

         for (Project project : projects) {
             sum += project.getInitialCost();
         }
         return "Total cost: " + sum;
     }

    public void addProject(Project project){
        this.projects.add(project);
    }

    public void showPortfolio(Portfolio portfolio){
        String totalCost = getPortfolioCost(portfolio);
        for (Project project: projects){
            System.out.println(project.elevatorPitch());
        }
        System.out.println("Total Cost: " + totalCost);
    }

    public ArrayList<Project> getAllProjects(){
        return this.projects;
    }
}
