package com.izdebski.exam.comparator;

import com.izdebski.exam.pojo.People;

import java.util.Comparator;

public class PeopleAgeComparator implements Comparator<People> {

    @Override
    public int compare(People people1, People people2) {
        return people1.getAge()-people2.getAge();
    }
}
