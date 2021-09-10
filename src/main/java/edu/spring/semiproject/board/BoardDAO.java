package edu.spring.semiproject.board;

import java.util.List;
import java.util.Map;


import edu.spring.semiproject.board.ArticleVO;


public interface BoardDAO {
	public List selectAllArticlesList();
	public int insertNewArticle(Map articleMap) ;
	
	public ArticleVO selectArticle(int articleNO) ;
	public void updateArticle(Map articleMap) ;
	public void deleteArticle(int articleNO) ;
	public List selectImageFileList(int articleNO) ;
	
}
