package com.sparta.blog.global.exception;

import com.sparta.blog.global.exception.handler.AuthException;

public class PostUnAuthException extends AuthException {
    public PostUnAuthException(String msg) {
        super(msg);
    }
}
