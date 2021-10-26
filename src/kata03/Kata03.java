/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata03;

/**
 *
 * @author G10
 */
public class Kata03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        
        HistogramDisplay hist = new HistogramDisplay(histogram); //.execute();
        hist.execute();
    }
    
}
