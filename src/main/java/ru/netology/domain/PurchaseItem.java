package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor

public class PurchaseItem {
    private int id;
    private String filmName;
    private String filmGenre;
}
