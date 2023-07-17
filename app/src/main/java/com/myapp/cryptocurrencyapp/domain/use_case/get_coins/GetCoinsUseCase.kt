package com.myapp.cryptocurrencyapp.domain.use_case.get_coins

import com.myapp.cryptocurrencyapp.common.Resource
import com.myapp.cryptocurrencyapp.data.remote.dto.toCoin
import com.myapp.cryptocurrencyapp.data.repository.CoinRepository
import com.myapp.cryptocurrencyapp.domain.model.Coin
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(private val repository: CoinRepository) {
    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading<List<Coin>>())
            val coins = repository.getCoins().map { it.toCoin() }
            emit(Resource.Success<List<Coin>>(coins))
        } catch (e: HttpException) {
            emit(Resource.Error<List<Coin>>(e.localizedMessage ?: "An unexpected error occured"))
        } catch (e: IOException) {
            emit(
                Resource.Error<List<Coin>>(
                    e.localizedMessage ?: "Couldn't Reach server check your internet connection"
                )
            )
        }
    }
}