package com.javatest.houserent.view;

import com.javatest.houserent.domain.House;
import com.javatest.houserent.service.HouseService;
import com.javatest.houserent.utils.Utility;

public class HouseView {
    private boolean loop = true;
    private char key = ' ';
    private HouseService hs = new HouseService(3);

    //界面
    public void mainMenu() {
        do {
            System.out.println("===========oop============");
            System.out.println("\t\t\t1.添加");
            System.out.println("\t\t\t2.删除");
            System.out.println("\t\t\t3.查找");
            System.out.println("\t\t\t4.修改");
            System.out.println("\t\t\t5.列表");
            System.out.println("\t\t\t6.退出");
            System.out.println("输入1-6");
            key = Utility.readMenuSelection();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    delHouse();
                    break;
                case '3':
                    seekHouse();
                    break;
                case '4':
                    System.out.println("4");
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    System.out.println("sure?");
                    char a = Utility.readChar();
                    if (a == 'Y' || a == 'y') loop = false;
                    else if (a == 'N' || a == 'n') {
                        continue;
                    } else System.out.println("XX");
                    break;
            }

        } while (loop);
    }

    //显示信息
    public void listHouse() {
        System.out.println("===========list===========");
        System.out.println("NO.\t房主\t\t电话\t\t\t地址\t\t\t\t租金\t\tstate");
        for (int i = 0; i < hs.getHouse().length; i++) {
            if (hs.getHouse()[i] == null) {
                continue;
            }
            System.out.println(hs.getHouse()[i]);
        }
    }

    public void addHouse() {
        System.out.println("=========== add ==========");
        System.out.println("name:");
        String name = Utility.readString(8);
        System.out.println("phone:");
        String phone = Utility.readString(11);
        System.out.println("address:");
        String address = Utility.readString(12);
        System.out.println("rent");
        int rent = Utility.readInt();
        System.out.println("state");
        boolean state = Utility.readBoo();
        House house = new House(0, name, phone, address, rent, state);
        if (hs.add(house)) {
            System.out.println("add 成功");
        }

    }

    public void delHouse() {
        System.out.print("(退出:-1)id:  ");
        int id = Utility.readInt();
        if (id == -1) return;
        if (hs.del(id)) {
            System.out.println("删除成功");
        } else {
            System.out.println("失败");
        }
    }

    public void seekHouse() {
        System.out.println("===========seek==========");
        System.out.println("1.地址 2.租金 3.出租状态");
        int k = Utility.readInt();
        switch (k) {
            case 1:
                System.out.println("address:");
                String address = Utility.readString(12);
                House[] a = hs.seek(address);
                for (int i = 0; i < a.length; i++) {
                    if (a[i] != null) System.out.println(a[i]);
                }
                break;
            case 2:
                System.out.println("rent");
                int rent = Utility.readInt();
                House[] r = hs.seek(rent);
                for (int i = 0; i < r.length; i++) {
                    if (r[i] != null) System.out.println(r[i]);
                }
                break;
            case 3:
                System.out.println("state (输入0/1)");
                boolean state = Utility.readBoo();
                House[] s=hs.seek(state);
                for (int i = 0; i < s.length; i++) {
                    if (s[i] != null) System.out.println(s[i]);
                }
                break;
        }
    }
}
