package org.example.springdataexample.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.util.Date;

/**
 * @author chenmoand
 */
@Data
@Entity
@Table(name = "item")
public class ItemEntity implements Serializable {

    @Id
    private String id;

    @Column
    private String name;

    @Column
    private Integer quantity;

    @Column
    @CreatedDate
    private Date createDate;

    @Column
    @LastModifiedDate
    private Date updateDate;

}
