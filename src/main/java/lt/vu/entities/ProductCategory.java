/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.vu.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
//@NamedQueries({
//    @NamedQuery(name = "University.findAll", query = "SELECT u FROM University u"),
//    @NamedQuery(name = "University.findById", query = "SELECT u FROM University u WHERE u.id = :id"),
//    @NamedQuery(name = "University.findByTitle", query = "SELECT u FROM University u WHERE u.title = :title"),
//    @NamedQuery(name = "University.findByOptLockVersion", query = "SELECT u FROM University u WHERE u.optLockVersion = :optLockVersion")})
@Getter
@Setter
public class ProductCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Size(max = 50)
    @Column(name = "TITLE")
    private String title;

    @OneToMany(mappedBy = "productCategory")
    private List<Product> productList = new ArrayList<>();

    @ManyToMany
    private List<Order> orderList = new ArrayList<>();
}
