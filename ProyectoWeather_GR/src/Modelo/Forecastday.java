package Modelo;

public class Forecastday {

	private String forecastDate,wxdesc,weather,minTemp,maxTemp, minTempF, maxTempF, weatherIcon;

	public Forecastday(String forecastDate, String wxdesc, String weather, String minTemp, String maxTemp,
			String minTempF, String maxTempF, String weatherIcon) {
		super();
		this.forecastDate = forecastDate;
		this.wxdesc = wxdesc;
		this.weather = weather;
		this.minTemp = minTemp;
		this.maxTemp = maxTemp;
		this.minTempF = minTempF;
		this.maxTempF = maxTempF;
		this.weatherIcon = weatherIcon;
	}

	public String getForecastDate() {
		return forecastDate;
	}

	public void setForecastDate(String forecastDate) {
		this.forecastDate = forecastDate;
	}

	public String getWxdesc() {
		return wxdesc;
	}

	public void setWxdesc(String wxdesc) {
		this.wxdesc = wxdesc;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getMinTemp() {
		return minTemp;
	}

	public void setMinTemp(String minTemp) {
		this.minTemp = minTemp;
	}

	public String getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(String maxTemp) {
		this.maxTemp = maxTemp;
	}

	public String getMinTempF() {
		return minTempF;
	}

	public void setMinTempF(String minTempF) {
		this.minTempF = minTempF;
	}

	public String getMaxTempF() {
		return maxTempF;
	}

	public void setMaxTempF(String maxTempF) {
		this.maxTempF = maxTempF;
	}

	public String getWeatherIcon() {
		return weatherIcon;
	}

	public void setWeatherIcon(String weatherIcon) {
		this.weatherIcon = weatherIcon;
	}

	@Override
	public String toString() {
		return "Forecastday [forecastDate=" + forecastDate + ", wxdesc=" + wxdesc + ", weather=" + weather
				+ ", minTemp=" + minTemp + ", maxTemp=" + maxTemp + ", minTempF=" + minTempF + ", maxTempF=" + maxTempF
				+ ", weatherIcon=" + weatherIcon + "]";
	}
	
	
}
