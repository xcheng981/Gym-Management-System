package edu.northeastern.mygym.user;

import java.util.List;

public class UserDirectory {
    private final List<User> users;

    public UserDirectory(List<User> users) {
        this.users = users;
    }

    public Admin findAdminByUserName(String userName) {
        for (User user : users) {
            if (user.getUserName().equals(userName)) {
                if (user instanceof Admin) {
                    return (Admin) user;
                } else {
                    throw new IllegalStateException("Non-Admin user attempt to login as Admin");
                }
            }
        }
        return null;
    }

    public Member findMemberByUserName(String userName) {
        for (User user : users) {
            if (user.getUserName().equals(userName)) {
                if (user instanceof Member) {
                    return (Member) user;
                } else {
                    throw new IllegalStateException("Admin user attempt to login as Member");
                }
            }
        }
        return null;
    }

    public List<User> viewAllUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void updateMember(String userName,
                             String newName,
                             String newEmail,
                             String newPassword) {
        Member member = findMemberByUserName(userName);
        if (newName != null) {
            member.setName(newName);
        }
        if (newEmail != null) {
            member.setEmail(newEmail);
        }
        if (newPassword != null) {
            member.setPassword(newPassword);
        }
    }

    public void updateAdmin(String userName,
                            String newName,
                            String newEmail,
                            String newPassword) {
        Admin admin = findAdminByUserName(userName);
        if (newName != null) {
            admin.setName(newName);
        }
        if (newEmail != null) {
            admin.setEmail(newEmail);
        }
        if (newPassword != null) {
            admin.setPassword(newPassword);
        }
    }
}
