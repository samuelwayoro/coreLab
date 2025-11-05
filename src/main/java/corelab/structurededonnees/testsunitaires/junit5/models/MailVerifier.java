package corelab.structures_de_donnees.testsunitaires.junit5.models;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailVerifier {

    public static final String mailRegex = "[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z]+";

    public static boolean isMail(String inpuMail) {
        Pattern mailPattern = Pattern.compile(mailRegex);
        Matcher mailMatcher = mailPattern.matcher(inpuMail);
        return mailMatcher.matches();
    }
}
