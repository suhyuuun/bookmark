package service;

import java.util.List;

import dao.BookmarkDao;
import dto.BookmarkDTO;

public class BookmarkServiceImp implements BookmarkService{
	private BookmarkDao dao;
	
	public BookmarkServiceImp() {

	}

	public void setDao(BookmarkDao dao) {
		this.dao = dao;
	}

	@Override
	public void saveProcess(BookmarkDTO dto) {
		dao.bookmark_save(dto);
	}

	@Override
	public List<BookmarkDTO> listProcess(BookmarkDTO dto) {
		return dao.bookmark_list(dto);
	}

	@Override
	public void list_deleteProcess(int num) {
		dao.bookmark_list_delete(num);
	}

}
