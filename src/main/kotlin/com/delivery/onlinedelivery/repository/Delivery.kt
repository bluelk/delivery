package com.delivery.onlinedelivery.repository

class Delivery {
	data class Restaurant(var meal: Meal)
	data class Type(var typeId: Int, var price: Int)
	data class Meal(var dish: String, var drink: String?, var type: Int)
	data class Order(var personalOrders: List<PersonalOrder>)
	data class PersonalOrder(var name: String, var meal: Meal)

	class Delivery {
		fun personalOrder(name: String, meal: Meal): PersonalOrder = PersonalOrder(name, meal)
		fun order(personalOrders: List<PersonalOrder>): Order = Order(personalOrders)
	}
}

