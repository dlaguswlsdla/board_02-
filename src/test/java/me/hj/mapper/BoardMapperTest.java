package me.hj.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import me.hj.config.AppTest;
import me.hj.model.Board;

public class BoardMapperTest extends AppTest{

	@Autowired
	BoardMapper mapper;
	
	@Test
	public void getListTest() {
		List<Board> list = mapper.getList();
		assertEquals(2, list.size());
	}

}
