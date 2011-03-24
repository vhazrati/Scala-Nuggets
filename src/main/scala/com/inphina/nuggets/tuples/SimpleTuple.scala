package com.inphina.nuggets.tuples

object SimpleTuple{

  /*
  Main advantage of tuple is to return more than one value
   */
  def main(args:Array[String]):Unit = {
    val(tuplePosition1,tuplePosition2,tuplePosition3) = tupularFunction();
    println(tuplePosition1)

    val completeTuple = tupularFunction();
    println(completeTuple);
    println("The third value of the tuple is " + completeTuple._3)

    val stringTuple = anotherFunctionWhichReturnsTwoValues();
    println(stringTuple)

    println(doSomeHeavyCalculationAndReturnPaymentAndInventoryDetails())

  }

  def tupularFunction():(Any, Any, Any)={
         val temporaryTupleValues = (1,2,3);
        return temporaryTupleValues
  }

  def anotherFunctionWhichReturnsTwoValues(): (String, String) ={
      return ("foo", "bar")
  }

  def doSomeHeavyCalculationAndReturnPaymentAndInventoryDetails():(Payment, Inventory )={
    val payment = new Payment(12, "leeway")
    val inventory = new Inventory(18, 34,"never")

    return (payment, inventory)

  }



}