public class Student implements Observer {
    private String name;
    private Forum forum;

    public Student(String name, Forum forum) {
        this.name = name;
        this.forum = forum;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String message) {
        if (message == null) {
            System.out.println("[" + name + "] All messages read. Inbox is clear.");
        } else {
            System.out.println("[" + name + "] received: " + message);
            System.out.println("[" + name + "] Total unread messages: " + forum.getUnreadMessages().size());
        }
    }
}