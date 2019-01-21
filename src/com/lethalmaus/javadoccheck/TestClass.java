package com.lethalmaus.javadoccheck;

// Here is missing a JavaDoc
public class TestClass {

	// Per definition no JavaDoc is needed
	public static final String TEST = "test";

	// Per definition this suffices
	/**
	 * ok
	 *
	 */
	public static enum ENUM {

	};

	// No description
	String x = "x";

	// No description
	public void noDescription() {

	}

	// Empty JavaDoc
	/** */
	public void empty() {

	}

	// Empty Clauses
	/**
	 * @author @return @throws
	 */
	public void emptyClause() {

	}

	// Clauses in wrong order per definition
	/**
	 * @return void
	 * @param none
	 *
	 */
	public void wrongClauseOrder() {

	}

	// JavaDoc missing
	@Deprecated
	public void missingComment() {

	}

}
