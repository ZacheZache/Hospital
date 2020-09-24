package Hospital.labs.lab3;


// 4 medlemsmetoder
// getName, isSick, takeMedication, getSickness
// 2 konstruktorer
// Name, Sickness

public class Patient {
    //Klass som förklarar pacienternas egenskaper

    private String name;
    private String sickness;

    public Patient(String name, String sickness) {
        //Kopplar till arrayen Patient
        this.name = name;
        this.sickness = sickness;
    }

    public Patient(String name) {
        //Överskrider den första konstruktorn om "sickness" saknas
        this.name = name;
    }


    public String getName() {
        //hämtar namn
        return name;
    }

    public String getSickness() {
        //hämtar sjukdom
        return sickness;
    }


    public boolean isSick() {
        //Om pacienten saknar sjukdom så sätter vi värdet på "sickness" null
        return sickness != null;
    }

    public String takeMedication(Medicine medicine) {
        //Vi sätter sickness till null för att medicinen matchar sjukdomen
        if (medicine.getTreatmentName().equals(sickness))
            sickness = null;

        return sickness;
    }

}
