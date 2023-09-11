public class Dimension {
    private int feet;
    private int inches;

    public Dimension(int inches) {

        this.inches = inches;
        this.feet = inches;


    }

    public int getFeet() {
        test(this.inches);
        return this.feet;
    }

    public int getInches() {
        test(this.inches);
        return this.inches;
    }

    public void test(int inches){
        if(inches < 0){
            this.inches = -1;
            this.feet = -1;
        }
        else{
            this.feet = inches / 12;
            this.inches = inches % 12;
        }
    }
}