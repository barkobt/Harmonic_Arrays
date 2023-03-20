package Array;

public class AvarageAndHarmonic {
     static void Harmonic() {
        int [] list = {1,2,3,4,5,6};
        double harmonicSeries = 0.0;
        double sum = 0.0;
        for (int i = 1; i<=list.length; i++) {
            harmonicSeries = 1.0/i;
            sum += harmonicSeries;

        }

        double harmonicAvarage;
         harmonicAvarage = list.length/sum;
         System.out.println(harmonicAvarage);
    }
    public static void main(String[] args) {
        double sum = 0.0;
        int [] list = {1,2,3,4,5,6};
        for (int i = 0; i<list.length; i++) {
            sum +=list[i];

        }
        double avarage = sum / list.length;
        System.out.println(avarage);
        Harmonic();
    }

}
