package Library;

import java.util.ArrayList;
import java.util.List;

public class PatronsList {
    private List<Patrons> patronsList = new ArrayList<Patrons>();


    public PatronsList(List<Patrons> patronsList) {
        this.patronsList = patronsList;
    }

    public PatronsList(){};

    public void searchID(int id){
        for (Patrons patron: patronsList){
            if (id == patron.getId()){
                System.out.println(patron.toString());
            }
        }
    }

    public void addPatron(Patrons patrons){
        patronsList.add(patrons);
    }
}
