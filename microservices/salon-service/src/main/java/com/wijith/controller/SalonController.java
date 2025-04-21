package com.wijith.controller;

import com.wijith.mapper.SalonMapper;
import com.wijith.model.Salon;
import com.wijith.payload.dto.SalonDTO;
import com.wijith.payload.dto.UserDTO;
import com.wijith.service.SalonService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/salons")
@RequiredArgsConstructor
public class SalonController {

    private final SalonService salonService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SalonDTO createSalon (@RequestBody SalonDTO salonDTO) {

        UserDTO userDTO = new UserDTO();
        userDTO.setId(1L);
        Salon salon = salonService.createSalon(salonDTO, userDTO);
        return SalonMapper.mapToDTO(salon);
    }

    @PatchMapping("{/salonId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public SalonDTO updateSalon (@RequestBody SalonDTO salonDTO,
    @PathVariable Long salonId) throws Exception {

        UserDTO userDTO = new UserDTO();
        userDTO.setId(1L);
        Salon salon = salonService.updateSalon(salonDTO, userDTO, salonId );
        return SalonMapper.mapToDTO(salon);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public List<SalonDTO> getAllSalons() throws Exception {

        UserDTO userDTO = new UserDTO();
        userDTO.setId(1L);
        List <Salon> salons = salonService.getAllSalon();
        List <SalonDTO> salonDTOS = salons.stream().map((salon) ->
        {

                SalonDTO salonDTO = SalonMapper.mapToDTO(salon);
                return salonDTO;

        }
        ).toList();
        return salonDTOS;

    }
}
