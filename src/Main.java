import peakSoft.Archers;
import peakSoft.Horsemens;
import peakSoft.Knights;
import peakSoft.Spartans;

public class Main {
    public static void main(String[] args) {

        Archers archers1= new Archers("Strongers",100,200,8.5);
        Archers archers2= new Archers("Anywhere",100,1400,8.5);
        Archers archers3= new Archers("Greece",100,500,8.5);

        Archers[] archers= new Archers[]{archers1,archers2,archers3};
        //  TODO  Лучниктер учун 2 метод : сортировка по дальности стрельбы и сортировка по алфавиту
        archers1.sortDalnostStrelby(archers);
        archers1.sortByLetter(archers);

        Horsemens horsemens1= new Horsemens("Yntymak",300,170.5,10);
        Horsemens horsemens2= new Horsemens("Dordoi",200,150.3,10);
        Horsemens horsemens3= new Horsemens("At-Bashy",400,160.9,10);

        Horsemens[] horsemens= new Horsemens[]{horsemens1,horsemens2,horsemens3};
        //      TODO  Атчандар учун аттын ылдамдыгы боюнча сортировка методу!
        horsemens1.sortByHorseSpeed(horsemens);



        Knights knights1= new Knights("Al`pha ",50,90,9);
        Knights knights2 = new Knights("Bravo",60,85,8);
        Knights knights3= new Knights("Wolfs",95,60,5);

        Knights[] knights= new Knights[]{knights1,knights2,knights3};

        // TODO    Рыцарлар учун кылыч менен колдонуу skill и боюнча сортровка
        knights1.sortBuSwordSkill(knights);

        //TODO Маалымттардын баарын чыгаруу

        Spartans[] spartans= new Spartans[]{archers1,archers2,archers3,horsemens1,horsemens2,horsemens3,knights1,knights2,knights3};
        for (Spartans sp :spartans) {
            System.out.println(sp.toString());
        }




    }
}