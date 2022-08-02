package hello.controller;

import hello.entity.Team;
import hello.entity.User;
import hello.repository.TeamRepository;
import hello.repository.UserRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class HelloController {

    private final UserRepository userRepository;
    private final TeamRepository teamRepository;

    @RequestMapping("/hello")
    public String hello() {
        return "World~! Hello !! >.<";
    }

    @RequestMapping("/teams")
    public List<Team> teams() {
        return teamRepository.findAll();
    }

    @RequestMapping("/users")
    public List<User> users() {
        return userRepository.findAll();
    }
}
