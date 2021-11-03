package SparkPack

object SparkObj {
  
  def main(args: Array[String]):Unit={
    
    println("----rawdata----")
    
    val list_Int=List(1,2,3,4,5,6,7,8) //Creating a list of integers and saving it in list_Int
    
    list_Int.foreach(println) //Printing and checking the content inside list_Int
    
    println
    
    println("----Filtereddata----")
    
    val filtered_list=list_Int.filter(x=>x>4) //Filtering from the list
    
    filtered_list.foreach(println)
    
    println
    
    println("----Multiple Mapdata----")
    
    val map_data=list_Int.map(x=>x*4) // Multipling using map
    
    map_data.foreach(println)
    
    println
    
    println("-----Raw data----")
    
    val list_str=List("zeyobron","zeyo","analytics","Hareesh","zeyobrona")
    
    list_str.foreach(println)
    
    println
    
    println("-----Filter zeyo----")
    
    val filtered_zeyo=list_str.filter(x=>x.contains("zeyo")) //Filtering with zeyo
        
    filtered_zeyo.foreach(println)
    
    println("----Appending Mapdata----")
    
    val Append_mapdata=list_str.map(x=>x+" Har") //Appending Har in each string
    
    Append_mapdata.foreach(println)
    
    println("----Rawdata----")
    
    val list_string_nest=List("Hareesh,war","zeyo,Analytics","Bigdata,developer","Data,Science")
    
    list_string_nest.foreach(println)
    
    println("----Flatterend data----")
    
    val flattern_data=list_string_nest.flatMap(x=>x.split(",")) // Flattening the data
    
    flattern_data.foreach(println)
    
    println
    
    println("----Map Replace----")
    
    val map_replace = flattern_data.map(x=>x.replace("Hareesh", "NA")) //replacing Hareesh with NA
        
        map_replace.foreach(println)
    
        println("------data----")
    val list_string_map=List("State->Andhra~City->Anantapur",
                             "State->Tamilnadu~City->Chennai",
                             "State->Maharastra~City->Mumbai")
     list_string_map.foreach(println)
    val flat_data=list_string_map.flatMap(x=>x.split("~"))
    flat_data.foreach(println)
    val state=flat_data.filter(x=>x.contains("State"))
    state.foreach(println)
    
    val city=flat_data.filter(x=>x.contains("City"))
    city.foreach(println)
    val states=state.map(x=>x.replace("State->",""))
    states.foreach(println)
    val cities=city.map(x=>x.replace("City->",""))
    cities.foreach(println)
        
    
        
  }
}