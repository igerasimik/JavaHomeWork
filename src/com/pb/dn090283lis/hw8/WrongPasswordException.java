package com.pb.dn090283lis.hw8;

public class WrongPasswordException extends  Exception{
    public WrongPasswordException() {
    }
    public WrongPasswordException(String str) {
        super(str);
    }
}