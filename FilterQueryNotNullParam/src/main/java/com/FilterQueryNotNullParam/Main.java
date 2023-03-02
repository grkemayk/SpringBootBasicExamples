package com.FilterQueryNotNullParam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        /*
            @Query(value = "SELECT u from ProductEntity u where (:region is null or u.storage.address.region = :region) and (:city is null or u.storage.address.city = :city) and (:fullAddress is null or u.storage.address.fullAddress = :fullAddress) and (:category is null or u.category = :category)")
            List<ProductEntity> filterProductEntity(@Param("region") Regions region, @Param("city") String city, @Param("fullAddress") String fullAddress, @Param("category") CategoryEntity category);

            şeklinde filtreleme yapacak query yazılabilir.
         */
    }
}