public class Zip {
    private int maxZip;
    private int minZip;
    private String state;

    public Zip(String state, int minZip, int maxZip) {
        this.state = state;
        this.minZip = minZip;
        this.maxZip = maxZip;
    }

    public String getState(){
        return state;
    }

    public int getMinZip(){
        return minZip;
    }

    public int getMaxZip(){
        return maxZip;
    }
}
