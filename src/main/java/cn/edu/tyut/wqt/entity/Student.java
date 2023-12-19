package cn.edu.tyut.wqt.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author 羊羊
 * @ClassName Student
 * @SubmitTime 周日
 * @DATE 2023/12/17
 * @Time 11:19
 * @Package_Name cn.edu.tyut.wqt.entity
 */
@Data
public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private String number;
    private String address;
    private Integer status;
}
