package br.com.mariojp.solid.dip;

public interface EmailSender {
    void send(String to, String subject, String body);
}
