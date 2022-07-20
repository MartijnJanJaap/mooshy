package com.event.exclusive;

import org.springframework.data.repository.CrudRepository;

public interface GuestRepository extends CrudRepository<Guest, Long> {

    Guest save(Guest superGuest);


}
