public class WaterBottle {

    private int volume = 100;
    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return volume;
    }

    public void drinkFromBottle(){
        volume -= 10;
    }

    public void emptyBottle(){
        volume = 0;
    }
    public void fillBottle(){
        volume = 100;
    }

}