package com.qatakomain.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Category {
	@JsonProperty("ParentID")
	public int parentID;

	@JsonProperty("CategoryID")
	public int categoryID;

	@JsonProperty("Name")
	public String name;

	@JsonProperty("Categories")
	public ArrayList<Category> categories;

	public int getParentID() {
		return parentID;
	}

	public void setParentID(int parentID) {
		this.parentID = parentID;
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Category> getCategories() {
		return categories;
	}

	public void setCategories(ArrayList<Category> categories) {
		this.categories = categories;
	}
}