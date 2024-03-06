package com.dave.the.diver.entity;


import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter
@Table(name = "profile")
public class Profile {

    enum AccountType {
        KAKAO, NAVER
    }

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "profile_Id", nullable = false, length = 50)
    private String profileId;

    private String accountId;

    private String nickname;

    private AccountType accountType;
}
