package com.lethalmaus.javadoccheck;

public class Test {

	public static final String TEST = "test";

	/**
	 * ok
	 *
	 */
	public static enum KJHKJH {

	};

	String x = "x";

	public void test() {

	}

	/** */
	public void author() {

	}

	/**
	 * @author @return @throws
	 */
	public void emptyClause() {

	}

	/**
	 * @return void
	 * @param none
	 *
	 */
	public void wrongClauseOrder() {

	}

	@Deprecated
	public void deprecated() {

	}

}
