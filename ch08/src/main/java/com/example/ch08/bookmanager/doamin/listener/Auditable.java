package com.example.ch08.bookmanager.doamin.listener;

import java.time.LocalDateTime;

public interface Auditable {

    LocalDateTime getCreatedAt();

    LocalDateTime getUpdatedAt();

    void setCreatedAt(LocalDateTime createdAt);

    void setUpdatedAt(LocalDateTime updatedAt);

}
