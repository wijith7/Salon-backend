package com.wijith.service.impl;

import com.wijith.exception.UserException;
import com.wijith.model.User;
import com.wijith.repository.UserRepository;
import com.wijith.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    @Override
    public User createUser(User user) {

        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) throws UserException {
        Optional<User> otp = userRepository.findById(id);
        if(otp.isPresent()){
            return otp.get();
        }
        throw new UserException("user not found");
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) throws UserException {
        Optional<User> otp = userRepository.findById(id);

        if (otp.isEmpty()){
            throw new UserException("user not exist with id" + id);
        }
        userRepository.deleteById(otp.get().getId());

    }

    @Override
    public User updateUser(Long id, User user) throws UserException {
        Optional<User> otp = userRepository.findById(id);

        if (otp.isEmpty()){
            throw new UserException("user not found with id" + id);
        }
        User existingUser = otp.get();

        existingUser.setFullName(user.getFullName());
        existingUser.setEmail(user.getEmail());
        existingUser.setRole(user.getRole());
        existingUser.setPhone(user.getPhone());
        existingUser.setUsername(user.getUsername());

        return userRepository.save(existingUser);
    }
}
