package br.com.mariojp.solid.dip;

public class DryRunMailSender implements EmailSender {
    @Override
    public void send(String to, String subject, String body) {
        System.out.println("DRY_RUN: Email para " + to + " não foi enviado");

    }
}
