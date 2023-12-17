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
        // request.getRequestDispatcher("/WEB-INF/pages/login.jsp")获取了一个用于目标资源（在这里是/WEB-INF/pages/login.jsp）的请求调度器（RequestDispatcher）对象。然后，通过调用forward(request, response)方法，将当前请求和响应对象传递给目标资源，使其能够处理该请求。
        // 在下面的代码中，/WEB-INF/pages/login.jsp是一个位于WEB-INF目录下的JSP页面。由于WEB-INF目录下的资源无法直接通过URL访问，因此使用请求转发的方式将请求发送给该JSP页面进行处理。
        request.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);
        return false;
    }
}