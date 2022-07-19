package co.develhope.FirstAPI3.services;

import org.springframework.stereotype.Service;

/**
 * @author Tania Ielpo
 */

@Service

public class StringService {

    public String concatenation (String string1, String string2){
        if(string2==null) return string1;
        return string1.concat(string2);
    }
}
