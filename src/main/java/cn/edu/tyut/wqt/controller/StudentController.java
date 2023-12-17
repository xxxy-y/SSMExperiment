package cn.edu.tyut.wqt.controller;

import cn.edu.tyut.wqt.entity.Student;
import cn.edu.tyut.wqt.entity.User;
import cn.edu.tyut.wqt.service.StudentService;
import com.alibaba.druid.stat.TableStat;
import com.alibaba.fastjson2.JSONObject;
import jakarta.servlet.http.HttpSession;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author 羊羊
 * @ClassName StudentController
 * @SubmitTime 周日
 * @DATE 2023/12/17
 * @Time 11:22
 * @Package_Name cn.edu.tyut.wqt.controller
 */
@Controller
public class StudentController {
    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/main")
    public String toMainPage() {
        return "main";
    }

    @PostMapping("/toLogin")
    public String toLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@NotNull User user, Model model, HttpSession httpSession) {
        String username = user.getUsername();
        String password = user.getPassword();
        if ("wqt".equals(username) && "123456".equals(password)) {
            httpSession.setAttribute("USER_SESSION", user);
            return "main";
        }
        model.addAttribute("msg", "用户名或密码错误，请重新登录...");
        return "login";
    }

    @GetMapping("/logout")
    public String logout(@NotNull HttpSession httpSession) {
        // 删除HttpSession
        httpSession.invalidate();
        return "redirect:toLogin";
    }

    @GetMapping("/getStudents")
    public ModelAndView getStudents(@NotNull ModelAndView modelAndView) {
        modelAndView.addObject("studentsList", studentService.getStudents());
        modelAndView.setViewName("allStudents");
        return modelAndView;
    }

    @PostMapping("/select")
    public ModelAndView selectStudentByName(@RequestParam("name") String name, @NotNull ModelAndView modelAndView) {
        List<Student> studentByName = studentService.findStudentByName(name);
        studentByName.forEach(System.out::println);
        modelAndView.addObject("studentList", studentByName);
        modelAndView.setViewName("select");
        return modelAndView;
    }

    @PostMapping("/update")
    public ModelAndView updateStudent(Student student, ModelAndView modelAndView) {
        int i = studentService.updateStudentById(student);
        if (i > 0) {
            modelAndView.addObject("flag", "success");
        } else {
            modelAndView.addObject("flag", "false");
        }
        modelAndView.setViewName("update");
        return modelAndView;
    }

    @PostMapping("/insert")
    public ModelAndView insertStudent(Student student, ModelAndView modelAndView) {
        int i = studentService.insertStudent(student);
        System.out.println("test");
        if (i > 0) {
            modelAndView.addObject("flag", "success");
        } else {
            modelAndView.addObject("flag", "false");
        }
        modelAndView.setViewName("insert");
        return modelAndView;
    }

    @PostMapping("/delete")
    public ModelAndView deleteStudent(@RequestParam("id") Integer id, ModelAndView modelAndView) {
        int i = studentService.deleteStudentById(id);
        System.out.println("testDelete");
        if (i > 0) {
            modelAndView.addObject("flag", "success");
        } else {
            modelAndView.addObject("flag", "false");
        }
        modelAndView.setViewName("delete");
        return modelAndView;
    }
}
