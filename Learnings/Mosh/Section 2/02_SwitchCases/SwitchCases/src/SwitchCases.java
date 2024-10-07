public class SwitchCases {
    public static void main(String[] args) throws Exception {
        System.out.println("Switch cases");

        String role = "admin";
        if (role == "admin") {
            System.out.println("you are an admin");
        }
        else if (role == "moderator") {
            System.out.println("you are a moderator");
        }
        else 
            System.out.println("you are a user");

        //Using Switch
        switch (role) {
            case "admin":
                System.out.println("you are an admin");
                break;
            case "moderator":
                System.out.println("you are a moderator");
                break;
        
            default:
                System.out.println("you are a user");
                break;
        }
    }
}
