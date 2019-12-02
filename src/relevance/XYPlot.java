 package relevance;
 import java.util.List;
 import org.jfree.chart.ChartPanel;
 import org.jfree.chart.JFreeChart;
 import org.jfree.chart.ChartFactory;
 import org.jfree.chart.ChartPanel;
 import org.jfree.chart.JFreeChart;
 import org.jfree.chart.plot.PlotOrientation;
 import org.jfree.data.xy.XYSeries;
 import org.jfree.data.xy.XYSeriesCollection;
 import org.jfree.ui.ApplicationFrame;
 import org.jfree.ui.RefineryUtilities;


public class XYPlot extends ApplicationFrame {

public XYPlot(final String title, List<Double> x, List<Double> y ) {

    super(title);
    final XYSeries series = new XYSeries("Random Data");
    for(int i = 0; i<x.size();i++)
    {
        series.add(x.get(i), y.get(i));
//        System.out.println(x.get(i)+" "+y.get(i));
    }
    final XYSeriesCollection data = new XYSeriesCollection(series);
    final JFreeChart chart = ChartFactory.createXYLineChart(
        title,
        "Recall", 
        "Precision", 
        data,
        PlotOrientation.VERTICAL,
        true,
        true,
        false
    );

    final ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
    setContentPane(chartPanel);

}
}
