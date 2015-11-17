package kata5knkata4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Practica3 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<String> maillist = MailReader.read();
        Histogram<String> histogram = MailHistogramBuilder.build(maillist);
        HistogramDisplay hitodisplay = new HistogramDisplay(histogram);
        hitodisplay.execute();
    }
    
    
}
