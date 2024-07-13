package org.example.springdataexample.document;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.io.Serializable;
import java.util.Date;

/**
 * @author chenmoand
 */
@Data
@Document(indexName = "person_document")
public class PersonDocument implements Serializable {

    @Id
    private Long id;

    @Field
    private String name;

    @Field
    private String email;

    @Field
    private String phone;

    @Field
    @CreatedDate
    private Date createDate;

    @Field
    @LastModifiedDate
    private Date updateDate;


}
