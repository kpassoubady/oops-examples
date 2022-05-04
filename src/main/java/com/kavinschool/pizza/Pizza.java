package com.kavinschool.pizza;

import java.util.ArrayList;

public class Pizza {

	private PizzaSize size;
	private CrustType crust;
	private SauceType sauce;
	private Boolean isCheese;
	private AmountType sauceAmount;
	private AmountType cheeseAmount;
	private DeliveryType delivery;
	private ArrayList<ToppingsType> toppings = new ArrayList<ToppingsType>();


	public Pizza() {
		super();
	}

	public PizzaSize getSize() {
		return size;
	}

	public void setSize(PizzaSize size) {
		this.size = size;
	}

	public CrustType getCrust() {
		return crust;
	}

	public void setCrust(CrustType crust) {
		this.crust = crust;
	}

	public SauceType getSauce() {
		return sauce;
	}

	public void setSauce(SauceType sauce) {
		this.sauce = sauce;
	}

	public AmountType getSauceAmount() {
		return sauceAmount;
	}

	public void setSauceAmount(AmountType sauceAmount) {
		this.sauceAmount = sauceAmount;
	}

	public AmountType getCheeseAmount() {
		return cheeseAmount;
	}

	public void setCheeseAmount(AmountType cheeseAmount) {
		this.cheeseAmount = cheeseAmount;
	}

	public Pizza(PizzaSize size, CrustType crust, SauceType sauce, Boolean cheese, AmountType sauceAmount,
			AmountType cheeseAmount) {
		super();
		this.size = size;
		this.crust = crust;
		this.sauce = sauce;
		this.isCheese = cheese;
		this.sauceAmount = sauceAmount;
		this.cheeseAmount = cheeseAmount;
	}


	public Pizza(PizzaSize size, CrustType crust, SauceType sauce, Boolean cheese, AmountType sauceAmount,
			AmountType cheeseAmount, ToppingsType topping1, ToppingsType topping2) {
		super();
		this.size = size;
		this.crust = crust;
		this.sauce = sauce;
		this.isCheese = cheese;
		this.sauceAmount = sauceAmount;
		this.cheeseAmount = cheeseAmount;
		toppings.add(topping1);
		toppings.add(topping2);
	}

	public Pizza(PizzaSize size, CrustType crust, SauceType sauce, Boolean isCheese, AmountType sauceAmount,
			AmountType cheeseAmount, DeliveryType delivery) {
		super();
		this.size = size;
		this.crust = crust;
		this.sauce = sauce;
		this.isCheese = isCheese;
		this.sauceAmount = sauceAmount;
		this.cheeseAmount = cheeseAmount;
		this.delivery = delivery;

	}
	
	public Pizza(PizzaSize size, CrustType crust, SauceType sauce, Boolean isCheese, AmountType sauceAmount,
			AmountType cheeseAmount, ToppingsType topping1, ToppingsType topping2, DeliveryType delivery) {
		super();
		this.size = size;
		this.crust = crust;
		this.sauce = sauce;
		this.isCheese = isCheese;
		this.sauceAmount = sauceAmount;
		this.cheeseAmount = cheeseAmount;
		this.delivery = delivery;
		toppings.add(topping1);
		toppings.add(topping2);
	}

	public Pizza(PizzaSize size, CrustType crust, SauceType sauce, Boolean isCheese, AmountType sauceAmount,
			AmountType cheeseAmount, ArrayList<ToppingsType> toppings, DeliveryType delivery ) {
		super();
		this.size = size;
		this.crust = crust;
		this.sauce = sauce;
		this.isCheese = isCheese;
		this.sauceAmount = sauceAmount;
		this.cheeseAmount = cheeseAmount;
		this.delivery = delivery;
		this.toppings = toppings;
	}

	@Override
	public String toString() {
		return "Pizza [size=" + size + ", crust=" + crust + ", sauce=" + sauce + ", isCheese=" + isCheese
				+ ", sauceAmount=" + sauceAmount + ", cheeseAmount=" + cheeseAmount + ", delivery=" + delivery
				+ ", toppings=" + toppings + "]";
	}
	
}