import com.misout.designpattern.templatemethod.model.User;
import com.misout.designpattern.templatemethod.remote.impl.UserInterface;
import com.misout.designpattern.templatemethod.request.UserRequest;
import com.misout.designpattern.templatemethod.result.Result;

/**
 * @author Misout
 * @date 2018-09-09 19:26:38
 */
public class MainTest {
    public static void main(String[] args) {
        UserInterface userService = new UserInterface();
        UserRequest request = new UserRequest();
        // 暂且用时间毫秒数作为请求ID
        request.setBusinessId(System.currentTimeMillis());
        request.setUserName("");

        // 非法请求
        Result<User> result = userService.templateMethod(request);
        System.out.println("返回结果：" + result.toString());

        // 正常请求
        request.setBusinessId(System.currentTimeMillis());
        request.setUserName("张三");
        result = userService.templateMethod(request);
        System.out.println("返回结果：" + result.toString());
    }
}
