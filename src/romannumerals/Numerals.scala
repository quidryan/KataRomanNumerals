
package romannumerals

sealed abstract class Numerals(value:Int, symbol:String)
case object I extends Numerals(1, "I")
case object V extends Numerals(5, "V")
case object X extends Numerals(10, "X")
case object L extends Numerals(50, "L")
case object C extends Numerals(100, "C")
case object D extends Numerals(500, "D")
case object M extends Numerals(1000, "M")


/*
 object Numerals extends Enumeration {
     type Numerals = Value
     val I(1,"I"),
         V(5, "V"),
         X(10,"X"),
         L(50, "L"),
         C(100, "C"),
         D(500, "D"),
         M(1000, "M")
   }
*/