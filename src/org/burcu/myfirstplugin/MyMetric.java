/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.burcu.myfirstplugin;

import org.gephi.data.attributes.api.AttributeModel;
import org.gephi.graph.api.GraphModel;
import org.gephi.statistics.spi.Statistics;

/**
 *
 * @author Burcu
 */
public class MyMetric implements Statistics{
    public String report = "";
    
    @Override
    public void execute(GraphModel gm, AttributeModel am) {
        // KOD BURAYA GELECEK
        report = "Hello World!"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getReport() {
        return report; //To change body of generated methods, choose Tools | Templates.
    }
    
}
