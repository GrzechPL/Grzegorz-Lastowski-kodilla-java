package com.kodilla.stream.forumuser;
import java.time.LocalDate;

public final class  ForumUser {

    //klasa musi byc niemutowalna dla strumienia dlatego jest final
    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postCounter;

    public ForumUser(final int userId, final String userName, final char sex, final LocalDate dateOfBirth, final int postCounter) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postCounter = postCounter;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostCounter() {
        return postCounter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;

        if (userId != forumUser.userId) return false;
        if (sex != forumUser.sex) return false;
        if (postCounter != forumUser.postCounter) return false;
        if (userName != null ? !userName.equals(forumUser.userName) : forumUser.userName != null) return false;
        return dateOfBirth != null ? dateOfBirth.equals(forumUser.dateOfBirth) : forumUser.dateOfBirth == null;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (int) sex;
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + postCounter;
        return result;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postCounter=" + postCounter +
                '}';
    }
}
