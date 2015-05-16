package com.mesut.bolum3

import scala.collection.mutable.ArrayBuffer


object ArrayExamples {


  def main(args: Array[String]) {

    println("********************************FIXED-LENGTH ARRAYS********************************"+'\n')

    //10 adet integer tipinde eleman içeren bir array.Tüm elemanların değeri 0.
    val nums = new Array[Int](10)
    println("nums :  "+ nums.mkString(","))

    //10 adet String tipinde eleman içeren bir array.Tüm elemanların değeri null
    val a = new Array[String](10)
    println("a :  "+ a.mkString(",") )

    //2 elemanlı array
    val s = Array("Eleman1", "Eleman2")
    println("s :  " + s.mkString(","))


    s(0) = "ElemanYeni"

    println("new s array :  " + s.mkString(","))

    println("********************************VARIABLE-LENGTH ARRAYS : ARRAYBUFFER********************************"+'\n')

    val aBuffer = ArrayBuffer[Int]()
    println("buffer :  "+aBuffer.mkString(","))
    aBuffer+=1
    println("buffer :  "+aBuffer.mkString(","))

    aBuffer += (1,2,3,5)
    println("buffer :  "+aBuffer.mkString(","))

    aBuffer ++= Array(8,13,21)
    println("buffer :  "+aBuffer.mkString(","))

    aBuffer.trimEnd(5)
    println("buffer :  "+aBuffer.mkString(","))

    println("********************************TRAVERSING ARRAYS AND ARRAYBUFFER********************************"+'\n')

    for(elem<-aBuffer)
      print(elem+",")

    println()
    println("********************************Transforming Arrays********************************"+'\n')

    val result = for(elem<-aBuffer) yield 2 *elem
    println("result :  "+result.mkString(","))


   val result2 =  aBuffer.map(4 * _)

    println("result2 :  "+result2.mkString(","))

   val newArray =  aBuffer.map(_*5)

    println("newArray :  "+newArray.mkString(","))

    val filteredArray = newArray.filter(_ % 2 ==0)

    println("filteredArray :  "+filteredArray.mkString(","))



  }


}
