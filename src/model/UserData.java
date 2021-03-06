package model;

import java.util.List;

public class UserData {
    private String lastName;
    private String firstName;
    private String uniqueName;
    private String email;
    private List<Group> groups;
    private String phoneNumber;
    private String secondPhoneNumber;

    public UserData(){

    }

    public UserData(UserData temp) {

        this.lastName = temp.getLastName();
        this.firstName = temp.getFirstName();
        this.uniqueName = temp.getUniqueName();
        this.email = temp.getEmail();
        this.groups = temp.getGroups();
        this.phoneNumber = temp.getPhoneNumber();
        if (temp.getSecondPhoneNumber() != null) {
            this.secondPhoneNumber = temp.getSecondPhoneNumber();
        }
    }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setUniqueName(String uniqueName) {
           this.uniqueName = uniqueName;
        }

        public String getUniqueName() {
            return uniqueName;
        }

       public List<Group> getGroups() {
            return groups;
        }

        public boolean addGroup(Group group) {
            return groups.add(group);
        }


        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }


        public void setSecondPhoneNumber(String secondPhoneNumber) {
            this.secondPhoneNumber = secondPhoneNumber;
        }

        public String getSecondPhoneNumber() {
            return secondPhoneNumber;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getEmail() {
            return email;
        }
    public String toString() {
        return "User{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", unique name='" + uniqueName + '\'' +
                ", group=" + groups +
                ", second phone # ='" + secondPhoneNumber + '\'' +
               ", mobilePhone='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +

                '}';
    }
}
