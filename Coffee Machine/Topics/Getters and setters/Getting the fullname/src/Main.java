class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        if( firstName != null){
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        // write your code here
        if( lastName != null){
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        // write your code here
        if (firstName == null && lastName != null ) {
            return lastName;
        } else if (firstName != null && lastName == null) {
            return firstName;
        } else if (firstName == "" && lastName == "") {
            return "Unknown";
        } else {
            return firstName + " " + lastName;
        }
    }
}