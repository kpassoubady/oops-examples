package com.kavinschool.pizza;

import java.util.ArrayList;

public class CreatePizzas {

	public static void main(String[] args) {

		// No Topping Pizza
		Pizza pizza1 = new Pizza(PizzaSize.LARGE, CrustType.ORIGINAL_STUFFED, SauceType.BBQ, true, AmountType.EXTRA,
				AmountType.MEDIUM);
		System.out.println(pizza1);

		// No Topping Pizza
		Pizza pizza2 = new Pizza(PizzaSize.LARGE, CrustType.ORIGINAL_STUFFED, SauceType.CLASSIC, true, AmountType.EXTRA,
				AmountType.MEDIUM);
		System.out.println(pizza2);

		// No Topping Pizza with Delivery
		Pizza pizza3 = new Pizza(PizzaSize.LARGE, CrustType.ORIGINAL_STUFFED, SauceType.BBQ, true, AmountType.EXTRA,
				AmountType.MEDIUM, DeliveryType.CARRYOUT);
		System.out.println(pizza3);

		// No Topping Pizza with Delivery
		Pizza pizza4 = new Pizza(PizzaSize.LARGE, CrustType.ORIGINAL_STUFFED, SauceType.CLASSIC, false, AmountType.EXTRA,
				AmountType.MEDIUM, DeliveryType.DELIVERY);
		System.out.println(pizza4);

		// Topping Pizza with Delivery
		Pizza pizza5 = new Pizza(PizzaSize.LARGE, CrustType.ORIGINAL_STUFFED, SauceType.BBQ, false, AmountType.EXTRA,
				AmountType.MEDIUM, ToppingsType.MUSHROOM, ToppingsType.PEPPERONI, DeliveryType.CARRYOUT);
		System.out.println(pizza5);

		// Topping Pizza with Delivery
		Pizza pizza6 = new Pizza(PizzaSize.LARGE, CrustType.ORIGINAL_STUFFED, SauceType.CLASSIC, false, AmountType.EXTRA,
				AmountType.MEDIUM, ToppingsType.ONIONS, ToppingsType.PEPPERONI, DeliveryType.DELIVERY);
		System.out.println(pizza6);

		ArrayList<ToppingsType> toppings = new ArrayList<>();
		toppings.add(ToppingsType.ONIONS);
		toppings.add(ToppingsType.PINEAPPLE);
		toppings.add(ToppingsType.CHICKEN);
		toppings.add(ToppingsType.JALAPENO);

		// Many Toppings Pizza with Delivery
		Pizza pizza7 = new Pizza(PizzaSize.LARGE, CrustType.ORIGINAL_STUFFED, SauceType.CLASSIC, true, AmountType.EXTRA,
				AmountType.MEDIUM, toppings, DeliveryType.DELIVERY);
		System.out.println(pizza7);
	}

}
