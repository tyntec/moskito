package net.anotheria.moskito.webui.util.offlinecharts;

import org.jfree.data.xy.XYDataset;

/**
 * Created by malte on 08.08.14.
 */
public interface OfflineChartConverter {

	/**
	 * Method to convert internal Chart representation to JFreechart representation.
	 * @param chart
	 * @return
	 */
	XYDataset convertOfflineChart(OfflineChart chart);

}
