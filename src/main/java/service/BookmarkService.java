package service;

import java.util.List;

import dto.BookmarkDTO;

public interface BookmarkService {
	public void saveProcess(BookmarkDTO dto);
	public List<BookmarkDTO> listProcess(BookmarkDTO dto);
	public void list_deleteProcess(int num);
	

}
