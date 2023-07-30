package com.smallworld;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class TransactionDataFetcher {

    private List<Transaction> transactions;

    /**
     * Returns the sum of the amounts of all transactions
     */
    public double getTotalTransactionAmount() {
        double totalAmount = 0;
        for (Transaction transaction : transactions) {
            totalAmount += transaction.getAmount();
        }
        return totalAmount;
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the sum of the amounts of all transactions sent by the specified
     * client
     */
    public double getTotalTransactionAmountSentBy(String senderFullName) {
        double totalAmount = 0;
        for (Transaction transaction : transactions) {
            if (transaction.getSenderFullName().equals(senderFullName)) {
                totalAmount += transaction.getAmount();
            }
        }
        return totalAmount;
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the highest transaction amount
     */
    public double getMaxTransactionAmount() {
        double maxAmount = Double.MIN_VALUE;
        for (Transaction transaction : transactions) {
            if (transaction.getAmount() > maxAmount) {
                maxAmount = transaction.getAmount();
            }
        }
        return maxAmount;
        throw new UnsupportedOperationException();
    }

    /**
     * Counts the number of unique clients that sent or received a transaction
     */
    public long countUniqueClients() {

        Set<String> uniqueClients = new HashSet<>();
        for (Transaction transaction : transactions) {
            uniqueClients.add(transaction.getSenderFullName());
            uniqueClients.add(transaction.getBeneficiaryFullName());
        }
        return uniqueClients.size();
        throw new UnsupportedOperationException();
    }

    /**
     * Returns whether a client (sender or beneficiary) has at least one transaction
     * with a compliance
     * issue that has not been solved
     */
    public boolean hasOpenComplianceIssues(String clientFullName) {
        for (Transaction transaction : transactions) {
            if ((transaction.getSenderFullName().equals(clientFullName)
                    || transaction.getBeneficiaryFullName().equals(clientFullName))
                    && !transaction.isIssueSolved()) {
                return true;
            }
        }
        return false;
        throw new UnsupportedOperationException();
    }

    /**
     * Returns all transactions indexed by beneficiary name
     */
    public Map<String, Object> getTransactionsByBeneficiaryName() {

        Map<String, List<Transaction>> transactionsByBeneficiary = new HashMap<>();
        for (Transaction transaction : transactions) {
            String beneficiaryFullName = transaction.getBeneficiaryFullName();
            if (!transactionsByBeneficiary.containsKey(beneficiaryFullName)) {
                transactionsByBeneficiary.put(beneficiaryFullName, new ArrayList<>());
            }
            transactionsByBeneficiary.get(beneficiaryFullName).add(transaction);
        }

        return transactionsByBeneficiary;
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the identifiers of all open compliance issues
     */
    public Set<Integer> getUnsolvedIssueIds() {
        Set<Integer> unsolvedIssueIds = new HashSet<>();

        for (Transaction transaction : transactions) {
            if (!transaction.isIssueSolved()) {
                unsolvedIssueIds.add(transaction.getIssueId());
            }
        }

        return unsolvedIssueIds;
        throw new UnsupportedOperationException();
    }

    /**
     * Returns a list of all solved issue messages
     */
    public List<String> getAllSolvedIssueMessages() {
        List<String> solvedIssueMessages = new ArrayList<>();

        for (Transaction transaction : transactions) {
            if (transaction.isIssueSolved()) {
                solvedIssueMessages.add(transaction.getIssueMessage());
            }
        }

        return solvedIssueMessages;
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the 3 transactions with highest amount sorted by amount descending
     */
    public List<Object> getTop3TransactionsByAmount() {
        List<Transaction> top3Transactions = new ArrayList<>(transactions);

        top3Transactions.sort(Comparator.comparingDouble(Transaction::getAmount).reversed());

        if (top3Transactions.size() > 3) {
            top3Transactions = top3Transactions.subList(0, 3);
        }

        return top3Transactions;
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the sender with the most total sent amount
     */
    public Optional<Object> getTopSender() {
        Map<String, Double> senderTotalAmounts = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getSenderFullName,
                        Collectors.summingDouble(Transaction::getAmount)));

        Optional<Map.Entry<String, Double>> topSenderEntry = senderTotalAmounts.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        return topSenderEntry.map(Map.Entry::getKey);
        throw new UnsupportedOperationException();
    }

}
