package com.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk

class AutoTellerMachineTest: StringSpec({
    "should call fake printer and fake banking at time of withdraw"{
        val printer= FakePrinter()
        val banking= FakeBanking(true)
        AutoTellerMachine(printer,banking).withdraw(500)
        printer.printedString shouldBe("500")

    }
    "should print a receipt if money is withdrawn successfully" {
    }

    "should throw exception if banking service throws an exception" {
        val printer= FakePrinter()
        val banking= FakeBanking(false)
        AutoTellerMachine(printer,banking).withdraw(500)
        printer.printedString shouldBe("Error")

    }
})