//public class Main {
//
//    static class User {
//        String username;
//        java.util.ArrayList<String> messages = new java.util.ArrayList<>();
//
//        User(String username) {
//            this.username = username;
//        }
//
//        void sendMessage(String message) {
//            messages.add(message);
//        }
//
//        void printMessages() {
//            System.out.println("Messages from " + username + ":");
//            for (String msg : messages) {
//                System.out.println(msg);
//            }
//        }
//
//        String filterMessage(String message) {
//            return message.replaceAll("(?i)(badword1|badword2)", "**");
//        }
//
//        void analyzeMessage(String message) {
//            System.out.println("Message: " + message);
//            System.out.println("Length: " + message.length());
//            System.out.println("Words: " + message.split(" ").length);
//            System.out.println("Starts with capital: " + Character.isUpperCase(message.charAt(0)));
//        }
//    }
//
//    static class Admin extends User {
//        Admin(String username) {
//            super(username);
//        }
//
//        @Override
//        void sendMessage(String message) {
//            messages.add("[ADMIN] " + message);
//        }
//    }
//
//    public static void main(String[] args) {
//        java.util.ArrayList<User> users = new java.util.ArrayList<>();
//
//        User u1 = new User("Alice");
//        User u2 = new User("Bob");
//        Admin a1 = new Admin("Moderator");
//
//        users.add(u1);
//        users.add(u2);
//        users.add(a1);
//
//        u1.sendMessage("Hello world!");
//        u2.sendMessage("Welcome to this chat!");
//        a1.sendMessage("Please follow the rules.");
//
//        for (User u : users) {
//            u.printMessages();
//            for (String msg : u.messages) {
//                String filtered = u.filterMessage(msg);
//                u.analyzeMessage(filtered);
//            }
//            System.out.println();
//        }
//    }
//}
