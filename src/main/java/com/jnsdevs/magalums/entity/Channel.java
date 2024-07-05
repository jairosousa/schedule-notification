package com.jnsdevs.magalums.entity;

import jakarta.persistence.*;

/**
 * @Autor Jairo Nascimento
 * @Created 05/07/2024 - 10:42
 */
@Entity
@Table(name = "tb_channel")
public class Channel {

    @Id
    private Long channelId;

    private String description;

    public Channel() {
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
