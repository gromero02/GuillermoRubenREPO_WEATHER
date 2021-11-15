package Modelo;

import java.util.ArrayList;

public class Forecast {
	
	private String issueDate,timeZone;
	private ArrayList<Forecastday> forecastDay = null;



	public Forecast(ArrayList<Forecastday> forecastDay, String timeZone, String issueDate) {
		super();
		this.forecastDay = forecastDay;
		this.timeZone = timeZone;
		this.issueDate = issueDate;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public ArrayList<Forecastday> getForecastDay() {
		return forecastDay;
	}

	public void setForecastDay(ArrayList<Forecastday> forecastDay) {
		this.forecastDay = forecastDay;
	}

	@Override
	public String toString() {
		return "Forecast [issueDate=" + issueDate + ", timeZone=" + timeZone + ", forecastDay=" + forecastDay + "]";
	}

	
}
