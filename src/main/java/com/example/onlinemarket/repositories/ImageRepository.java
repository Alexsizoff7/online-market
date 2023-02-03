package com.example.onlinemarket.repositories;

import com.example.onlinemarket.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
