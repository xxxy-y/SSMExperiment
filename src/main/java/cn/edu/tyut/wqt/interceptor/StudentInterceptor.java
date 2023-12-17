package cn.edu.tyut.wqt.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @Author 羊羊
 * @ClassName StudentInterceptor
 * @SubmitTime 周日
 * @DATE 2023/12/17
 * @Time 11:23
 * @Package_Name cn.edu.tyut.wqt.interceptor
 */
public class StudentInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(@NotNull HttpServletRequest request, @NotNull HttpServletResponse response, @NotNull Object handler) throws Exception {
        String uri = request.getRequestURI();
        if (uri.contains("/login")) {
            return true;
        }
        HttpSession httpSession = request.getSession();
        if (httpSession.getAttribute("USER_SESSION") != null) {
            return true;
        }
        request.setAttribute("msg", "您还没有登录，请先登录...");
        request.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);
        return false;
    }
}