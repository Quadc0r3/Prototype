package Animal;

public abstract class Animal implements Cloneable {
    public String name;

    public Animal(String name){
        this.name = name;
    }

    protected Animal(Animal target){
        if (target != null){
            this.name = target.name;
        }
    }

    public Animal clone(){
        try {
            return (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    };

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
