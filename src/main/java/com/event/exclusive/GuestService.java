package com.event.exclusive;

import org.springframework.stereotype.Service;

@Service
public class GuestService {

    private GuestRepository guestRepository;

    public GuestService(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    public void createSuperGuest(Guest superGuest) {
        guestRepository.save(superGuest);
    }
}
