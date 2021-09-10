package edu.spring.semiproject.member;

import java.util.List;



import edu.spring.semiproject.member.MemberVO;


public interface MemberDAO {
	 public List selectAllMemberList();
	 public int insertMember(MemberVO memberVO) ;
	 public int deleteMember(String id) ;
	 public MemberVO loginById(MemberVO memberVO) ;

}
