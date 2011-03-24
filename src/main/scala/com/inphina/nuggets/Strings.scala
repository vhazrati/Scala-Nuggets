package com.inphina.nuggets


object Strings{

  def main(args: Array[String]) {
    // 2 ways to represent a string with double quotes or triple double quotes
    println("This is one string")
    println("""This is one string""")
    println("""This is one string
    which could be scattered over
                                 a few lines since it
                                 is with triple double quotes

    """)
    println("""  Allow me to say \"Scala is Great\" """)
    println("  Allow me to say \"Scala is Great\" ")
    println("""  Allow me to say "Scala is Great" """)
    scala.Symbol("vikas")
    val s='vikas
    print(s)
  }
}