/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.vu.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ORDERS")
@NamedQueries({
        @NamedQuery(name = "Order.findAll", query = "SELECT s FROM Order s")
})
@Getter
@Setter
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    @CreationTimestamp
    private Timestamp date;

    @Column
    private String comment;

    @Version
    @Column
    private Integer optLockVersion;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToMany
    private List<ProductCategory> productCategoryList = new ArrayList<>();
}
