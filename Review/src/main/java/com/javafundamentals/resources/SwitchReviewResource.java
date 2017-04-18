package com.javafundamentals.resources;

import com.javafundamentals.services.SwitchReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yovaliceroman on 4/18/17.
 */

@RestController
public class SwitchReviewResource {

    @Autowired
    SwitchReviewService switchReviewService;

    @RequestMapping("/switch")
    public String switchStatement(){
        return switchReviewService.switchStatement();
    }
}
