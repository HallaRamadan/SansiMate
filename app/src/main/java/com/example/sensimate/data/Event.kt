package com.example.sensimate.data

class Event(
    id: Int,
    title:String,
    date:String,
    image: Int, street:String,
    town:String,
    postcode: Int,
    country:String) {
    var id = id;
    var title = title;
    var date = date;
    var image = image;
    var street = street;
    var town = town;
    var postcode = postcode;
    var country = country;

    @Override
    override fun toString(): String {
        return "$id, $image"
    }
}


