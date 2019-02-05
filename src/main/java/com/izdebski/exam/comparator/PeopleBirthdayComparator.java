package com.izdebski.exam.comparator;

import com.izdebski.exam.pojo.People;

import java.util.Comparator;

public class PeopleBirthdayComparator implements Comparator<People>{
    @Override
    public int compare(People people1, People people2) {
        return people1.getBirthday().compareTo(people2.getBirthday());
    }
}