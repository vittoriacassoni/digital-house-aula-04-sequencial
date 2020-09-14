package classes

class Dog (val name: String, lastName: String) { // Name field is required
    var color: String = "";
    var yearOfBirth: Int = 0;
    var fullName: String;

    init{ // Call after constructor
        fullName = name + " " + lastName;
    }

    constructor(dogName: String, yearOfBirth: Int): this(dogName, ""){
        this.yearOfBirth = yearOfBirth;
    }

    fun calculateAge() : Int{
        return 2020 - yearOfBirth;
    }
}