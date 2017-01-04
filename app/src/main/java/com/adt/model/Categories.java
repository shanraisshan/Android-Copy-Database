package com.adt.model;

/**
 * Shayan Rais (http://shanraisshan.com)
 * created on 1/4/2017
 */

public class Categories {

    private int id;
    private int parentId;
    private String categoryName;

    public Categories(int id, int parentId, String categoryName) {
        this.id = id;
        this.parentId = parentId;
        this.categoryName = categoryName;
    }
}
