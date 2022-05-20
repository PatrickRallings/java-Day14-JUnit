package Tacos;

public class TripleTacoBox implements TacoBox{
    int tacos;
    public TripleTacoBox(){
        tacos = 3;
    }
    public int tacosRemaining() {
        return tacos;
    }
    public void eat() {
        tacos--;
    }
}
