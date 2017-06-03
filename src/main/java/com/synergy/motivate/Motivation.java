package com.synergy.motivate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by rico on 5/22/2017.
 * add JPA to controller
 */

@RestController
public class Motivation {
    @Autowired
    MotivationRepositoryRepository allMsgs;

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/all"
    )
    public Iterable<DailyMotivationMsg> allMessages(){
        return allMsgs.findAll();
    }

    @RequestMapping(
            method = RequestMethod.POST,
            path = "/add"
    )
    public Iterable<DailyMotivationMsg> addMsg(@RequestBody DailyMotivationMsg msg){
        allMsgs.save(msg);
    return allMsgs.findAll();
    }

    @RequestMapping(
            method = RequestMethod.DELETE,
            path = "/delete/{id}"
    )
    public Iterable<DailyMotivationMsg> deleteMsg(@PathVariable Long id){
        allMsgs.delete(id);
        return allMsgs.findAll();
    }

}
