package Animal;

public interface Animal extends Cloneable {

    public void info();

    void setName(String name);

    public Animal clone();
}
