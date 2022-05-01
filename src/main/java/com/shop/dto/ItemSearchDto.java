package com.shop.dto;

import com.shop.constant.ItemSellStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemSearchDto {

    private String searchDateType;  // 상품 등록일

    private ItemSellStatus searchSellStatus;  // 판매 상태

    private String searchBy;  // 유형 선택

    private String searchQuery="";  // 검색 쿼리문
}
