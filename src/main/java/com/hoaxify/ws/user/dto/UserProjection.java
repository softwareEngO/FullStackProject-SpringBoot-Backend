package com.hoaxify.ws.user.dto;

import org.springframework.beans.factory.annotation.Value;

public interface UserProjection {

    long getId();

    String getUsername();

    String getEmail();

    @Value("#{target.image !=null ? target.image : 'default.png' }")
    String getImage();

    // Target User objesidir. Ve @Value anotasyonu ile user'ın firstname lastname
    // kısmını birleştirerek fullName olarak birleştirdik.
    @Value("#{target.firstName + ' ' + target.lastName}")
    String getFullname();
}
