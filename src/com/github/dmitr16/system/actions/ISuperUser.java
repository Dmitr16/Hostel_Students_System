package com.github.dmitr16.system.actions;

import com.github.dmitr16.system.models.College;
import com.github.dmitr16.system.models.Hostel;
import com.github.dmitr16.system.models.Room;
import com.github.dmitr16.system.models.Student;

public interface ISuperUser {
    void createStudent(Student student);

    void deleteStudent(Student student);

    void updateStudent(Student student);

    void checkIn();

    void checkOut();

    void createCollege(College college);

    void deleteCollege(College college);

    void updateCollege(College college);

    void createRoom(Room room);

    void deleteRoom(Room room);

    void updateRoom(Room room);

    void createHostel(Hostel hostel);

    void deleteHostel(Hostel hostel);

    void updateHostel(Hostel hostel);
}
