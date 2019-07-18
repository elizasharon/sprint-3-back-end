package com.pack.springswagger.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import java.io.Serializable;


@Data
@RequiredArgsConstructor
@AllArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "Product")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product implements Serializable{

	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty
    private  int id;

    @XmlElement(name = "NAME")
    @Column(name="product_name")
    private  String name;

    @NotNull
    @XmlElement
    @Column(name="product_price")
    private double price;
	
    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
