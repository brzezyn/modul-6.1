package com.kodilla.good.patterns.challenges.order;

public class MailService implements InformationService {

    public void inform(User user) {
        System.out.println("Order confirmation has been sent to user's e-mail " + user.getNICKNAME());
    }
}

