package net.daum.dao;

import lombok.RequiredArgsConstructor;
import net.daum.vo.MemberVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class MemberMapperDAOImpl implements MemberMapper{
    //Mybatis쿼리문 수행객체
    private final SqlSession sqlSession;

    @Override
    public MemberVO readMember(String userid) {
        return sqlSession.selectOne("readMem", userid);
    }
}
