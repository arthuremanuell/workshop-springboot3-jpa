package com.firemans.web.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firemans.web.course.entities.OrderItem;
import com.firemans.web.course.entities.pk.OrdemItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrdemItemPK> {

}
