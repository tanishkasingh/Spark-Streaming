package com.ibm.logic

import org.apache.spark._
object Myclasss {
  
  
  def main(args: Array[String]): Unit = {
    
     
      val conf = new SparkConf().setAppName("SOME APP NAME").setMaster("local");
      
      val sc = new SparkContext(conf)
      
      
      val c=sc.parallelize(Array(1,2,3,4,5,6));
      c.collect();
      print("hello");
   
  }
  
  import java.util.regex._

object HelloWorld {

def main(args: Array[String])  {

val p = Pattern.compile("i")

val m = p.matcher("intellipaat")

var found = false

while (m.find()) {

print("I found the text \""+ m.group())

print("\" starting at index " + m.start()+"\n")

found = true

}

if (!found)

println("No match found.")

}

}
}