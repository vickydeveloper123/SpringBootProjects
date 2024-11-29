/*
 * package com.example.demo.entity;
 * 
 * import java.time.LocalDate; import java.time.LocalDateTime;
 * 
 * import org.hibernate.annotations.CreationTimestamp; import
 * org.hibernate.annotations.GenericGenerator; import
 * org.hibernate.annotations.UpdateTimestamp;
 * 
 * import jakarta.persistence.Column; import jakarta.persistence.GeneratedValue;
 * import jakarta.persistence.Id; import lombok.ToString;
 * 
 * public class Passport {
 * 
 * 
 * @Id
 * 
 * @GeneratedValue(generator= "passport_id_generator")
 * 
 * @GenericGenerator(name="passport_id_generator", strategy =
 * "com.datajpa.generators.PassportIdGenerator")
 * 
 * @Column(name = "passport_id", nullable = false, updatable = false) private
 * String passportId; private String passportNumber; private String
 * passportCountry;
 * 
 * @CreationTimestamp
 * 
 * @Column(name = "Created_Time", updatable = false ) private LocalDate
 * createdTime;
 * 
 * @UpdateTimestamp
 * 
 * @Column(name = "Updated_Time", insertable = false) private LocalDateTime
 * updatedTime;
 * 
 * 
 * @OneToOne
 * 
 * @JoinColumn(name = "user_id")
 * 
 * @ToString.Exclude
 * 
 * private User user;
 * 
 * 
 * 
 * 
 * }
 */