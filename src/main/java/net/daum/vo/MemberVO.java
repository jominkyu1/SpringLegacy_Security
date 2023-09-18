package net.daum.vo;

import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
public class MemberVO {

    private String userid;
    private String userpw;
    private String userName; 
    //userName, regDate, updaeDate 빈클래스 변수명은 해당 테이블 컬럼명과 다름

    private boolean enabled;

    private Timestamp regDate;
    private Timestamp updateDate;
    private List<AuthVO> authList; //권한목록
}
