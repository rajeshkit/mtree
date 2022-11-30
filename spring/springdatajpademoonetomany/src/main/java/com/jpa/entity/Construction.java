package com.jpa.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Construction implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="regno")
	private int companyRegistration;
	@Column(name = "name")
	private String companyName;
	@Column(name="email")
	private String companyEmail;
	@Column(name="profit")
	private long companyProfit;
	@Column(name="addrees")
	private String companyAddrees;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Project> projects;
	
}
