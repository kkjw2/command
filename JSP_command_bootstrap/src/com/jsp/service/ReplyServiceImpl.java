package com.jsp.service;

import java.sql.SQLException;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;

import com.jsp.command.SearchCriteria;
import com.jsp.dao.ReplyDAO;
import com.jsp.dto.ReplyVO;

public class ReplyServiceImpl implements ReplyService{

	private SqlSessionFactory sqlSession;

	public void setSqlSession(SqlSessionFactory sqlSession) {
		this.sqlSession = sqlSession;
	}

	private ReplyDAO replyDAO;
		
	public void setReplyDAO(ReplyDAO replyDAO) {
		this.replyDAO = replyDAO;
	}

	@Override
	public Map<String, Object> getReplyList(int bno, SearchCriteria cri) throws SQLException {
		
		return null;
	}

	@Override
	public int getReplyListCount(int bno) throws SQLException {
		
		return 0;
	}

	@Override
	public void registReply(ReplyVO reply) throws SQLException {
		
		
	}

	@Override
	public void modifyReply(ReplyVO reply) throws SQLException {
		
	}

	@Override
	public void removeReply(int rno) throws SQLException {
		
		
	}

}
