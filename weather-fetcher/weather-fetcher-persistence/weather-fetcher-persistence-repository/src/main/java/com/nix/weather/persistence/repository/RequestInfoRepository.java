package com.nix.weather.persistence.repository;

import com.nix.weather.persistence.entity.RequestInfo;

public interface RequestInfoRepository {

    void save(RequestInfo requestInfo);

}
