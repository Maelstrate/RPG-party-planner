public class Mage extends Character{
    private String className;
    private String magicSchool;

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println(className);
        System.out.println(magicSchool);
    }

    public Mage(String name, int age, String ancestry, String magicSchool){
        super (name, age, ancestry);
        this.className = "Mage";
        this.magicSchool = magicSchool;
    }
    public String getClassName(){
        return className;
    }
    public String getMagicSchool(){
        return magicSchool;
    }
    public void setMagicSchool(String weaponry){
        this.magicSchool = weaponry;
    }
}
