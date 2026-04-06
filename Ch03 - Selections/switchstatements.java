public class switchstatements {

    public static void main(String[] args) {
        int role = 1;

        switch (role) {
            case 1: {
                System.out.println("admin");
                break;
            }
            case 2 : {
                System.out.println("moderator");
            }
            default: {
                System.out.println("guest");
                //will automatically jump out of block
            }

        }

    }
}