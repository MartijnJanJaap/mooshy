package com.event.exclusive;

import org.springframework.stereotype.Controller;

@Controller
public class GuestController {

    private GuestService guestService;

    public GuestController(GuestService guestService) {
        this.guestService = guestService;
    }

    public void createSuperGuest(Guest superGuest) {
        guestService.createSuperGuest(superGuest);
    }
}
