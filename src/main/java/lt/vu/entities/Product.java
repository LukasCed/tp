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

@Entity
@Table
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT s FROM Product s"),
    @NamedQuery(name = "Product.findByName", query = "SELECT s FROM Product s WHERE s.name LIKE :name"),
//    @NamedQuery(name = "Student.findByFirstName", query = "SELECT s FROM Student s WHERE s.firstName LIKE :firstName"),
//    @NamedQuery(name = "Student.findByLastName", query = "SELECT s FROM Student s WHERE s.lastName LIKE :lastName"),
//    @NamedQuery(name = "Student.findByRegistrationNo", query = "SELECT s FROM Student s WHERE s.registrationNo = :registrationNo")
})
@Getter
@Setter
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Size(min = 3, max = 20)
    @Column
    private String name;

    @JoinColumn(name = "product_category_id", referencedColumnName = "id")
    @ManyToOne(cascade = {CascadeType.PERSIST})
    private ProductCategory productCategory;

}
