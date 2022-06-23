package com.shop.dto;

import com.shop.entity.ItemImg;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter
@Setter
public class ItemImgDto {
    private Long id;
    private String imgName;
    private String oriImgName;
    private String imgUrl;
    private String repImgYn;
    private static ModelMapper modelMapper = new ModelMapper();

    public static ItemImgDto of(ItemImg itemImg){ // ItemImg 엔티티 객체를 받아서 타입과 멤버변수의 이름이 같을 때 ItemImgDto로 값 복사 반환.
        return modelMapper.map(itemImg, ItemImgDto.class);
    }
}
