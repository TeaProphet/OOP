package edu.csf.oop.java.schedule.logic;

import edu.csf.oop.java.schedule.logic.exceptions.WrongSurnameWithInitialsEntered;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Pattern;

public class Student {
    private final String fullName;
    private final Integer courseNumber;
    private final Integer groupNumber;
    private static final Logger logger = LoggerFactory.getLogger("info.logger");

    protected Student (String fullName, int courseNumber, int groupNumber) throws WrongSurnameWithInitialsEntered {
        String regexp = "[A-Z][a-z]{1,20}\s[A-Z]\\.[A-Z]\\.";
        if (Pattern.matches(regexp, fullName)){
            this.fullName = fullName;
            this.courseNumber = courseNumber;
            this.groupNumber = groupNumber;
            logger.info("Course " + courseNumber + ", group " + groupNumber + ": student " + fullName
                    + " has been added");
            return;
        }
        throw new WrongSurnameWithInitialsEntered();
    }

    private Student (){
        fullName = null;
        courseNumber = null;
        groupNumber = null;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getCourseNumber() {
        return courseNumber;
    }

    public Integer getGroupNumber() {
        return groupNumber;
    }


}
