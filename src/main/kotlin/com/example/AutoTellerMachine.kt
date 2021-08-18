package com.example

import java.lang.Exception

class AutoTellerMachine(private val printer: Printer,private val bankingService: BankingService) {
    fun withdraw(amount: Int) {
        //WRITE CODE HERE.
        try {
            bankingService.withdraw(amount)
            printer.print("$amount")
        }catch (exception:Exception){
            printer.print("Error")
        }




    }
}