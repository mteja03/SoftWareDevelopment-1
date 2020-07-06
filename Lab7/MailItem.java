public class MailItem
{

// The sender of the item.

    private String from;

    // The intended recipient.

    private String to;

    // The text of the message.

    private String message;



    public MailItem(String from, String to, String message)

    {

        this.from = from;

        this.to = to;

        this.message = message;

    }

    public String getFrom()

    {

        return from;

    }
    public String getTo()

    {

        return to;

    }

    public String getMessage()

    {

        return message;

    }

    public void print()

    {

        System.out.println("From: " + from);

        System.out.println("To: " + to);

        System.out.println("Message: " + message);

    }

}