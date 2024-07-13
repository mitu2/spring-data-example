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
@Table(name = "person")
public class PersonEntity implements Serializable {

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    @CreatedDate
    private Date createDate;

    @Column
    @LastModifiedDate
    private Date updateDate;

}
