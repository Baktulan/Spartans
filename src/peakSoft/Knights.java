package peakSoft;

import peakSoft.Archers;

import java.util.Arrays;

public class Knights extends Spartans {
    private int prochnostDospeha;
    private int swordSkill;

    public Knights(String name, int count, int prochnostDospeha, int swordSkill) {
        super(name, count);
        this.prochnostDospeha = prochnostDospeha;
        this.swordSkill = swordSkill;
    }

    public int getProchnostDospeha() {
        return prochnostDospeha;
    }

    public void setProchnostDospeha(int prochnostDospeha) {
        this.prochnostDospeha = prochnostDospeha;
    }

    public int getSwordSkill() {
        return swordSkill;
    }

    public void setSwordSkill(int swordSkill) {
        this.swordSkill = swordSkill;
    }

    public void sortBuSwordSkill(Knights[] knights){
        int[] newArray= new int[knights.length];
        for (int i = 0; i < knights.length; i++) {
            for (int j = i+1; j < knights.length; j++) {
                if (knights[i].swordSkill<knights[j].swordSkill){
                    int value=knights[i].swordSkill;
                    knights[i].swordSkill=knights[j].swordSkill;
                    knights[j].swordSkill=value;
                }

            }
            newArray[i]=knights[i].swordSkill;
        }
        System.out.println("Сортировка по навыку владения мечом: "+ Arrays.toString(newArray));
    }

    @Override
    public String toString() {
        return   super.toString()+
                "Knights: " +"\n"+
                "Prochnost` Dospeha: " + prochnostDospeha +"\n"+
                "Sword Skill: " + swordSkill +"\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }
}
