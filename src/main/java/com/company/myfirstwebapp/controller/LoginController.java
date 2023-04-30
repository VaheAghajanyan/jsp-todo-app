package com.company.myfirstwebapp.controller;

import com.company.myfirstwebapp.external.service.AuthenticationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    /**
     * @return jsp login page.
     */
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    /**
     * @return Welcome page after successfully login
     */
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String welcomePage(@RequestParam String name,
                              @RequestParam String password,
                              ModelMap modelMap) {
        if (this.authenticationService.isAuthenticated(name, password)) {
            modelMap.put("name", name);
            modelMap.put("password", password);

            return "welcome";
        }
        modelMap.put("error", "Login failed because of wrong credentials. Try again.");

        return "login";
    }
}
