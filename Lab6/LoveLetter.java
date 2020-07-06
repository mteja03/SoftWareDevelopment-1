public class LoveLetter
{
private MailClient sophie,juan;
private MailServer server;

public LoveLetter()
{
server=new MailServer();
juan=new MailClient(server,"Juan");
sophie=new MailClient(server,"Sophie");
}

public void start()
{
sophie.sendMailItem("Juan","hai how are you");
juan.printNextMailItem();
}
public static void main(String[] args)
{
LoveLetter ll=new LoveLetter();
ll.start();
}
}
