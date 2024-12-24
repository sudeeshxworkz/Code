class BlinkItRunner{
	static String categories[] = {null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int index ;
	
	public static boolean addCategory(String categoryName){
		boolean categoryAdded = false;
		if(categoryName != null){
			System.out.println("Please Add");
			categories[index] = categoryName;
			index++;
			categoryAdded = true;
		}
		else{
			System.out.println("Cannot Find Category");
		}
		return true;
		
	}
	public static void getCategory(){
		for(String categoryName:categories){
			System.out.println(categoryName);
		}
	}
	public static boolean updateCategory(String oldCategory,String newCategory){
		boolean isUpdated = false;
		for(int cat=0;cat<categories.length;cat++){
			if(categories[cat] == oldCategory){
				categories[cat] = newCategory;
				isUpdated = true;
			}
		}
		if(isUpdated == false)
			System.out.println("Not Found");
		return isUpdated;
	}
	
}