import java.util.Scanner;
public class TimeDuration {
    private int sec=0;
    private int min=0;
    private int heure=0;

    TimeDuration(){
    }


    TimeDuration(int sec)  throws BadBadValueException {
        if (sec<0){
            throw new BadBadValueException();
        }else{
            calcul_Heure(sec);
            if (sec<3600 || (sec%3600)<60){
                do{
                    min=min+1;
                    sec=sec-60;
                }while (sec<60);
                System.out.println(min);
            }else{
                System.out.println(sec);
            }
        }
    }
    public int calcul_Heure(int sec){
        while(sec>3600){
            sec=sec-3600;
            heure=heure+1;
        }
        return heure;
    }

    public String toString(int heure,int min,int sec){
        return(heure+"h"+min+"m"+sec+"s");
    }

    public static void main(String[] args) throws BadBadValueException {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Donnez un nombre :");
        int input= scanner.nextInt();
        TimeDuration TimeDuration=new TimeDuration();
        new TimeDuration(input).toString();

    }
    public class BadBadValueException extends Exception {
        public BadBadValueException() {
            System.out.println("Nombre négative !!!");
        }
    }
}



