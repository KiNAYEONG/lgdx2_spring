package com.lgdx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgdx.entity.Member;
import com.lgdx.repository.MemberRepository;

@Service
public class MemberService {
	@Autowired
	private MemberRepository repository;
	public void join(Member vo) {
		repository.save(vo);
	}
	public Member login(Member vo) {
		// findByIdAndPw와 매개변수 명칭이 똑같아야하므로 매개변수를 vo로 줄 수 없음.
		String id = vo.getId();
		String pw = vo.getPw();
		return repository.findByIdAndPw(id, pw);
	}

}
