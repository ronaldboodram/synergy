package com.synergy.motivate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by rico on 5/22/2017.
 */

@RestController
public class Motivation {

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/all"
    )
    public String allMessages(){
        return "Im working on this!";
    }
}
