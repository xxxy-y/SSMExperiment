package cn.edu.tyut.wqt.service.impl;

import cn.edu.tyut.wqt.entity.Student;
import cn.edu.tyut.wqt.mapper.StudentMapper;
import cn.edu.tyut.wqt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 羊羊
 * @ClassName StudentMapperImpl
 * @SubmitTime 周日
 * @DATE 2023/12/17
 * @Time 11:22
 * @Package_Name cn.edu.tyut.wqt.service.impl
 */
@Service
public class StudentServiceImpl implements StudentService {
    private StudentMapper studentMapper;

    @Autowired
    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    /**
     * .
     *
     * @return .
     */
    @Override
    public List<Student> getStudents() {
        return studentMapper.getStudents();
    }

    /**
     * y
     *
     * @param name name
     * @return list
     */
    @Override
    public List<Student> findStudentByName(String name) {
        return studentMapper.findStudentByName(name);
    }

    /**
     * .
     *
     * @param student .
     * @return .
     */
    @Override
    public int updateStudentById(Student student) {
        return studentMapper.updateStudentById(student);
    }

    /**
     * .
     *
     * @param id .
     * @return .
     */
    @Override
    public int deleteStudentById(Integer id) {
        return studentMapper.deleteStudentById(id);
    }

    /**
     * .
     *
     * @param student .
     * @return .
     */
    @Override
    public int insertStudent(Student student) {
        return studentMapper.insertStudent(student);
    }
}
