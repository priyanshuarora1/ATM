package com.example

class FakePrinter: Printer {
    var printedString:String=""
    override fun print(text: String){
      printedString=text
    }

}