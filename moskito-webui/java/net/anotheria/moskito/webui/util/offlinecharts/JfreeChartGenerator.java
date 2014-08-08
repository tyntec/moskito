package net.anotheria.moskito.webui.util.offlinecharts;

import org.jfree.data.xy.XYDataset;

/**
 * Created by malte on 08.08.14.
 */
public interface JfreeChartGenerator {

	/**
	 * Method to render the image
	 * @param dataset
	 * @return
	 */
	public byte[] renderPngChart(OfflineChart chart);
}
