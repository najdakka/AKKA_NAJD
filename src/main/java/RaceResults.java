import java.util.ArrayList;
import java.util.List;

public class RaceResults {
    private ArrayList<ArrayList<String>> Resultats = new ArrayList<ArrayList<String>>();
    ArrayList<String> OneResult = new ArrayList<String>();
    private TimeDuration Time;
    private String tag;


    RaceResults(){
    }
    RaceResults(TimeDuration Time ,String tag){
        this.Time=Time;
        this.tag=tag;
        this.OneResult.add(tag);
        this.OneResult.add(Time.toString());
        this.Resultats.add(OneResult);

    }


    public void onNewResult(String tag, TimeDuration Time){
        String time ;
        time=Time.toString();
        OneResult.add(tag);
        OneResult.add(time);
        Resultats.add(OneResult);

    }

    public  void printResults(RaceResults Resultats){
        for (List<String> race : Resultats){
            System.out.println(race);

        }


    }

    public String toString(int i){
        return(i+"");
    }



}
