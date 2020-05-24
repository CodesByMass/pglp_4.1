package com.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import com.main.Personnel.Builder;

public enum App {
  ANNUAIRE;


  private CompositePersonnel init() {
    Builder b1 = new Builder("Massyl", "Selmi", "Informaticien")
        .addBirthDate(LocalDate.parse("1998-09-07", DateTimeFormatter.ISO_DATE))
        .addNumber(new PhoneNumber("Mobile", "00000000000"))
        .addNumber(new PhoneNumber("Domicile", "000000000"));

    Builder b2 = new Builder("Yumi", "Chastan", "Avocate")
        .addBirthDate(LocalDate.parse("1999-15-06", DateTimeFormatter.ISO_DATE))
        .addNumber(new PhoneNumber("Mobile", "111111111111"))
        .addNumber(new PhoneNumber("Domicile", "11111111111111"));
    Personnel p1 = b1.build();
    Personnel p2 = b1.build();
    Personnel p3 = b2.build();
    CompositePersonnel cp1 = new CompositePersonnel();
    CompositePersonnel cp2 = new CompositePersonnel();
    cp1.add(p1);
    cp1.add(p3);
    cp2.add(p2);
    cp1.add(cp2);
    return cp1;
  }

  private void run(String[] args) {
    CompositePersonnel cp1 = init();


  }

  public static void main(String[] args) {
    ANNUAIRE.run(args);
  }
}

