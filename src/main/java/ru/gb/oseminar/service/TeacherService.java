package ru.gb.oseminar.service;

import java.time.LocalDate;
import java.util.List;

public interface TeacherService<T>{

    List<T> getAll();

    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);

}
