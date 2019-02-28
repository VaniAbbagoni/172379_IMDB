package com.imdb.review;

public class RatingPojo
{

	String comment;

	public RatingPojo(String comment) {
		super();
		this.comment = comment;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "RatingPojo [comment=" + comment + "]";
		
	}
}
