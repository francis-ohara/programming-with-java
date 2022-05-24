package _8_problem_solving;

import java.util.Date;
public class School {
    protected String name;
    protected Level level;
    protected Date dateEstablished;
    protected long population;
    protected String proprietor;
    protected String owner;

    public School(){
        this.name = "unknown";
        this.level = Level.HIGH_SCHOOL;
        this.dateEstablished = new Date();
        this.population = 1000;
        this.proprietor = "Unknown";
        this.owner = "Unknown";
    }

    public School(String name, Level level, Date dateEstablished, long population, String proprietor, String owner){
        this.name = name;
        this.level = level;
        this.dateEstablished = dateEstablished;
        this.population = population;
        this.proprietor = proprietor;
        this.owner = owner;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setLevel(Level level){
        this.level = level;
    }

    public Level getLevel(){
        return this.level;
    }

    public void setDateEstablished(Date dateEstablished){
        this.dateEstablished = dateEstablished;
    }

    public Date getDateEstablished(){
        return this.dateEstablished;
    }

    public void setPopulation(long population){
        this.population = population;
    }

    public long getPopulation(){
        return this.population;
    }

    public void setProprietor(String proprietor){
        this.proprietor = proprietor;
    }

    public String getProprietor(){
        return this.proprietor;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public String getOwner(){
        return this.owner;
    }
}
