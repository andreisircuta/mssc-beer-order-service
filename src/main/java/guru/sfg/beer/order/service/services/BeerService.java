package guru.sfg.beer.order.service.services;

import common.model.BeerDto;

import java.util.Optional;
import java.util.UUID;

public interface BeerService {
    Optional<BeerDto> getBeerById(UUID beerId);
    Optional<BeerDto> getBeerByUpc(String upc);
}
