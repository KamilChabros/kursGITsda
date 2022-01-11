package xyz.springbootamigos.springwebappamigos.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Kamil",
                        "kamilchabros@wp.pl",
                        LocalDate.of(1987, Month.JULY, 17),
                        34
                )
        );
    }
}
