public class Gift {
    private String name;
    private int weight;
    public Gift(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    public String getName(){
        return this.name;
    }
    public int getWeight(){
        return this.weight;
    }

    @Override
    public String toString(){
        String result = "Gift's name:" + this.name + "\n" + "Gift's weight: " + this.weight + "\n";
        return result;
    }
}
