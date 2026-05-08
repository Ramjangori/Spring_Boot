package com.h.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BloodGroupDto {
    private BloodGroup bloodGroup;
    private long count;
}
