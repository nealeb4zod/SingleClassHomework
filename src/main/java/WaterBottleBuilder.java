public class WaterBottleBuilder {
    private int volume = 100;

    public WaterBottleBuilder setVolume(int volume) {
        this.volume = volume;
        return this;
    }

    public WaterBottle createWaterBottle() {
        return new WaterBottle(volume);
    }
}