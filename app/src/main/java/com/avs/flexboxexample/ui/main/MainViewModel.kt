package com.avs.flexboxexample.ui.main

import androidx.lifecycle.ViewModel

data class Dish(val title: String = "", val previewUrl: String = "", val description: String? = null, val ingredients: MutableList<String> = mutableListOf())

class MainViewModel : ViewModel() {

    val list: MutableList<Dish> = mutableListOf(
        Dish("Antipasto platter", "https://img.taste.com.au/vWNkaV6s/w720-h480-cfill-q80/taste/2016/11/antipasto-platter-2787-1.jpeg", "Artfully place cold cuts of meat and marinated vegetables on a beautiful platter then let everyone dig in.", mutableListOf("8 marinated artichokes", "200g kalamata olives", "16 slices chargrilled kumara", "See 11 more ingredients")),
        Dish("Roasted stuffed mushrooms", "https://img.taste.com.au/RhosJEon/w720-h480-cfill-q80/taste/2016/11/roasted-stuffed-mushrooms-80629-1.jpeg", "Hearty comfort meets healthy eating in this delicious recipe. Plus it's kind to your wallet as well as your waistline.", mutableListOf("8 large (about 650g) flat mushrooms", "Olive oil spray", "1 brown onion", "2 garlic cloves", "See 7 more ingredients")),
        Dish("Bruschetta two ways", "https://img.taste.com.au/UALfZjtm/w720-h480-cfill-q80/taste/2016/11/bruschetta-two-ways-38105-1.jpeg", "Here are two simple bruschetta ideas to satisfy everyone's palate.", mutableListOf()),
        Dish("Asian-style oysters", "https://img.taste.com.au/Qrae5nwj/w720-h480-cfill-q80/taste/2016/11/asian-style-oysters-71587-1.jpeg", "Summer entertaining has never been easier with these fast and fresh Asian-style oysters.", mutableListOf())
    )

}