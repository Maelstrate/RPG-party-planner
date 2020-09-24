public class Warrior extends Character{
    private String className;
    private String weaponry;

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println(className);
        System.out.println(weaponry);
    }

    public Warrior(String name, int age, String ancestry, String weaponry){
        super (name, age, ancestry);
        this.className = "Warrior";
        this.weaponry = weaponry;
    }
    public String getClassName(){
        return className;
    }
    public String getWeaponry(){
        return weaponry;
    }
    public void setWeaponry(String weaponry){
        this.weaponry = weaponry;
    }
}
