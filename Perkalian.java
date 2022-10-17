
public class Perkalian {
    

    public float kali(float p, float l ){
        return (float) (p*l);
    }

    public double kali(double s){
        return (double) (s*s);
    }

     public int kali(int a, int t){
        return (int) (a*t);
     }
        
   public static void main(String[] args) {
        Perkalian per = new Perkalian();

        System.out.println(per.kali(5, 4));
        System.out.println(per.kali(5));
        System.out.println(per.kali(10, 3));
    }

       
}


