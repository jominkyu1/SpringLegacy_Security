package net.daum.vo;

import lombok.Data;
import net.daum.dao.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class AuthVO {
    //tbl_member_auth 테이블의 컬럼명과 일치하는 VO클래스
    private String userid;
    private String auth;

}