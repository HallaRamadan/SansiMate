package com.example.sensimate.model

//TODO: Create Survey Class

class Survey (
    id: String?= null,
    eventId: String?=null,
    title: String?=null,
    subtitle: String?=null,
) {
    var id = id
    var title = title
    var subtitle = subtitle
    var questions: MutableList<Question> ?= null
    var eventId = eventId

    override fun toString(): String {
        return " ${questions.toString()} ${id} ${eventId} ${title} Hallo"
    }

}







/*
JSON:
{
   Title: "Title of the survey",
   SubTitle: "Subtitle of the survey"

}

The ID in the survey objects, wil be comeing from Firestore. When firestore stores documents, they are given
a uniq ID, This ID should be stored in the Survey Object aswell, under the attribute ID
 */

/*
class Survey {
    //TODO: Create Survey Class

    val json = """
        {
        "questions": {
         "type": "2",
         "format": "3"
         },         
        "title": "Title of the survey",
        "subTitle": "Subtitle of the survey",
        
}

"""

    val gson = Gson()
    val user = gson.fromJson(json, user::class.java)







    package com.example.sensimate.model

    data class surveyData(
        @Serialization
        val questions: Int,
        val title: String,
        val subtitle: String,
    )

    data class questions(
        val type: Int,
        val format: Int
    )

    data class Gson {
        //val surveyData = SurveyData

        //val user = User("John Smith", 30, Address("123 Main St", "Anytown", "CA", "12345"), listOf(PhoneNumber("home", "555-555-1234"), PhoneNumber("work", "555-555-5678")))
        //val json = gson.toJson(user)

    }


//What should be included in a Gson data class in kotlin??



 */