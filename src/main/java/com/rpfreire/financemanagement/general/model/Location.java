package com.rpfreire.financemanagement.general.model;

import com.rpfreire.financemanagement.catalog.model.Address;
import com.rpfreire.financemanagement.catalog.model.Phone;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class Location {
    private String locationCategory;
    private Address address;
    private List<Phone> phoneList;
}
