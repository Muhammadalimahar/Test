class Transaction {
    private String mtn;
    private double amount;
    private String senderFullName;
    private int senderAge;
    private String beneficiaryFullName;
    private int beneficiaryAge;
    private int issueId;
    private boolean issueSolved;
    private String issueMessage;

    public Transaction(String mtn, double amount, String senderFullName, int senderAge, String beneficiaryFullName,
				int beneficiaryAge, int issueId, boolean issueSolved, String issueMessage) {
			super();
			this.mtn = mtn;
			this.amount = amount;
			this.senderFullName = senderFullName;
			this.senderAge = senderAge;
			this.beneficiaryFullName = beneficiaryFullName;
			this.beneficiaryAge = beneficiaryAge;
			this.issueId = issueId;
			this.issueSolved = issueSolved;
			this.issueMessage = issueMessage;
		}

    /**
     * @return the mtn
     */
    public String getMtn() {
        return mtn;
    }

    /**
     * @param mtn the mtn to set
     */
    public void setMtn(String mtn) {
        this.mtn = mtn;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the senderFullName
     */
    public String getSenderFullName() {
        return senderFullName;
    }

    /**
     * @param senderFullName the senderFullName to set
     */
    public void setSenderFullName(String senderFullName) {
        this.senderFullName = senderFullName;
    }

    /**
     * @return the senderAge
     */
    public int getSenderAge() {
        return senderAge;
    }

    /**
     * @param senderAge the senderAge to set
     */
    public void setSenderAge(int senderAge) {
        this.senderAge = senderAge;
    }

    /**
     * @return the beneficiaryFullName
     */
    public String getBeneficiaryFullName() {
        return beneficiaryFullName;
    }

    /**
     * @param beneficiaryFullName the beneficiaryFullName to set
     */
    public void setBeneficiaryFullName(String beneficiaryFullName) {
        this.beneficiaryFullName = beneficiaryFullName;
    }

    /**
     * @return the beneficiaryAge
     */
    public int getBeneficiaryAge() {
        return beneficiaryAge;
    }

    /**
     * @param beneficiaryAge the beneficiaryAge to set
     */
    public void setBeneficiaryAge(int beneficiaryAge) {
        this.beneficiaryAge = beneficiaryAge;
    }

    /**
     * @return the issueId
     */
    public int getIssueId() {
        return issueId;
    }

    /**
     * @param issueId the issueId to set
     */
    public void setIssueId(int issueId) {
        this.issueId = issueId;
    }

    /**
     * @return the issueSolved
     */
    public boolean isIssueSolved() {
        return issueSolved;
    }

    /**
     * @param issueSolved the issueSolved to set
     */
    public void setIssueSolved(boolean issueSolved) {
        this.issueSolved = issueSolved;
    }

    /**
     * @return the issueMessage
     */
    public String getIssueMessage() {
        return issueMessage;
    }

    /**
     * @param issueMessage the issueMessage to set
     */
    public void setIssueMessage(String issueMessage) {
        this.issueMessage = issueMessage;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "mtn='" + mtn + '\'' +
                ", amount=" + amount +
                ", senderFullName='" + senderFullName + '\'' +
                ", senderAge=" + senderAge +
                ", beneficiaryFullName='" + beneficiaryFullName + '\'' +
                ", beneficiaryAge=" + beneficiaryAge +
                ", issueId=" + issueId +
                ", issueSolved=" + issueSolved +
                ", issueMessage='" + issueMessage + '\'' +
                '}';
    }
}