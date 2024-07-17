package com.decker.springkt.randomresponse

import org.springframework.stereotype.Repository

@Repository
class RandomResponseRepo {

    fun getRandomResponse() :String {
        return "Random Response";
    }
}