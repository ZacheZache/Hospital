package Hospital.labs.lab3;


// 4 medlemsmetoder
// getName, isSick, takeMedication, getSickness
// 2 konstruktorer
// Name, Sickness

public class Patient {
    //Klass som förklarar pacienternas egenskaper

    private String name;
    private String sickness;

    Patient(String name, String sickness) {
        //Kopplar till arrayen Patient
        this.name = name;
        this.sickness = sickness;
    }

    Patient(String name) {
        //Överskrider den första konstruktorn om "sickness" saknas
        this.name = name;
    }


    String getName() {
        //hämtar namn
        return name;
    }

    String getSickness() {
        //hämtar sjukdom
        return sickness;
    }


    boolean isSick() {
        //Om pacienten saknar sjukdom så sätter vi värdet på "sickness" null
        return sickness != null;
    }

    void takeMedication(Medicine medicine) {
        //Vi sätter sickness till null för att medicinen matchar sjukdomen
        if (medicine.getTreatmentName().equals(sickness))
            sickness = null;
    }

}
