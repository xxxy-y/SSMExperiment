package cn.edu.tyut.wqt.mapper;

import cn.edu.tyut.wqt.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author 羊羊
 * @ClassName StudentMapper
 * @SubmitTime 周日
 * @DATE 2023/12/17
 * @Time 11:21
 * @Package_Name cn.edu.tyut.wqt.mapper
 */
@Mapper
public interface StudentMapper {

    /**
     * .
     *
     * @return .
     */
    @Select("SELECT * FROM students")
    List<Student> getStudents();

    /**
     * 查询出名称为。。的所有用户
     *
     * @param name 名字
     * @return 列表
     */
    @Select("SELECT * FROM students WHERE NAME=#{name}")
    List<Student> findStudentByName(String name);

    /**
     * 根据传入对象的id进行更新
     *
     * @param student 传入的对象
     * @return 1/0 1 success 0 fail
     */
    @Update("UPDATE students set NAME=#{name},age=#{age} WHERE id=#{id}")
    int updateStudentById(Student student);

    /**
     * 根据id删除学生信息
     *
     * @param id 学生id
     * @return 1/0 1 success 0 fail
     */
    @Delete("DELETE FROM students WHERE id=#{id}")
    int deleteStudentById(Integer id);

    /**
     * 根据Student对象插入用户
     *
     * @param student 需要插入的用户
     * @return 1/0 1 success 0 fail
     */
    @Insert("INSERT INTO students(id, NAME, age, gender, number, address) VALUES (#{id}, #{name}, #{age}, #{gender}, #{number}, #{address})")
    int insertStudent(Student student);
}
