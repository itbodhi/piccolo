package com.itbodhi.piccolo.entity.base;


public class EventBase {

	private String eventName;
	private String ageGroup;
	private String startDate;
	private String endDate;
	private String typeOfActivity;

	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}

	/**
	 * @param eventName
	 *            the eventName to set
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	/**
	 * @return the ageGroup
	 */
	public String getAgeGroup() {
		return ageGroup;
	}

	/**
	 * @param ageGroup
	 *            the ageGroup to set
	 */
	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}

	/**
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate
	 *            the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate
	 *            the endDate to set
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the typeOfActivity
	 */
	public String getTypeOfActivity() {
		return typeOfActivity;
	}

	/**
	 * @param typeOfActivity
	 *            the typeOfActivity to set
	 */
	public void setTypeOfActivity(String typeOfActivity) {
		this.typeOfActivity = typeOfActivity;
	}

}
