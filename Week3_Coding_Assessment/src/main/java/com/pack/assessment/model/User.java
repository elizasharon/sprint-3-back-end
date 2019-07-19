package com.pack.assessment.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;


@Data
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "User")
@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty
    private  long id;

    @XmlElement(name = "USERNAME")
    @Column(name="username")
    private  String username;

    @XmlElement(name = "EMAIL")
    @Column(name="email")
    private  String email;
    
    @XmlElement(name = "PHONE")
    @Column(name="phone")
    private int phone;
    
    @OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="user_id")
    @XmlElement
    private List<Post> posts;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private Address address;
 
}

  