package JavaArraysandCollections.EmailList;


import java.util.ArrayList;

public class EmailList {
    private ArrayList<String> emails;

    public EmailList() {
        emails = new ArrayList<>();
    }

    // Adds a new email to the list if it doesn't already exist
    public boolean addEmail(String email) {
        if (!emails.contains(email)) {
            emails.add(email);
            return true;
        }
        return false;
    }

    // Removes an email from the list if it exists
    public boolean removeEmail(String email) {
        return emails.remove(email);
    }

    // Lists all emails in the email list
    public void listEmails() {
        if (emails.isEmpty()) {
            System.out.println("No emails in the list.");
        } else {
            System.out.println("Email List:");
            for (int i = 0; i < emails.size(); i++) {
                System.out.println((i + 1) + ". " + emails.get(i));
            }
        }
    }

    // Checks if a specific email exists in the list
    public boolean checkEmail(String email) {
        return emails.contains(email);
    }
}

