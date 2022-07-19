package co.develhope.FirstAPI3.controllers;

import co.develhope.FirstAPI3.services.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Tania Ielpo
 */

@RestController
@RequestMapping
public class StringController {

    private StringService stringService;

    @Autowired
    public StringController(StringService stringService){
        this.stringService=stringService;
    }

    @GetMapping("/strings")
    public String concatenation(@RequestParam String string1,
                                @RequestParam(required=false)String string2){

        return stringService.concatenation(string1, string2);
    }

}
