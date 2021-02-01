/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4_is2;

import kata4_is2.persistence.MailListReader;
import kata4_is2.view.HistogramDisplay;
import kata4_is2.view.MailHistogramBuilder;
import kata4_is2.model.Mail;
import kata4_is2.model.Histogram;
import java.util.List;

/**
 *
 * @author usuario
 */
public class Kata4_is2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fileName = new String("email.txt");
        List<Mail> mailList = MailListReader.read(fileName);
        
        Histogram<String> mailHistogram = MailHistogramBuilder.build(mailList);
        
      
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM...", mailHistogram);
        histogramDisplay.execute();
    }
    
}
