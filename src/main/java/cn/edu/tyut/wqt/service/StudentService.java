package cn.edu.tyut.wqt.service;

import cn.edu.tyut.wqt.entity.Student;

import java.util.List;

/**
 * @Author 羊羊
 * @ClassName StudentMapper
 * @SubmitTime 周日
 * @DATE 2023/12/17
 * @Time 11:21
 * @Package_Name cn.edu.tyut.wqt.service
 */
public interface StudentService {
    /**
     * .
     * @return .
     */
    List<Student> getStudents();
    /**
     * .
     *
     * @param name name
     * @return list
     */
    List<Student> findStudentByName(String name);

    /**
     * .
     *
     * @param student .
     * @return .
     */
    int updateStudentById(Student student);

    /**
     * .
     *
     * @param id .
     * @return .
     */
    int deleteStudentById(Integer id);

    /**
     * .
     *
     * @param student .
     * @return .
     */
    int insertStudent(Student student);
}
