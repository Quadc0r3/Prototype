package Animal;

public abstract class Animal {
    public String name;

    public Animal(String name){
        this.name = name;
    }

    protected Animal(Animal target){
        if (target != null){
            this.name = target.name;
        }
    }

    public abstract Animal clone();

    public void info(){
        System.out.println("\n++ INFO ++");
        System.out.println("Name: " + name);
        System.out.println("Objekt: " + this);
    };

    public void setName(String name){
        this.name = name;
    };

    public String getName() {
        return name;
    }
}
