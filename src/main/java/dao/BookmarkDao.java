package dao;

import java.util.List;

import dto.BookmarkDTO;

public interface BookmarkDao {
	public void bookmark_save(BookmarkDTO dto);
	public List<BookmarkDTO> bookmark_list(BookmarkDTO dto);
	public void bookmark_list_delete(int num);

}
