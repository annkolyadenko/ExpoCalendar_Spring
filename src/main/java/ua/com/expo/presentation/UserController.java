package ua.com.expo.presentation;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ua.com.expo.dto.UserDto;
import ua.com.expo.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Objects;

@Slf4j
@Controller
@AllArgsConstructor
public class UserController {

    private final UserService userService;
    private static final String PREFIX = "/WEB-INF/jsp/";
    private static final String SUFFIX = ".jsp";

    @PostMapping("/signIn")
    public String signIn(HttpServletRequest request, UserDto userDto) {
        userDto = userService.signInUser(userDto);
        HttpSession session = request.getSession();
        session.setAttribute("authorizedUser", userDto);
        session.setAttribute("locale", userDto.getLanguage());
        log.info("LOCALE: " + userDto.getLanguage());
        return "/authorized/main";
    }

    @PostMapping("/signUp")
    public String signUp(@Valid UserDto userDto, BindingResult result, ModelMap modelMap, HttpServletRequest request) {
        log.info("userDto :" + userDto);
        //TODO STUB
        if (result.hasErrors()) {
            return "error";
        }
        userDto = userService.signUpUser(userDto);
        if (Objects.nonNull(userDto)) {
            request.getSession().setAttribute("authorizedUser", userDto);
            log.info(request.getSession().getAttribute("authorizedUser") + "authorizedUser");
        }
        log.info("userService.signUpUser: " + userDto);
        return "redirect:/authorized/main";
    }

    @PostMapping("/signOut")
    public String signOut(HttpServletRequest request) {
        request.getSession().invalidate();
        return "redirect:/";
    }

    @GetMapping("/lang")
    public String getInternationalPage(HttpServletRequest request) {
        String path = request.getParameter("path");
        log.info("Path :" + path);
        return "redirect:" + path.replace(PREFIX, StringUtils.EMPTY).replace(SUFFIX, StringUtils.EMPTY);
    }
}

    /*@GetMapping("/{id}")
    public String findById(@PathVariable("id") Long id, Model model) {
        Departments departments = simpleService.findDepartmentById(id);
        model.addAttribute("departments", departments);
        return "view";
    }*/