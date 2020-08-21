package hr.factory.controller

interface EpoxySampleControllerListener {
    fun onIncreaseItemCountClick()
    fun onDecreaseItemCountClick()
    fun onAddToCartClick()
    fun onRelatedItemClick(itemId: Int)
}