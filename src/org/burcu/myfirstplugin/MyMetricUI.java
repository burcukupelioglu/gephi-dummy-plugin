/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.burcu.myfirstplugin;

import javax.swing.JPanel;
import org.gephi.statistics.spi.Statistics;
import org.gephi.statistics.spi.StatisticsUI;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author Burcu
 */
@ServiceProvider(service = StatisticsUI.class)
public class MyMetricUI implements StatisticsUI{
    private MyMetricPanel panel;
    private MyMetric myMetric;
    
    @Override
    public JPanel getSettingsPanel() {
        panel = new MyMetricPanel(); //To change body of generated methods, choose Tools | Templates.
        return panel;
    }

    @Override
    public void setup(Statistics ststcs) {
        this.myMetric = (MyMetric)ststcs; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void unsetup() {
        panel = null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Class<? extends Statistics> getStatisticsClass() {
        return MyMetric.class; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getValue() {
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDisplayName() {
        return "Burcu MyMetric"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getShortDescription() {
        return "Burcus First Plugin...."; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCategory() {
        return StatisticsUI.CATEGORY_NETWORK_OVERVIEW; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getPosition() {
        return 800; //To change body of generated methods, choose Tools | Templates.
    }
    
}
