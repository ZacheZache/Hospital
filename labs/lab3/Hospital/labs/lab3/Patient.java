package Hospital.labs.lab3;


// 4 medlemsmetoder
// getName, isSick, takeMedication, getSickness
// 2 konstruktorer
// Name, Sickness

public class Patient {

    private String name;
    private String sickness;
    public  Patient(String name, String sickness) { //Patienter förutom Helena från array
        this.name = name;
        this.sickness = sickness;
    }

    public  Patient(String Name) { //Helena från array
 // HELENA???
    }


    public String getName(){
        return  name;
    }

    public String getSickness(){
        return sickness;
    }



    public String isSick(){

    }


    public String takeMedication(){

    }

}
