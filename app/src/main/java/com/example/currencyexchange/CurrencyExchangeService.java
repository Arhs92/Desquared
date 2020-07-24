package com.example.currencyexchange;

import retrofit2.Call;
import retrofit2.http.GET;


public interface CurrencyExchangeService {
    @GET("latest?access_key=7572f189b646bdff1c94d875dde599e0")
    Call<CurrencyExchange> loadCurrencyExchange();
}
