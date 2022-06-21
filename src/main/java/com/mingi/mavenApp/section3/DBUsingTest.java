package com.mingi.mavenApp.section3;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mingi.dto.BoardDTO;
import com.mingi.dto.EmpVO;
import com.mingi.model.BoardService;
import com.mingi.model.EmpService;

public class DBUsingTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("di5.xml");
		
//		BoardService service = ctx.getBean("boardService",BoardService.class);
//		List<BoardDTO> blist = service.selectAll();
//		for(BoardDTO b : blist) {
//			System.out.println(b);
//		}
		EmpService service = ctx.getBean("eService",EmpService.class);
		for(EmpVO emp : service.selctAll()) {
			System.out.println(emp);
		}
		

	}

}
