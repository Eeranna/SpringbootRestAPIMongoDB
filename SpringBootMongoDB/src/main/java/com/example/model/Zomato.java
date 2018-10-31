package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Document(collection = "zomato")
public class Zomato {
	
	@Id
	private String _id;
	@JsonIgnore
	private String RestaurantID;
	@JsonIgnore
	private String restaurantName;
	@JsonIgnore
	private String countryCode;
	private String City;
	private String Address;
	private String Locality;
	@JsonIgnore
	private String localityVerbose;
	private String Longitude;
	private String Latitude;
	private String Cuisines;
	@JsonIgnore
	private String averageCostForTwo;
	private String Currency;
	@JsonIgnore
	private String hasTableBooking;
	@JsonIgnore
	private String isDeliveringNow;
	@JsonIgnore
	private String switchToOrderMenu;
	@JsonIgnore
	private String priceRange;
	@JsonIgnore
	private String aggregateRating;
	@JsonIgnore
	private String ratingColor;
	@JsonIgnore
	private String ratingText;
	private String Votes;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getRestaurantID() {
		return RestaurantID;
	}
	public void setRestaurantID(String restaurantID) {
		RestaurantID = restaurantID;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getLocality() {
		return Locality;
	}
	public void setLocality(String locality) {
		Locality = locality;
	}
	public String getLocalityVerbose() {
		return localityVerbose;
	}
	public void setLocalityVerbose(String localityVerbose) {
		this.localityVerbose = localityVerbose;
	}
	public String getLongitude() {
		return Longitude;
	}
	public void setLongitude(String longitude) {
		Longitude = longitude;
	}
	public String getLatitude() {
		return Latitude;
	}
	public void setLatitude(String latitude) {
		Latitude = latitude;
	}
	public String getCuisines() {
		return Cuisines;
	}
	public void setCuisines(String cuisines) {
		Cuisines = cuisines;
	}
	public String getAverageCostForTwo() {
		return averageCostForTwo;
	}
	public void setAverageCostForTwo(String averageCostForTwo) {
		this.averageCostForTwo = averageCostForTwo;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	public String getHasTableBooking() {
		return hasTableBooking;
	}
	public void setHasTableBooking(String hasTableBooking) {
		this.hasTableBooking = hasTableBooking;
	}
	public String getIsDeliveringNow() {
		return isDeliveringNow;
	}
	public void setIsDeliveringNow(String isDeliveringNow) {
		this.isDeliveringNow = isDeliveringNow;
	}
	public String getSwitchToOrderMenu() {
		return switchToOrderMenu;
	}
	public void setSwitchToOrderMenu(String switchToOrderMenu) {
		this.switchToOrderMenu = switchToOrderMenu;
	}
	public String getPriceRange() {
		return priceRange;
	}
	public void setPriceRange(String priceRange) {
		this.priceRange = priceRange;
	}
	public String getAggregateRating() {
		return aggregateRating;
	}
	public void setAggregateRating(String aggregateRating) {
		this.aggregateRating = aggregateRating;
	}
	public String getRatingColor() {
		return ratingColor;
	}
	public void setRatingColor(String ratingColor) {
		this.ratingColor = ratingColor;
	}
	public String getRatingText() {
		return ratingText;
	}
	public void setRatingText(String ratingText) {
		this.ratingText = ratingText;
	}
	public String getVotes() {
		return Votes;
	}
	public void setVotes(String votes) {
		Votes = votes;
	}
	
	
	
}
