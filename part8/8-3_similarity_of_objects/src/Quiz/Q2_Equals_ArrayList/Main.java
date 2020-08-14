package Quiz.Q2_Equals_ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Message sms = new Message("SMS");
        Message mms = new Message("MMS");

        System.out.println(sms.equals(sms));
        System.out.println(sms.equals(mms));

        ArrayList<Message> messages = new ArrayList<>();

        // Add to list because no item in list yet.
        if (!messages.contains(sms)) {
            messages.add(sms);
        }

        // Not added because item that referencing sms
        // is already added in list.
        if (!messages.contains(sms)) {
            messages.add(sms);
        }

        // Not added, too. Because even though item that
        // is going to be added has exactly the same property,
        // it is referencing different object.
        if (!messages.contains(new Message("SMS"))) {
            messages.add(sms);
        }

        System.out.println(messages.size());
    }
}
