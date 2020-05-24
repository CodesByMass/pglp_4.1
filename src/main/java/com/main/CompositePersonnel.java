package com.main;

import java.util.ArrayList;

public class CompositePersonnel implements Printer {

  private String nomGroupe;
  private ArrayList<Printer> listPersonnel;

  public CompositePersonnel() {
    this.listPersonnel = new ArrayList<Printer>();
    this.nomGroupe = "Uknown";
  }

  public CompositePersonnel(String nom, ArrayList<Printer> liste) {
    this.nomGroupe = nom;
    this.listPersonnel = liste;
  }



  public void print() {
    for (Printer personnel : listPersonnel) {
      personnel.print();
    }
  }

  public void add(Printer personnel) {
    listPersonnel.add(personnel);
  }

  public void delete(Printer personnel) {
    if (listPersonnel.contains(personnel)) {
      listPersonnel.remove(personnel);
    } else {
      throw new IllegalArgumentException("Cet élément n'existe pas");
    }
  }
}
