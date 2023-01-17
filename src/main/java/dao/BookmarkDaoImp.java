package dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import dto.BookmarkDTO;

public class BookmarkDaoImp implements BookmarkDao{
	
	private SqlSessionTemplate sqlSession;
	
	public BookmarkDaoImp() {

	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public void bookmark_save(BookmarkDTO dto) {
		sqlSession.insert("bookmark.save",dto);
	}

	@Override
	public List<BookmarkDTO> bookmark_list(BookmarkDTO dto) {
		return sqlSession.selectList("bookmark.list",dto);
	}

	@Override
	public void bookmark_list_delete(int num) {
		sqlSession.delete("bookmark.list_delete",num);
	}



}
