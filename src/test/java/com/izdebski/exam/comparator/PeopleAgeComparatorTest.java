package com.izdebski.exam.comparator;

import com.izdebski.exam.pojo.People;
import org.junit.Before;
import org.junit.Test;

import java.util.GregorianCalendar;
import java.util.Set;
import java.util.TreeSet;

public class PeopleAgeComparatorTest {

    private Set<People> peoples;

    @Before
    public void setUp() throws Exception {
        // Инициализируем наш компаратор для сортировки по возврасту
        peoples = new TreeSet<People>(new PeopleAgeComparator());
    }

    @Test
    public void testAddPeople() throws Exception {
        // Инициализируем всех People
        People people1 = new People("Alex Barchuk", 21, GregorianCalendar.getInstance().getTime());
        People people2 = new People("Jered Gogs", 54, GregorianCalendar.getInstance().getTime());
        People people3 = new People("Mike Devidson", 31, GregorianCalendar.getInstance().getTime());
        People people4 = new People("Steve Jobs", 40, GregorianCalendar.getInstance().getTime());

        // Добавялем элементы в коллекцию в любом порядке
        peoples.add(people1);
        peoples.add(people4);
        peoples.add(people3);
        peoples.add(people2);

        // Выводим элементы коллеуции
        for(People people : peoples){
            System.out.println(people);
        }
    }
}