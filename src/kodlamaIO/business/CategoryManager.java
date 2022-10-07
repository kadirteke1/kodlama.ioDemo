package kodlamaIO.business;

import kodlamaIO.core.Logger;
import kodlamaIO.dataAccess.CategoryDao;
import kodlamaIO.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	 public void add(Category category) throws Exception {
		 Category[] categories = 
				{
						new Category(1,"Java"),
						new Category(2,"C#"),
						new Category(3,"PHP")
				};
				
				for (Category category_ : categories) {
					
					if (category.getCategoryName().equalsIgnoreCase(category_.getCategoryName())) {
						
						throw new Exception("Ayný isimde kategori eklenemez!");
					}
					
				}
		 categoryDao.add(category);
		 
		 for (Logger logger : loggers) {
			
			 logger.log(category.getCategoryName());
		}
	 }
}
