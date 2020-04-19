package com.example.jobportal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExpandableListData {
    public static LinkedHashMap<String, List<String>> getData(){
        LinkedHashMap<String,List<String>> mp = new LinkedHashMap<>();

        mp.put("Applicant 1",new ArrayList<String>(Arrays.asList("Contact : 323432423","Age : 30")));
        mp.put("Applicant 2",new ArrayList<String>(Arrays.asList("Contact : 221313123","Age : 23")));
        return mp;
    }
}
