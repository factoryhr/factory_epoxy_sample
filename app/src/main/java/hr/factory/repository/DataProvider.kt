package hr.factory.repository

import hr.factory.ui_models.*

class DataProvider() {

    fun provideUIData() : List<BaseCell> {
        val dataList = mutableListOf<BaseCell>()
        dataList.add(HeaderCellData("https://miro.medium.com/max/7848/1*r_rq_fRLNliX91GSgMi38Q.jpeg"))
        dataList.add(TitleCellData("Catan", "$55.00"))
        dataList.add(SubtitleCellData("The incredibly popular, multi award winning civilization building board game of harvesting and trading resources"))
        dataList.add(SectionTitleCellData("Skills"))
        dataList.add(ChipGroupCellData(listOf("Tactical skill", "strategy", "Luck")))
        dataList.add(InfoCellData("45 - 90 min", "3 - 4"))
        dataList.add(CartCellData("1"))
        dataList.add(DescriptionCellData("Minutes to Learn, a Lifetime to Explore", "The basics of CATAN can be learned in just minutes, but it offers enough depth to remain compelling as you explore strategies and tactics for years to come."))
        dataList.add(DescriptionCellData("Tremendous Replay Value", "The completely variable board provides great value through nearly limitless replayability. You’ll never have to play the same game twice."))
        dataList.add(SectionTitleCellData("Related items"))
        dataList.add(ItemCellData(11, "https://images-na.ssl-images-amazon.com/images/I/61l5mkw2ODL._AC_SL1000_.jpg", "A Game of Thrones Catan", "$79.00"))
        dataList.add(ItemCellData(12, "https://www.catan.com/files/styles/lightboxy/public/packshots/inca_boxshot_en.png?itok=5O821JhU", "Catan - Rise of the Inkas", "$65.00"))
        dataList.add(ItemCellData(13, "https://i5.walmartimages.com/asr/ce7ae7ab-e91b-4c32-a637-800b16c80dc6_2.a25027f08dc02d9e207d5be25a04d94c.jpeg", "Catan: Seafarers", "$56.00"))
        return  dataList
    }
}