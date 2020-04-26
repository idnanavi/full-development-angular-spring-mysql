package com.example.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="image_model")
@NoArgsConstructor
@Getter
@Setter

public class ImageModel {
@Id
@Column(name = "id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(name="name")
private String name;
@Column(name="type")
private String type;
@Lob
@Column(name="pic")
private byte[] pic;
public ImageModel(String name, String type, byte[] pic) {
	super();
	this.name = name;
	this.type = type;
	this.pic = pic;
}

}
