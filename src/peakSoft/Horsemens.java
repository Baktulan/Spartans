package peakSoft;

import java.util.Arrays;

public class Horsemens extends Spartans {
    private double horseSpeed;
    private int vynoslivost;

    public Horsemens(String name, int count, double horseSpeed, int vynoslivost) {
        super(name, count);
        this.horseSpeed = horseSpeed;
        this.vynoslivost = vynoslivost;
    }

    public double getHorseSpeed() {
        return horseSpeed;
    }

    public void setHorseSpeed(double horseSpeed) {
        this.horseSpeed = horseSpeed;
    }

    public int getVynoslivost() {
        return vynoslivost;
    }

    public void setVynoslivost(int vynoslivost) {
        this.vynoslivost = vynoslivost;
    }
    public void sortByHorseSpeed(Horsemens[] horsemens){
        double[] newSpeed= new double[horsemens.length];
        for (int i = 0; i < horsemens.length; i++) {
            for (int j = i+1; j <horsemens.length; j++) {
                if (horsemens[i].horseSpeed<horsemens[j].horseSpeed){
                    double value=horsemens[i].horseSpeed;
                    horsemens[i].horseSpeed=horsemens[j].horseSpeed;
                    horsemens[j].horseSpeed=value;

                }
            }
            newSpeed[i]=horsemens[i].horseSpeed;

        }
        System.out.println("Сортировка по скорости лошади: "+Arrays.toString(newSpeed));
    }

    @Override
    public String toString() {
        return super.toString() +
                "Horsemens: " + "\n" +
                "Horse Speed: " + horseSpeed + "\n" +
                "Vynoslivost`: " + vynoslivost + "\n"+
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }
}
