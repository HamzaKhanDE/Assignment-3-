public class Fruit {
    String name = "Fruit name";
    String taste = "Taste of the fruit";
    double size = 0.00;

   /* protected final void Changename(String newName){
        this.name = newName;
    }
    protected final String getName(){
        return this.name;
    }*/

   public Fruit(){

    }

    public Fruit(String name, String taste){
        //this.Changename(name);
        this.name=name;
        this.taste = taste;
    }
    public void eat() {
        System.out.println(this.name + " tastes " + this.taste);
    }
}
