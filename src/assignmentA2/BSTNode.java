package assignmentA2;

public class BSTNode {
	
	private Profile researcher;
	
	private BSTNode l, r;

	/**
	 * @param researcher
	 */
	public BSTNode(Profile researcher) {
		this.researcher = researcher;
		this.l = null;
		this.r = null;
	}

	/**
	 * @return
	 */
	public Profile getResearcher() {
		return researcher;
	}

	/**
	 * @param researcher
	 */
	public void setResearcher(Profile researcher) {
		this.researcher = researcher;
	}

	/**
	 * @return
	 */
	public BSTNode getL() {
		return l;
	}

	/**
	 * @param l
	 */
	public void setL(BSTNode l) {
		this.l = l;
	}

	/**
	 * @return
	 */
	public BSTNode getR() {
		return r;
	}

	/**
	 * @param r
	 */
	public void setR(BSTNode r) {
		this.r = r;
	}
}
