package hello.config;

import hello.entity.Team;
import hello.entity.User;
import hello.repository.TeamRepository;
import hello.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StartUpEventListener implements ApplicationListener<ContextRefreshedEvent> {

    private final UserRepository userRepository;
    private final TeamRepository teamRepository;

    @Override
    public void onApplicationEvent(final ContextRefreshedEvent event) {

        final Team teamA = Team.builder()
                .name("팀-1")
                .build();

        final Team teamB = Team.builder()
                .name("팀-1")
                .build();

        final User user1 = User.builder()
                .name("사용자-1")
                .team(teamA)
                .build();
        final User user2 = User.builder()
                .name("사용자-1")
                .team(teamA)
                .build();
        final User user3 = User.builder()
                .name("사용자-1")
                .team(teamB)
                .build();

        teamRepository.save(teamA);
        teamRepository.save(teamB);

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
    }
}
