/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5knkata4;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class MailHistogramBuilder {
    public static Histogram <String> build (ArrayList<String> mails){
        Histogram<String> histogram = new Histogram<>();
        for (Object mail : mails) {
            histogram.increment(new Mail(mail).getDomain());
        }
        return histogram;
    }
}
