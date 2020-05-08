package com.newcode.commuity.wenda.dao;

import org.springframework.stereotype.Repository;

@Repository
public class alphadaoHibernatelmpl implements alphadao {
    @Override
    public String select() {
        return "Hibernate";
    }
}
