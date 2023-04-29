package dev.vorstu;

import dev.vorstu.entity.Password;
import dev.vorstu.entity.Role;
import dev.vorstu.entity.Student;
import dev.vorstu.entity.User;
import dev.vorstu.repositories.StudentRepository;
import dev.vorstu.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Initializer {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private StudentRepository studentRepository;

    public void initial() {
        studentRepository.save(new Student("Савенков Алексндр Александрович", "ИСП-211с", "+78005553535"));
        studentRepository.save(new Student("Пупкин Василия Васильевич", "ИСП-211с", "+79999999999"));
        studentRepository.save(new Student("Бородач Александр Радионович", "ИСП-211с", "+71111111111"));
        studentRepository.save(new Student("Федорин Даниил Романович", "ИСП-211с", "+79856751212"));
        studentRepository.save(new Student("Тестовый Тест Тестович", "ИСП-211с", "+79000000000"));

        User student = new User(
                null,
                "student",
                Role.STUDENT,
                new Password("1234"),
                true
        );
        userRepository.save(student);
    }
}
