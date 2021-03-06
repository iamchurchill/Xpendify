package com.samsoft.xpendify.graph.hzgrapherlib.util;

import android.graphics.Bitmap;

public class MatrixTranslator {
	
	private int mWidth;
	private int mHeight;
	private int mPaddingLeft;
	private int mPaddingBottom;
	
	public MatrixTranslator(int width, int height, int paddingLeft, int paddingBottom) {
		mWidth = width;
		mHeight = height;
		mPaddingLeft = paddingLeft;
		mPaddingBottom = paddingBottom;
	}
	
	public float calcX(float x){
		return x + mPaddingLeft;
	}
	
	public float calcY(float y){
		return mHeight - (y + mPaddingBottom);
	}
	
	public float calcBitmapCenterX(Bitmap bitmap, float x){
		return x + mPaddingLeft - bitmap.getWidth()/2;
	}
	
	public float calcBitmapCenterY(Bitmap bitmap, float y){
		return mHeight - (y + mPaddingBottom) -  bitmap.getHeight()/2;
	}
}
