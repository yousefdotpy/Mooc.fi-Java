public abstract class Animal {
    private String name;
    public Animal(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void eat(){
        System.out.println(getName() + " eats");
    }
    public void sleep(){
        System.out.println(getName() + " sleeps");
    }
}
