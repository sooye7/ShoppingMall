package com.shop.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class OrderItem {
    @Id
    @GeneratedValue
    @Column(name="order_item_id")
    private Long id;

    // 단방향
    @ManyToOne(fetch=FetchType.LAZY)  // 지연로딩
    @JoinColumn(name="item_id")  // 외래키
    private Item item;

    // 양방향
    @ManyToOne(fetch=FetchType.LAZY) // 지연로딩
    @JoinColumn(name="order_id") //외래키 -> 주인, 읽기 쓰기 가능
    private Order order;

    private int orderPrice;

    private int count;

    private LocalDateTime regTime;
    private LocalDateTime updateTime;
}
