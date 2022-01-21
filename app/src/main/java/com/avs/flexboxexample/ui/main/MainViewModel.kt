package com.avs.flexboxexample.ui.main

import androidx.lifecycle.ViewModel

data class Dish(
    val title: String = "",
    val previewUrl: String = "",
    val description: String? = null,
    val totalIngredientsCount: Int = 0,
    val ingredients: MutableList<String> = mutableListOf()
)

class MainViewModel : ViewModel() {

    val starters: MutableList<Dish> = mutableListOf(
        Dish(
            "Asian-style oysters",
            "https://img.taste.com.au/Qrae5nwj/w720-h480-cfill-q80/taste/2016/11/asian-style-oysters-71587-1.jpeg",
            "Summer entertaining has never been easier with these fast and fresh Asian-style oysters.",
            9,
            mutableListOf(
                "24 freshly shucked oysters",
                "3 spring onions",
                "1/4 cup (60ml) light soy sauce"
            )
        ),
        Dish(
            "Roasted stuffed mushrooms",
            "https://img.taste.com.au/RhosJEon/w720-h480-cfill-q80/taste/2016/11/roasted-stuffed-mushrooms-80629-1.jpeg",
            "Hearty comfort meets healthy eating in this delicious recipe. Plus it's kind to your wallet as well as your waistline.",
            11,
            mutableListOf(
                "8 large (about 650g) flat mushrooms",
                "1 brown onion",
                "2 garlic cloves",
                "250g (1 cup) low-fat ricotta"
            )
        ),
        Dish(
            "Bruschetta two ways",
            "https://img.taste.com.au/UALfZjtm/w720-h480-cfill-q80/taste/2016/11/bruschetta-two-ways-38105-1.jpeg",
            "Here are two simple bruschetta ideas to satisfy everyone's palate.",
            13,
            mutableListOf(
                "8 pieces thickly sliced bread",
                "1 avocado, finely chopped",
                "100g sliced smoked salmon"
            )
        ),
        Dish(
            "Antipasto platter",
            "https://img.taste.com.au/vWNkaV6s/w720-h480-cfill-q80/taste/2016/11/antipasto-platter-2787-1.jpeg",
            "Artfully place cold cuts of meat and marinated vegetables on a beautiful platter then let everyone dig in.",
            14,
            mutableListOf(
                "8 marinated artichokes",
                "200g kalamata olives",
                "16 slices chargrilled kumara",
                "24 slices chargrilled zucchini",
                "16 slices prosciutto"
            )
        )
    )

    val mainCourses: MutableList<Dish> = mutableListOf(
        Dish(
            "Slow-cooker pineapple and capsicum turkey",
            "https://img.taste.com.au/nv_dNz5I/w720-h480-cfill-q80/taste/2016/11/slow-cooker-pineapple-and-capsicum-turkey-89223-1.jpeg",
            "These drumsticks are ideal for a hearty and delicious meal, whether in a slow cooker or on the stovetop.",
            13,
            mutableListOf(
                "2 (1.5kg) Inghams turkey drumsticks",
                "440g can pineapple pieces in juice",
                "400g can diced tomatoes",
                "Steamed rice, to serve"
            )
        ),
        Dish(
            "Slow-cooker meatloaf",
            "https://img.taste.com.au/YEaW2O7V/w720-h480-cfill-q80/taste/2016/11/slow-cooker-meatloaf-104445-1.jpeg",
            "A meatloaf made in the slow cooker.",
            15,
            mutableListOf(
                "800g beef mince",
                "1/3 cup mozzarella, grated",
                "2 garlic cloves",
                "737g jar red wine and garlic pasta sauce"
            )
        ),
        Dish(
            "Creamy chicken macaroni",
            "https://img.taste.com.au/EBWggWPE/w720-h480-cfill-q80/taste/2016/11/creamy-chicken-macaroni-88272-1.jpeg",
            "Sprinkle a zesty herb crumb over this cheesy macaroni to add a tasty crunch.",
            18,
            mutableListOf(
                "1kg chicken thigh fillets",
                "300g dried macaroni pasta",
                "125ml (1/2 cup) white wine"
            )
        ),
        Dish(
            "Moussaka soup",
            "https://img.taste.com.au/_b4hgUzB/w720-h480-cfill-q80/taste/2020/05/moussaka-soup-161231-2.jpg",
            "A hearty meal this Moussaka soup is loaded with 3.5 vegies per serve.",
            16,
            mutableListOf(
                "2 lamb shanks",
                "400g can diced tomatoes",
                "2 cups Massel Chicken Style Liquid Stock"
            )
        )
    )

    val desserts: MutableList<Dish> = mutableListOf(
        Dish(
            "2-minute tiramisu",
            "https://img.taste.com.au/Ehszv7fu/w720-h480-cfill-q80/taste/2016/11/tiramisu-22890-1.jpeg",
            "This recipe's name speaks for itself.",
            5,
            mutableListOf(
                "150ml thickened cream",
                "125g (1/2 cup) mascarpone",
                "2 tbs coffee liqueur",
                "60ml (1/4 cup) sweetened condensed milk"
            )
        ),
        Dish(
            "Panna cotta with roasted strawberries",
            "https://img.taste.com.au/Y01SN7U5/w720-h480-cfill-q80/taste/2019/08/panna-cotta-with-roasted-strawberries-taste-153207-1.jpg",
            "We can't get over how pretty these panna cotta with roasted strawberries are - and the fact that they're delicious is another bonus!",
            8,
            mutableListOf(
                "250g strawberries, chopped",
                "6 gelatine leaves",
                "300ml pouring (pure) cream"
            )
        ),
        Dish(
            "Pine lime splice cheesecake",
            "https://img.taste.com.au/PbH3__bj/w720-h480-cfill-q80/taste/2018/12/pine-lime-splice-cheesecake-145376-2.jpg",
            "We've turned the summer favourite Splice pine lime ice-cream into a jelly cheesecake, perfect for entertaining.",
            11,
            mutableListOf(
                "200g butternut snap cookies",
                "100g butter, melted",
                "500g cream cheese, softened",
                "9g packet lite pineapple jelly"
            )
        ),
    )

}