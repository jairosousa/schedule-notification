package com.jnsdevs.magalums.service;

import com.jnsdevs.magalums.controller.dto.ScheduleNotificationDto;
import com.jnsdevs.magalums.repository.NotificationRepository;
import org.springframework.stereotype.Service;

/**
 * @Autor Jairo Nascimento
 * @Created 07/07/2024 - 10:00
 */
@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void scheduleNotification(ScheduleNotificationDto dto) {
        notificationRepository.save(dto.toNotification());
    }
}
