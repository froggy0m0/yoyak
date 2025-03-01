package com.yoyak.yoyak.challenge.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ChallengeArticleResponseDto {

    private Long articleSeq;
    private Long challengeSeq;
    private String imgUrl;
    private String title;

    private String userNickname;
    private Long userSeq;

    private int cheerCnt;
    private LocalDate createdDate;

    private boolean cheered;


}
