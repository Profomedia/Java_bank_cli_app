package tools;

public class Username {
    String firstname;

    // username generator
    public Username(String firstname) {
        this.firstname = firstname;
    }

    public String generateUser() {
        double rand = Math.random() * firstname.length();
        // convert rand to string and slice to 3 chars
        String randStr = rand + "";
        String slicedRandStr = randStr.substring(2, 4);

        // TODO read data from user db and make sure usernames are unique
        return this.firstname + slicedRandStr;
    }
}
