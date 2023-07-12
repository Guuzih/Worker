package endities;

import java.sql.Date;

public class HourContract {

	private Date date;
	private double valuePenHour;
	private Integer hours;

	
	public HourContract(Date date, double valuePenHour, Integer hours) {
		this.date = date;
		this.valuePenHour = valuePenHour;
		this.hours = hours;
	}


	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getValuePenHour() {
		return valuePenHour;
	}

	public void setValuePenHour(double valuePenHour) {
		this.valuePenHour = valuePenHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public double totalValue() {

		return valuePenHour * hours;

	}

}
