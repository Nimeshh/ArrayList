package practice;

import java.util.ArrayList;

public class addUp {
    private String bio;
    private ArrayList<Information> myInfo;

    public addUp(String bio) {
        this.bio = bio;
        this.myInfo = new ArrayList<Information>();
    }

    public void printInfo() {
        System.out.println("There are currently " + myInfo.size() + " entries.");
        for (int i = 0; i < myInfo.size(); i++) {
            System.out.println(i + 1 + ". Name: " + this.myInfo.get(i).getName() + " " +
                    this.myInfo.get(i).getLastName() +

                    "\n   Address: " + this.myInfo.get(i).getStreet() + ", "
                    + this.myInfo.get(i).getCity() + ", "
                    + this.myInfo.get(i).getState() + ", "
                    + this.myInfo.get(i).getZipCode() +

                    "\n   Phone: " + this.myInfo.get(i).getPhoneNumber() + "\n");
        }
    }

    public boolean addIt(Information name) {
        int pos = findInfo(name.getName());
        if (pos >= 0) {
            System.out.println("Name already on file.");
            return false;
        }
        this.myInfo.add(name);
        return true;
    }

    public boolean updateIt(Information old, Information newOne) {
        int pos = findInfo(old.getName());
        if (pos >= 0) {
            this.myInfo.set(pos, newOne);
            System.out.println(old.getName() +
                    " is replaced now by " + newOne.getName());
            return true;
        } else {
            System.out.println("Name not found");
            return false;
        }
    }

    private int findInfo(String name) {
        for (int i = 0; i < this.myInfo.size(); i++) {
            Information info = this.myInfo.get(i);
            if (info.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    private int findInfo(Information info) {
        int pos = this.myInfo.indexOf(info);
        return pos;
    }

    public Information queryInfo(String name) {
        int position = findInfo(name);
        if (position >= 0) {
            return this.myInfo.get(position);
        }
        return null;
    }

    public String queryContact(Information info) {
        if (findInfo(info) >= 0) {
            return info.getName();
        }
        return null;
    }
}
