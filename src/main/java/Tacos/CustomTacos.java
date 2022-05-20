package Tacos;

public class CustomTacos implements TacoBox{
    int tacos;

    public CustomTacos(int tacos){
        this.tacos = tacos;
    }

    public int tacosRemaining() {
        return tacos;
    }

    public void eat() {
        tacos--;
    }
}
