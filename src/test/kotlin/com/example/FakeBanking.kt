package com.example

class FakeBanking(val isSuccessfull:Boolean): BankingService {
    override fun withdraw(amount: Int) {
        if (!isSuccessfull)
            throw  error("jgfjf")
    }
}