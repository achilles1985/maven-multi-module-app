package org.model;

import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.GJChronology;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void checkJodaTime() {
        DateTimeZone zone = DateTimeZone.forID("Asia/Tokyo");
        Chronology gregorianJuian = GJChronology.getInstance(zone);
    }

    private void checkApacheCommons() {
        //StringUtils.isEmpty(name); Invisible, to make it visible, list it in pom.xml.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
