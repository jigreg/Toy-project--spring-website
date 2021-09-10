package edu.spring.semiproject.member;

import java.util.List;



import edu.spring.semiproject.member.MemberVO;

public interface MemberService {
	 public List listMembers();
	 public int addMember(MemberVO memberVO);
	 public int removeMember(String id);
	 public MemberVO login(MemberVO memberVO) throws Exception;
}
