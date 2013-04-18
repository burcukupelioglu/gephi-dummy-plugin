/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.burcu.myfirstplugin;

import org.gephi.statistics.spi.Statistics;
import org.gephi.statistics.spi.StatisticsBuilder;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author Burcu
 */
@ServiceProvider(service = StatisticsBuilder.class)
public class MyMetricBuilder implements StatisticsBuilder {

    @Override
    public String getName() {
        return "Burcu MyMetric"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Statistics getStatistics() {
        return new MyMetric(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Class<? extends Statistics> getStatisticsClass() {
        return MyMetric.class; //To change body of generated methods, choose Tools | Templates.
    }
    
}
