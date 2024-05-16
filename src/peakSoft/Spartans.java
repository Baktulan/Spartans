package peakSoft;

public class Spartans {
     String name;
    int count;

    public Spartans() {
    }

   public Spartans(String name,int count){
        this.name=name;
        this.count=count;
   }
   public void setName(String name){
        this.name=name;
   }
   public String getName(){
        return name;
   }
   public void setCount(int count){
        this.count=count;
   }

    @Override
    public String toString() {
        return "Spartans " +"\n"+
                "Name: " + name + "\n" +
                "Count: " + count +"\n";
    }
}
