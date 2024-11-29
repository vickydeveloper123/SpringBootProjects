/*
 * package com.example.demo.entity;
 * 
 * import org.hibernate.annotations.GenericGenerator;
 * 
 * import jakarta.persistence.CascadeType; import jakarta.persistence.Column;
 * import jakarta.persistence.FetchType; import
 * jakarta.persistence.GeneratedValue; import jakarta.persistence.Id; import
 * jakarta.persistence.OneToOne; import lombok.ToString;
 * 
 * public class User {
 * 
 * @Id
 * 
 * @GeneratedValue(generator = "user_id_generator")
 * 
 * @GenericGenerator(name = "user_id_generator", strategy =
 * "com.datajpa.generators.UserIdGenerator")
 * 
 * @Column(name = "user_id", nullable = false, updatable = false) private String
 * userId; private String userName; private Long userNumber; private String
 * userEmail;
 * 
 * @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch =
 * FetchType.EAGER)
 * 
 * @ToString.Exclude private Passport passport;
 * 
 * 
 * }
 */