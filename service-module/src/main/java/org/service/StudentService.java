package org.service;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.GJChronology;
import org.model.Student;

public class StudentService {

    public Student getStudentsDepartment() {
        DateTimeZone zone = DateTimeZone.forID("Asia/Tokyo");
        Chronology gregorianJuian = GJChronology.getInstance(zone);

        return new Student("Bob", 20);
    }

    public void checkApacheCommonsLang() {
        StringUtils.isEmpty("");
    }

    public void checkApacheBeanUtils() {

    }
}
