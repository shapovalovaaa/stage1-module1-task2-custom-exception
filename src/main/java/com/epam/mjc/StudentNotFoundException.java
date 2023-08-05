package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException {
    public StudentNotFoundException(long ID) {
        super("Could not find student with ID " + ID);
    }

}
