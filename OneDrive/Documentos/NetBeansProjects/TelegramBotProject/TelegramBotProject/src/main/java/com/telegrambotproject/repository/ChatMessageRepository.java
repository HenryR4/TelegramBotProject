/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.telegrambotproject.repository;

import com.telegrambotproject.entity.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
/**
 *
 * @author hisco
 */
public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {
    List<ChatMessage> findByUserId(Long userId);
}
