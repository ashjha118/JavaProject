package functional_interfaces;

interface DataExporter {
    void exportToCSV();
    void exportToPDF();

 
    default void exportToJSON() {
        System.out.println("Export to JSON (default implementation)");
    }
}


class CSVExporter implements DataExporter {

    public void exportToCSV() {
        System.out.println("Data exported to CSV file.");
    }

    public void exportToPDF() {
        System.out.println("Data exported to PDF file.");
    }
   
}

class AdvancedExporter implements DataExporter {
  
    public void exportToCSV() {
        System.out.println("Data exported to CSV (Advanced).");
    }

 
    public void exportToPDF() {
        System.out.println("Data exported to PDF (Advanced).");
    }

    public void exportToJSON() {
        System.out.println("Data exported to JSON (Custom JSON formatting).");
    }
}

public class dataexport {
    public static void main(String[] args) {
        DataExporter csvExporter = new CSVExporter();
        DataExporter advancedExporter = new AdvancedExporter();

        System.out.println("=== Data Export Feature ===");

        csvExporter.exportToCSV();
        csvExporter.exportToPDF();
        csvExporter.exportToJSON();
        System.out.println();

        advancedExporter.exportToCSV();
        advancedExporter.exportToPDF();
        advancedExporter.exportToJSON(); 
    }
}