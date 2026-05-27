package com.example.leet75.assesment;

import java.util.ArrayList;
import java.util.List;

public class licenseKey {
    public String licenseKeyFormatting(String s, int k) {
        String licenseKeyWithoutDashes = s.replace("-","");
        int index = licenseKeyWithoutDashes.length();
        if (index == 0)
            return "";
        List<String>parts = new ArrayList<>();
        while(index>0){
            if(index>=k) {
                parts.add(licenseKeyWithoutDashes.substring(index - k, index).toUpperCase());
            }else{
                parts.add(licenseKeyWithoutDashes.substring(0, index).toUpperCase());
            }
            index -= k;
        }
        StringBuilder result = new StringBuilder();
        for(int i=parts.size()-1;i>0;i--){
            result.append(parts.get(i));
            result.append("-");
        }
        result.append(parts.get(0));
        return result.toString();
    }
}
