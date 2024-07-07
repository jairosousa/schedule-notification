package com.jnsdevs.magalums.service;

import com.jnsdevs.magalums.controller.dto.ScheduleNotificationDto;
import com.jnsdevs.magalums.entity.Notification;
import com.jnsdevs.magalums.repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public Optional<Notification> findById(Long notificationId) {
        return notificationRepository.findById(notificationId);
    }

    public void scheduleNotification(ScheduleNotificationDto dto) {
        notificationRepository.save(dto.toNotification());
    }
}
