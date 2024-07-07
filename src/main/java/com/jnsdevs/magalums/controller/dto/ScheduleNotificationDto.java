package com.jnsdevs.magalums.controller.dto;

import com.jnsdevs.magalums.entity.Channel;
import com.jnsdevs.magalums.entity.Notification;
import com.jnsdevs.magalums.entity.Status;

import java.time.LocalDateTime;

/**
 * @Autor Jairo Nascimento
 * @Created 07/07/2024 - 09:56
 */
public record ScheduleNotificationDto(
        LocalDateTime dateTime,
        String destination,
        String message,
        Channel.Values channel
) {

    public Notification toNotification() {
        return new Notification(
                dateTime,
                destination,
                message,
                channel.toChannel(),
                Status.Values.PENDING.toStatus()
        );
    }
}
