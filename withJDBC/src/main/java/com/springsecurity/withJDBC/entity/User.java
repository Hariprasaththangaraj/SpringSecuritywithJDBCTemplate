package com.springsecurity.withJDBC.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cache.annotation.Cacheable;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "user")
//@Cacheable
@NoArgsConstructor
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "mobile_number")
    private String mobileNumber;

//    @ManyToMany
//    @JoinTable(name = "user_department")
//    private List<DepartmentDetails> department;
//
//    @ManyToMany
//    @JoinTable(name = "user_unit")
//    private List<UnitDetails> unitDetails;

    @Column(name = "title")
    private String title;

    @Column(name = "language")
    private String language;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "modified_date")
    private Date modifiedDate;

    @Column(name = "is_enabled")
    private boolean isEnabled;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "reset_token")
    private String resetToken;

    @Column(name = "expiry_time")
    private Date expiryTime;

    // used to save the time of otp verification for reset password
    @Column(name = "verify_time")
    private Date verifyTime;

    /**
     * Example {enable}TICKET_READ, {disable}TICKET_WRITE
     * <p>
     * if disabled privilege is not in role ignore
     * if enabled privilege is in role ignore
     * <p>
     * and also if there are any dangling entries found with above criteria remove while authenticating
     */
//    @Column(name = "custom_privilege")
//    @Convert(converter = ListToStringConverter.class)
//    private List<String> customPrivilege;
//
//    @ManyToMany
//    private Collection<Role> roles;

}
