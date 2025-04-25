package com.wijith.mapper;

import com.wijith.model.Salon;
import com.wijith.payload.dto.SalonDTO;

public class SalonMapper {
    public static SalonDTO mapToDTO(Salon salon) {
        SalonDTO salonDTO = new SalonDTO();
        salonDTO.setId(salon.getId());
        salonDTO.setCity(salon.getCity());
        salonDTO.setAddress(salon.getAddress());
        salonDTO.setEmail(salon.getEmail());
        salonDTO.setCloseTime(salon.getCloseTime());
        salonDTO.setImages(salon.getImages());
        salonDTO.setName(salon.getName());
        salonDTO.setPhoneNumber(salon.getPhoneNumber());
        salonDTO.setOpenTime(salon.getOpenTime());
        salonDTO.setOwnerId(salon.getOwnerId());
        return salonDTO;


    }
}
