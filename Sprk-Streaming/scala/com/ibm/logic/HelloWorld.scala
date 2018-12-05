package com.ibm.logic


import java.util.regex._

object HelloWorld {

def main(args: Array[String])  {

val p = Pattern.compile("aaa")

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