package com.example.Student_Library_Management_System.DTOs.Request;

import com.example.Student_Library_Management_System.Enums.TransactionStatus;
import com.example.Student_Library_Management_System.Enums.TransactionType;

public class addTransactionDTO {

    private int fineAmount;

    private TransactionStatus transactionStatus;

    private TransactionType transactionType;
}
