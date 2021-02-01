/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4_is2.view;

import kata4_is2.model.Mail;
import kata4_is2.model.Histogram;
import java.util.List;

/**
 *
 * @author usuario
 */
public class MailHistogramBuilder {

    public static Histogram<String> build(List<Mail> mailList) {
       Histogram<String> histogram = new Histogram();
       
       for (Mail mail : mailList){
           histogram.increment(mail.getDomain());
       }
       return histogram;
    }
    
}
