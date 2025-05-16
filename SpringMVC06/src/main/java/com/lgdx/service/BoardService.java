package com.lgdx.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgdx.entity.Board;
import com.lgdx.repository.BoardRepository;

@Service
public class BoardService {
	
	@Autowired
	private BoardRepository repository;

	public List<Board> boardList() {
		return repository.findAll();
	}

	public Board boardContents(Long idx) {
		Optional<Board> vo = repository.findById(idx);
		return vo.get();
	}

	public void boardInsert(Board vo) {
		repository.save(vo);// idx가 없다.
	}

	public void boardDelete(Long idx) {
		repository.deleteById(idx);
	}

	public void boardUpdate(Board vo) {
		repository.save(vo);// idx가 있다.
	}

	public void boardCount(Long idx) {
		repository.count(idx); // idx 넣어서 메소드 새로 만들자.

	}

}
