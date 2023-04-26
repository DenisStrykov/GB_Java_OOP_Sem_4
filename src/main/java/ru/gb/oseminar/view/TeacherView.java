package ru.gb.oseminar.view;

import ru.gb.oseminar.data.Teacher;

import java.util.List;

public interface TeacherView <T extends Teacher> {

    void sendOnConsole(List<T> list);

}
