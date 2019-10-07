package ua.com.expo.tag;

import org.springframework.context.annotation.Bean;
import ua.com.expo.dto.UserDto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.tagext.TagSupport;
import java.util.Objects;

public class UserRoleTag extends TagSupport {
    private String role;

    public void setRole(String role) {
        this.role = role;
    }

    public HttpServletRequest getRequest() {
        return (HttpServletRequest) pageContext.getRequest();
    }

    @Override
    public int doStartTag() {
        if (Objects.isNull(getRequest().getSession().getAttribute("authorizedUser"))) {
            if (role.equals("empty")) {
                return EVAL_BODY_INCLUDE;
            }
        } else {
            if (((UserDto) getRequest().getSession().getAttribute("authorizedUser")).getRole().equalsIgnoreCase(role)) {
                return EVAL_BODY_INCLUDE;
            }
        }
        return SKIP_BODY;
    }
}
