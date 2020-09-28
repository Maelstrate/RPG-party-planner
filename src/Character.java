public class Character {
    private String name;
    private int age;
    private String ancestry;
    private boolean isMentor = false;

    public void showInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(ancestry);
    }

    public Character(String name, int age, String ancestry){
        this.name = name;
        this.age = age;
        this.ancestry = ancestry;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getAncestry(){
        return ancestry;
    }
    public void setAncestry(String ancestry){
        this.ancestry = ancestry;
    }
    public boolean getIsMentor(){
        return isMentor;
    }
    public void setIsMentor(boolean isMentor){
        this.isMentor = isMentor;
    }
}
