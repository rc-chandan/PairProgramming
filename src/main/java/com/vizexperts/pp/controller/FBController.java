package com.vizexperts.pp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * Created by rc-chandan on 20/3/17.
 */

@RestController
public class FBController {

    @RequestMapping("/")
    public String apiHome() {
        return "link to all api end points";
    }
}