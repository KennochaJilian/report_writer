import com.cci.reportworkers.classes.ExportWorker;

import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ExportWorker.export(true);
    }
}