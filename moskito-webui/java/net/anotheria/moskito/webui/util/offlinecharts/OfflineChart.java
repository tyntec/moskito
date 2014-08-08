package net.anotheria.moskito.webui.util.offlinecharts;

import java.util.LinkedList;
import java.util.List;

/**
 * Represents a chart for generation.
 *
 * @author lrosenberg
 * @since 23.07.14 00:34
 */
public class OfflineChart {
	/**
	 * Caption of the chart.
	 */
	private String caption;

	/**
	 * Maximum size of a generated chart.
	 */
	private int width = 900;
	private int height = 600;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * Definition of chart lines.
	 */
	private List<OfflineChartLineDefinition> lineDefinitions = new LinkedList<OfflineChartLineDefinition>();
	/**
	 * Points with values for all lines.
	 */
	private List<OfflineChartPoint> points = new LinkedList<OfflineChartPoint>();

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public List<OfflineChartLineDefinition> getLineDefinitions() {
		return lineDefinitions;
	}

	public void setLineDefinitions(List<OfflineChartLineDefinition> lineDefinitions) {
		this.lineDefinitions = lineDefinitions;
	}

	public List<OfflineChartPoint> getPoints() {
		return points;
	}

	public void setPoints(List<OfflineChartPoint> points) {
		this.points = points;
	}

	@Override public String toString(){
		return "Chart "+getCaption()+", LineDefinitions: "+getLineDefinitions()+", Points: "+getPoints();
	}

	public void addLineDefinition(OfflineChartLineDefinition offlineChartLineDefinition) {
		lineDefinitions.add(offlineChartLineDefinition);
	}

	public void addPoint(OfflineChartPoint ocp) {
		points.add(ocp);
	}
}
