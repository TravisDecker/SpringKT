package com.decker.springkt.randomresponse

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/random-response")
@RestController
class RandomResponseController(private final val randomResponseRepo: RandomResponseRepo) {

    @GetMapping
    private fun getRandomResponse(): String {
        return randomResponseRepo.getRandomResponse();
    }
}