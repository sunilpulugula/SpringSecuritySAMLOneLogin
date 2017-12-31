package com.geeksoverflow.security.saml.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.geeksoverflow.security.saml.database.dao.UserDAO;


/**
 * @author <a href="mailto:sunil.pulugula@wavemaker.com">Sunil Kumar</a>
 * @since 26/11/17
 */
public class RegisterUserDetailsService {

    @Autowired
    private UserDAO userDAO;

}
