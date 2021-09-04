package ru.ssendazhy.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;
    @Autowired
    private ClassicalMusic classicalMusic;


    @Autowired
    private RockMusic rockMusic;

    public void playMusic() {

        System.out.println("Playing: " + classicalMusic.getSong());
    }
}
