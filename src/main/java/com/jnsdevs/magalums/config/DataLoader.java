package com.jnsdevs.magalums.config;

import com.jnsdevs.magalums.entity.Channel;
import com.jnsdevs.magalums.entity.Status;
import com.jnsdevs.magalums.repository.ChannelRepository;
import com.jnsdevs.magalums.repository.StatusRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @Autor Jairo Nascimento
 * @Created 05/07/2024 - 12:17
 */
@Configuration
public class DataLoader implements CommandLineRunner {

    private final StatusRepository statusRepository;
    private final ChannelRepository channelRepository;

    public DataLoader(StatusRepository statusRepository, ChannelRepository channelRepository) {
        this.statusRepository = statusRepository;
        this.channelRepository = channelRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Arrays.stream(Channel.Values.values())
                .map(Channel.Values::toChannel)
                .forEach(channelRepository::save);

        Arrays.stream(Status.Values.values())
                .map(Status.Values::toStatus)
                .forEach(statusRepository::save);

    }
}
