package com.turn.tools.boostrapupgrader.model;

public class ParseElement {
	private StringBuilder builder;
	private int offset;
	private int wordAdvancement;

	
	
	public ParseElement(StringBuilder builder, int offset, int wordAdvancement) {
		super();
		this.builder = builder;
		this.offset = offset;
		this.wordAdvancement = wordAdvancement;
		
	}
	/**
	 * @return the builder
	 */
	public StringBuilder getBuilder() {
		return builder;
	}
	/**
	 * @param builder the builder to set
	 */
	public void setBuilder(StringBuilder builder) {
		this.builder = builder;
	}
	/**
	 * @return the offset
	 */
	public int getOffset() {
		return offset;
	}
	/**
	 * @param offset the offset to set
	 */
	public void setOffset(int offset) {
		this.offset = offset;
	}
	/**
	/**
	 * @return the wordAdvancement
	 */
	public int getWordAdvancement() {
		return wordAdvancement;
	}
	/**
	 * @param wordAdvancement the wordAdvancement to set
	 */
	public void setWordAdvancement(int wordAdvancement) {
		this.wordAdvancement = wordAdvancement;
	}
	
	
}
