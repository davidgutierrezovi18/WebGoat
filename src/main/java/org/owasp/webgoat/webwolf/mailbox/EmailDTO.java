package org.owasp.webgoat.webwolf.mailbox;

public class EmailDTO {
    private String recipient;
    private String subject;
    private String body;

    // Getters y setters
    public String getRecipient() { return recipient; }
    public void setRecipient(String recipient) { this.recipient = recipient; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public String getBody() { return body; }
    public void setBody(String body) { this.body = body; }
}
