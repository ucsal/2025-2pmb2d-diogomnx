package br.com.mariojp.solid.dip;

public class EmailNotifier {
	private final EmailSender emailSender;

    public EmailNotifier(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void welcome(User user) {
		emailSender.send(user.email(), "Bem-vindo", "Olá " + user.name());
	}
}
