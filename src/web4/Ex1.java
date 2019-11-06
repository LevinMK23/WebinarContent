package web4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

class Ex1 {
    static File file;
    public static void main(String[] args) {
        file = new File("C:\\Users\\Mikhail\\IdeaProjects\\JavaStepik\\Java.Procedural\\lab2\\Programming\\src\\log.txt");
//        Scanner in = new Scanner(System.in);
//        String [] line = in.nextLine().split(" ");
//        if(line.length < 2){
//            System.out.println("GetNetAddress <IP address> <Subnet mask>");
//        }
//        else if(!checkIP(line[0])){
//
//        }else if(!checkMask(line[1])){
//
//        }
//        else {
//
//        }
        System.out.println(checkMask("128.128.128.128"));
    }

    static boolean checkIP(String ip){
        String [] add = ip.split(".");
        if(add.length == 4){
            for (String part : add){
                for (int i = 0; i < part.length(); i++) {
                    if(part.charAt(i) <= '0' || part.charAt(i) >= '9'){
                        return false;
                    }
                }
                if(Integer.parseInt(part) > 255){
                    return false;
                }
            }
            return true;
        }
        else return false;
    }

    static boolean checkMask(String mask){
        String [] add = mask.split(".");
        if(add.length == 4){
            for (String part : add){
                for (int i = 0; i < part.length(); i++) {
                    if(part.charAt(i) <= '0' || part.charAt(i) >= '9'){
                        return false;
                    }
                }
                if(Integer.parseInt(part) > 255){
                    return false;
                }
            }
            StringBuilder bin = new StringBuilder();
            for(String part : add){
                StringBuilder tmp = new StringBuilder(Integer.toBinaryString(Integer.parseInt(part)));
                while (tmp.length() < 8){
                    tmp.insert(0, "0");
                }
                bin.append(tmp);
            }
            String binString = bin.toString();
            String [] split = binString.split("(0+)");
            System.out.println(Arrays.toString(split));
            return split.length <= 1;
        }
        else return false;
    }
}