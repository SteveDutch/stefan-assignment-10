package com.stevedutch.assignment10.dto;

public class Meal {

	private String id;
	private String imageType;
	private String title;
	private String readyInMinutes;
	private String servings;
	private String sourceUrl;

	public Meal(String id, String imageType, String title, String readyInMinutes, String servings, String sourceUrl) {
		super();
		this.id = id;
		this.imageType = imageType;
		this.title = title;
		this.readyInMinutes = readyInMinutes;
		this.servings = servings;
		this.sourceUrl = sourceUrl;
	}

	public Meal() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReadyInMinutes() {
		return readyInMinutes;
	}

	public void setReadyInMinutes(String readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}

	public String getServings() {
		return servings;
	}

	public void setServings(String servings) {
		this.servings = servings;
	}

	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	@Override
	public String toString() {
		return "Meal [id=" + id + ", imageType=" + imageType + ", title=" + title + ", readyInMinutes=" + readyInMinutes
				+ ", servings=" + servings + ", sourceUrl=" + sourceUrl + "]";
	}

}
