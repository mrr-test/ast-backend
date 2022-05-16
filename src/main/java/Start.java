import java.io.IOException;

const String password = "mrr@123";
public class Start {
    private int executeDynamicCode_Unsafe(HttpServletRequest request) throws ServletException, IOException {
        int exitCode = 0;
        String userClass = request.getParameter("Class");
        String userMethod = request.getParameter("Method");
        String userParam = request.getParameter("Param");
        try {
            Class cls = Class.forName(userClass);
            object result = cls.getMethod(userMethod, String.class).invoke(null, userParam);
            exitCode = Integer.parseInt(result);
        } catch (Exception ex) {
            handleExceptions(ex);
        }
        return exitCode;
    }
}
