package com.wijith.service.impl;

import com.wijith.model.Salon;
import com.wijith.payload.dto.SalonDTO;
import com.wijith.payload.dto.UserDTO;
import com.wijith.service.SalonService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SalonServiceImpl implements SalonService {

    @Override
    public Salon createSalon(SalonDTO salon, UserDTO user) {
        return null;
    }

    @Override
    public Salon updateSalon(SalonDTO salon, UserDTO user, Long salonId) {
        return null;
    }

    @Override
    public List<Salon> getAllSalon() {
        return null;
    }

    @Override
    public Salon getSalonById(Long salonId) {
        return null;
    }

    @Override
    public Salon getSalonByOwnerId(Long ownerId) {
        return null;
    }

    @Override
    public List<Salon> searchSalonByCity(String city) {
        return null;
    }
}
