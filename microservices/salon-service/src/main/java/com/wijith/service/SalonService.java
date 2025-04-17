package com.wijith.service;

import com.wijith.model.Salon;
import com.wijith.payload.dto.SalonDTO;
import com.wijith.payload.dto.UserDTO;

import java.util.List;

public interface SalonService {
    Salon createSalon(SalonDTO salon, UserDTO user);

    Salon updateSalon(SalonDTO salon, UserDTO user, Long salonId);

    List<Salon> getAllSalon();

    Salon getSalonById(Long salonId);

    Salon getSalonByOwnerId(Long ownerId);

    List<Salon> searchSalonByCity(String city);



}
