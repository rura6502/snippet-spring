package io.github.rura6502.extend_example.table_per_class;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Professor1
 */
@Entity
@Data
@NoArgsConstructor
// 상위 클래스의 dtype에 들어갈 값을 지정한다.
@DiscriminatorValue("professor")
public class Professor3 extends Member3 {

  private String profRoomId;

  
}