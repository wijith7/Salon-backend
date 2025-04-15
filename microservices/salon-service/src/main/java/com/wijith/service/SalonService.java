package com.wijith.service;

import com.wijith.model.Salon;
import com.wijith.payload.dto.SalonDTO;
import com.wijith.payload.dto.UserDTO;

public interface SalonService {
    Salon createSalon(SalonDTO salon, UserDTO user);
}
