package hr.factory.view_model

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import hr.factory.callbacks.ToolbarCallback
import hr.factory.controller.EpoxySampleControllerListener
import hr.factory.repository.DataProvider
import hr.factory.ui_models.*

class EpoxySampleVM : ViewModel(), EpoxySampleControllerListener, ToolbarCallback {
    val ui by lazy { MutableLiveData<List<BaseCell>>() }
    private val repository by lazy { DataProvider() }
    private var numberOfItemsToAddTOCart = 1

    init {
        setUI()
    }

    override fun onBackClick() {
        Log.i("EpoxySampleVM", "onBackClick")

    }

    override fun onShareClick() {
        Log.i("EpoxySampleVM", "onShareClick")

    }

    override fun onAddToCartClick() {
        Log.i("EpoxySampleVM", "onAddToCartClick")
    }

    override fun onDecreaseItemCountClick() {
        if(numberOfItemsToAddTOCart > 1) {
            numberOfItemsToAddTOCart--
        }
        updateNumberOfItems()
    }

    override fun onIncreaseItemCountClick() {
        numberOfItemsToAddTOCart++
        updateNumberOfItems()
    }

    private fun updateNumberOfItems() {
        ui.value?.filterIsInstance<CartCellData>()?.get(0)?.numberOfItems = numberOfItemsToAddTOCart.toString()
        updateUI()
    }

    override fun onRelatedItemClick(itemId: Int) {
        Log.i("EpoxySampleVM", "onRelatedItemClick, itemId: $itemId")
    }

    private fun setUI() {
          ui.postValue(repository.provideUIData())
    }

    private fun updateUI() {
        ui.postValue(ui.value)
    }

}