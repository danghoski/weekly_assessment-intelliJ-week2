fun main (){
    // break
    var count3 : Int = 21
    if (count3 == 21)
        println(count3)

    // contimue
    var hen : Int = 20
    if (hen == 20)
        println(hen)

    var num1 : Int = 20
    //continue
    if (num1 <= 30)
        println(num1)

    // break
    var count4 : Int = 21
    if (count4 == 21)
        println(count4)

    // continue
    var di : Int = 20
    if (di == 20)
        println(di)

    var num2 : Int = 9
    // continue
    if (num2 <= 10)
        println(num2)

    //break
    var num : Int = 49
    if(num > 22)
        println(num)

    // conditional expression
    var dayOfTheWeek : String = "Tuesday"
    var result3 = String = when
    dayOfTheWeek == "Monday" -> "Class Day One"
    dayOfTheWeek == "Tuesday" -> "Class Day Two"
    dayOfTheWeek == "Wednesday" -> "Class Day Three"
    else -> "Invalid Day Of Class for Mobile App"
    {
        println(result3)
    }

    // conditional expression
    var partOfBody : String = "Mouth"
    var result4 = String = when
    partOfBody == "Skin" -> "To Feel"
    partOfBody == "Eye" -> "To See"
    partOfBody == "Mouth" -> "To Talk"
    partOfBody == "Leg" -> "To walk"
    else -> "Invalid Part Of the Body"
    {
        println(result4)
    }

    // conditional expression
    var typesofUntensil : String = "Fork"
    var result5 = String = when
    typesofUntensil == "Spoon" -> "Soup"
    typesofUntensil == "Fork" -> "Yam"
    typesofUntensil == "Knife" -> "meat"
    typesofUntensil == "Teaspoon" -> "Tea"
    else -> "Invalid type of utensil"
    {
        println(result5)
    }

    // conditional expression
    var monthOfyear : String = "June"
    var result6 = String = when
    monthOfyear == "January" -> "Drive"
    monthOfyear == "March" -> "Exercise"
    monthOfyear == "June" -> "Party"
    monthOfyear == "August" -> "Travel"
    else -> "Invalid month of year"
    {
        println(result6)
    }

    // conditional expression
    var footballsName : String = "June"
    var result7 = String = when
    footballsName == "Mount" -> "Is the Best"
    footballsName == "Havertz" -> "Commands The Attack"
    footballsName == "Azpi" -> "Is The Captain"
    footballsName == "Mendy" -> "Catches the Ball"
    footballsName == "Messi" -> "Takes Free Kick"
    else -> "Invalid footballers name"
    {
        println(result7)
    }
}

