package com.yummytummy.util;

import com.yummytummy.models.Order;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {
    public static void saveReceipt(Order order) {
        try {
            // ensure folder exists
            File dir = new File("src/main/resources/receipts");
            if (!dir.exists()) dir.mkdirs();

            String fileName = "src/main/resources/receipts/" +
                    LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss")) + ".txt";

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                writer.write(order.getSummary());
                writer.flush();
            }
            System.out.println("Saved receipt: " + fileName);
        } catch (IOException e) {
            System.out.println("Error saving receipt: " + e.getMessage());
        }
    }
}
