package peakSoft;

import java.util.Arrays;

public class Archers extends Spartans {
    private int dalnostStrelby;
    private double tochnost;

    public Archers(String name, int count, int dalnostStrelby, double tochnost) {
        super(name, count);
        this.dalnostStrelby = dalnostStrelby;
        this.tochnost = tochnost;
    }

    public int getDalnostStrelby() {
        return dalnostStrelby;
    }

    public void setDalnostStrelby(int dalnostStrelby) {
        this.dalnostStrelby = dalnostStrelby;
    }

    public double getTochnost() {
        return tochnost;
    }

    public void setTochnost(double tochnost) {
        this.tochnost = tochnost;
    }
    public  void sortByLetter(Archers[] archers){
        String[] newNames= new String[archers.length];
        for (int i = 0; i < archers.length; i++) {
            for (int j = i+1; j < archers.length; j++) {
                if (archers[i].name.compareTo(archers[j].name)>0){
                    String value=archers[i].name;
                    archers[i].name=archers[j].name;
                    archers[j].name=value;
                }
            }
            newNames[i]=archers[i].name;
        }
        System.out.println("Сортировка по алфавиту: " + Arrays.toString(newNames));
    }
    public void sortDalnostStrelby(Archers[] archers){
        int[] newDalnostStrelby= new int[archers.length];
        for (int i = 0; i < archers.length; i++) {
            for (int j = i+1; j < archers.length; j++) {
                if (archers[i].dalnostStrelby<archers[j].dalnostStrelby){
                    int value=archers[j].dalnostStrelby;
                    archers[j].dalnostStrelby=archers[i].dalnostStrelby;
                    archers[i].dalnostStrelby=value;
                }
            }
            newDalnostStrelby[i]=archers[i].dalnostStrelby;
        }
        System.out.println("Сортировка по дальности стрельбы :"+Arrays.toString(newDalnostStrelby));
    }

    @Override
    public String toString() {
        return super.toString()  +
                "Archers: " + "\n" +
                "Dalnost Strelby: " + dalnostStrelby + "\n" +
                "Tochnost`: " + tochnost + "\n"+
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }
}
