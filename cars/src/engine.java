import java.util.Comparator;

public class engine {
 private int hp;
 private double volume;

    public engine(int hp, double volume) {
        this.hp = hp;
        this.volume = volume;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "engine{" +
                "hp=" + hp +
                ", volume=" + volume +
                '}';
    }
}
