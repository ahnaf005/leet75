package com.example.leet75.assesment;

import java.util.HashSet;
import java.util.Set;

public class uniqueEmailAddress {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String email:emails){
            String[] twoPart = email.split("@");
            String namePart = twoPart[0];
            String domain = twoPart[1];
            namePart = namePart.replace(".","");
            if(namePart.contains("+")){
                namePart = namePart.split("\\+")[0];
            }
            set.add(namePart+"@"+domain);
        }
        return set.size();
    }
}
