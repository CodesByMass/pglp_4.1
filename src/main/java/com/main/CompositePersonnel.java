package com.main;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Classe composite avec une collection de Personnel.
 *
 * @see Personnel
 *
 * @author Mass'
 *
 */
public class CompositePersonnel implements PrintPersonnel, Iterable<PrintPersonnel> {

  private String nomGroupe;
  private ArrayList<PrintPersonnel> listPersonnel;

  public CompositePersonnel() {
    this.listPersonnel = new ArrayList<PrintPersonnel>();
    this.nomGroupe = "Uknown";
  }

  public String getNomGroupe() {
    return nomGroupe;
  }

  public CompositePersonnel(String nom, ArrayList<PrintPersonnel> liste) {
    this.nomGroupe = nom;
    this.listPersonnel = liste;
  }



  public ArrayList<PrintPersonnel> getPersonnel() {
    return listPersonnel;
  }

  @Override
  public void print() {
    for (PrintPersonnel personnel : listPersonnel) {
      personnel.print();
    }
  }

  public void add(PrintPersonnel personnel) {
    listPersonnel.add(personnel);
  }

  public void delete(PrintPersonnel personnel) {
    if (listPersonnel.contains(personnel)) {
      listPersonnel.remove(personnel);
    } else {
      throw new IllegalArgumentException("Cet �l�ment n'existe pas");
    }
  }

  /**
   * Implémentation de la méthode itérateur.
   */
  @Override
  public Iterator<PrintPersonnel> iterator() {
    // TODO Auto-generated method stub
    return this.listPersonnel.iterator();
  }
}
