package edu.spring.semiproject.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.spring.semiproject.member.MemberVO;
import edu.spring.semiproject.member.MemberDAO;


@Service("memberService")

public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAO memberDAO;

	@Override
	public List listMembers() {
		List membersList = null;
		membersList = memberDAO.selectAllMemberList();
		return membersList;
	}

	@Override
	public int addMember(MemberVO member) {
		return memberDAO.insertMember(member);
	}

	@Override
	public int removeMember(String id)  {
		return memberDAO.deleteMember(id);
	}
	
	@Override
	public MemberVO login(MemberVO memberVO){
		return memberDAO.loginById(memberVO);
	}

}
