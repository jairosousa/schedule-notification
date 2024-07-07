package com.jnsdevs.magalums.repository;

import com.jnsdevs.magalums.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Autor Jairo Nascimento
 * @Created 07/07/2024 - 09:41
 */
public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
