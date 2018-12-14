package com.delivery.onlinedelivery.contorller

import com.delivery.onlinedelivery.form.MealBuildForm
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
@RequestMapping(value = "delivery")
class DeliveryController {

	@RequestMapping(value = "list", method = [RequestMethod.GET, RequestMethod.POST])
	public fun list(@ModelAttribute("maintainForm") mealBuildForm: MealBuildForm) {

	}
}