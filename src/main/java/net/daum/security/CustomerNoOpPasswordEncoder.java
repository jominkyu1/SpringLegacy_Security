package net.daum.security;

import org.springframework.security.crypto.password.PasswordEncoder;

public class CustomerNoOpPasswordEncoder implements PasswordEncoder {
    // 비밀번호 암호화 인터페이스 상속
    @Override
    public String encode(CharSequence rawPassword) {
        //암호화 하지않고 그대로 반환
        return rawPassword.toString();
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        //암호화 되기전 비밀번호와 암호화된 비밀번호를 비교
        return rawPassword.toString().equals(encodedPassword);
    }
}
