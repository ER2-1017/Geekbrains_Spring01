package web_application.domain;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

  @Id
  @GeneratedValue
  @Column(name = "id")
  private Long id;
  
  @Column(name = "title")
  private String title;
  
  @Column(name = "cost")
  private Double cost;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Double getCost() {
    return cost;
  }

  public void setCost(Double cost) {
    this.cost = cost;
  }

  public Product() { }

  public Product(Long id, String title, Double cost) {
    this.id = id;
    this.title = title;
    this.cost = cost;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, cost);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || obj.getClass() != this.getClass()) return false;
    Product p = (Product) obj;
    return Objects.equals(p.id, id) && Objects.equals(p.title, title) && Objects.equals(p.cost, cost);
  }

  @Override
  public String toString() {
    return String.format("ID: %d, title: %s, cost: %f", id, title, cost);
  }
  
}
