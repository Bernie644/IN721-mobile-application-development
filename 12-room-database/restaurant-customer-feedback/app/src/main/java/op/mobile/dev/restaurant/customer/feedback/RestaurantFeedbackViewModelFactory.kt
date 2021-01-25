package op.mobile.dev.restaurant.customer.feedback

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

@Suppress("UNCHECKED_CAST")
class RestaurantFeedbackViewModelFactory(
    private val primaryKey: Long,
    private val dataSource: RestaurantDAO
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RestaurantFeedbackViewModel::class.java)) {
            return RestaurantFeedbackViewModel(primaryKey, dataSource) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
