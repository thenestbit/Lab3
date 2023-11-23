import java.util.Objects;

public abstract class Alive {
    private String name;

    public Alive(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Абстрактный метод speak()

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Alive alive = (Alive) obj;
        return Objects.equals(name, alive.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Alive{" +
                "name='" + name + '\'' +
                '}';
    }

    public void sing(Song song) {
        System.out.println(getName() + " is singing " + song.getSong());
    }

    public void say(String line) {
        System.out.println(getName() + " says: " + line);
    }
}
