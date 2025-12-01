package Task_8.Extra.UsersId;

import java.util.HashSet;

public class UsersId {
    private final HashSet<Integer> usersIds;

    public UsersId() {
        this.usersIds = new HashSet<>();
    }

    public void addUserId(Integer id) {
        usersIds.add(id);
    }

    public Boolean findUserId(Integer id) {
        return usersIds.contains(id);
    }

    public void printUsersIds() {
        System.out.println(usersIds);
    }

    public Boolean removeUserId(Integer id) {
        return usersIds.remove(id);
    }
}
