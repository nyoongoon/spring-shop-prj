package com.shop.dto;

import com.shop.constant.ItemSellStatus;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ItemSearchDto {    //검색 조건 Dto
    private String searchDateType;
    private ItemSellStatus searchSellStatus;
    private String searchBy; // 검색 유형 => 1. itemNm // 2. createdBy
    private String searchQuery = "";  //조회할 검색어 저장할 변수.
}
