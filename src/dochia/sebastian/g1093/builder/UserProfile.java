package dochia.sebastian.g1093.builder;

public class UserProfile {

    private long userID;
    private String userName;
    private int attendancesCount;

    public static class Builder {

        private long userID;
        private String userName;
        private int attendancesCount;

        public Builder(long userID) {
            this.userID = userID;
        }

        public Builder addUserName(String userName) {
            this.userName = userName;

            return this;
        }

        public Builder addAttendancesCount(int attendancesCount) {
            this.attendancesCount = attendancesCount;

            return this;
        }

        public UserProfile build() {
            UserProfile profile = new UserProfile();
            profile.userID = this.userID;
            profile.userName = this.userName;
            profile.attendancesCount = this.attendancesCount;

            return profile;
        }
    }

    private UserProfile() {

    }
}
