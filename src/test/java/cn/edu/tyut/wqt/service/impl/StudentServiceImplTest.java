package cn.edu.tyut.wqt.service.impl;

import cn.edu.tyut.wqt.config.SpringConfig;
import cn.edu.tyut.wqt.entity.Student;
import cn.edu.tyut.wqt.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @Author 羊羊
 * @ClassName StudentServiceImplTest
 * @SubmitTime 周日
 * @DATE 2023/12/17
 * @Time 11:56
 * @Package_Name cn.edu.tyut.wqt.service.impl
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = SpringConfig.class)
class StudentServiceImplTest {
    private StudentMapper studentMapper;

    @Autowired
    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Test
    void findStudentByName() {
        System.out.println(studentMapper.findStudentByName("wqt"));
    }

    @Test
    void updateStudentById() {
        Student student = new Student();
        student.setId(1);
        student.setName("pp");
        student.setAge(99);
        System.out.println(studentMapper.updateStudentById(student));
    }

    @Test
    void deleteStudentById() {
        System.out.println(studentMapper.deleteStudentById(3));
    }

    @Test
    void insertStudent() {
        Student student = new Student();
        student.setId(3);
        student.setName("ii");
        student.setAge(88);
        student.setGender("uu");
        student.setNumber("000");
        student.setAddress("shanghai");
        student.setStatus(1);
        System.out.println(studentMapper.insertStudent(student));
    }
}